package service;

import java.io.IOException;

import businessObjects.WeatherBO;
import dataAccess.WeatherDAO;

public class WeatherService {
	
	public String saveWeather(WeatherBO weather) throws IOException {
				
		if(!isWeatherValid(weather)) {
			return "You've entered incorrect weather data";
		}
		else {
			WeatherDAO dao = new WeatherDAO();
			dao.createFileAndSaveWeather(weather);
			return "You've successfully saved the weather data";
		}
		
	}
	
	private boolean isWeatherValid(WeatherBO weather) {
		if(weather.getHigh() > 180 || weather.getLow() < -100) {
			return false;
		}
		else {
			return true;
		}
	}

}
