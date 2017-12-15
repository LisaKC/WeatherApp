package dataAccess;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDate;

import businessObjects.WeatherBO;

public class WeatherDAO {
	
	public void createFileAndSaveWeather(WeatherBO weather) throws IOException {
		
		String outputData= "City: " + weather.getCity() + "\n"
				+ "State: " + weather.getState() + "\n"
				+ "High: " + weather.getHigh() + "\n"
				+ "Low: " + weather.getLow();
		FileOutputStream outputStream = new FileOutputStream("/Users/lisaciaccio/Desktop/" 
		+ weather.getCity() 
		+ LocalDate.now() 
		+ "Weather.txt");
		
		outputStream.write(outputData.getBytes());
		outputStream.close();
		
	}

}
