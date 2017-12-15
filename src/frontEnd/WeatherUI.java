package frontEnd;

import java.util.Scanner;
import java.io.IOException;
import businessObjects.WeatherBO;
import service.WeatherService;

public class WeatherUI {
public static void main(String[] args) throws IOException{
	
	//Get the city info
	System.out.println("Enter city");
	String city=new Scanner(System.in).nextLine();
	
	//Get the state info
	System.out.println("Enter state");
	String state=new Scanner(System.in).nextLine();
	
	//get the high
	System.out.println("Enter high");
	int high=new Scanner(System.in).nextInt();
	
	//get the low
	System.out.println("Enter low");
	int low=new Scanner(System.in).nextInt();
	
	WeatherBO weather = new WeatherBO();
		weather.setCity(city);
		weather.setState(state);
		weather.setHigh(high);
		weather.setLow(low);
		
		WeatherService weatherService = new WeatherService();
		System.out.println(weatherService.saveWeather(weather));
}
}
