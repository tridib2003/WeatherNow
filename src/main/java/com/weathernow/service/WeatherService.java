/*
 * author: @tridib2003
 */

package com.weathernow.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.*;
import com.google.gson.reflect.*;

class WeatherForecast {
	
	public static Map<String, Object> jsonToMap(String str) {
		Map<String, Object> map = new Gson().fromJson(
			str, new TypeToken<HashMap<String, Object>>() {}.getType()
		);
		return map;
	}
	
	protected double temperature;
	protected double humidity;
	protected double wind_speed;
	protected double wind_angle;
	protected String description;
	
	public void fetchWeatherDetails(String area) {
		
		/* For debug purpose only */
		System.out.println("~~~~~ INFO: entering WeatherForecast.fetchWeatherDetails() - WeatherService.java ~~~~~");
		
		final String API_KEY = "7864d3268f5f10a2143296790b5337ab";
		final String LOCATION = area;
		final String urlString = "http://api.openweathermap.org/data/2.5/weather?q=" + LOCATION + "&appid=" + API_KEY + "&units=metric"; 
		
		try {
			
			StringBuilder result = new StringBuilder();
			URL url = new URL(urlString);
			URLConnection conn = url.openConnection();
			
			BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			
			String line;
			
			while ((line = rd.readLine()) != null) {
				result.append(line);
			}
			
			rd.close();
			
			/* For debug purpose only */
			System.out.println(result);
			
			Map<String, Object> respMap = jsonToMap(result.toString());
			Map<String, Object> mainMap = jsonToMap(respMap.get("main").toString());
			Map<String, Object> windMap = jsonToMap(respMap.get("wind").toString());
			
			ArrayList<Map<String, Object>> weathers = (ArrayList<Map<String, Object>>) respMap.get("weather");
			Map<String, Object> weatherMap = weathers.get(0);
			
			temperature = (Double)mainMap.get("temp");
			humidity = (Double)mainMap.get("humidity");
			wind_speed = (Double)windMap.get("speed");
			wind_angle = (Double)windMap.get("deg");
			description = (String)weatherMap.get("description");
			
		}
		catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		/* For debug purpose only */
		System.out.println("~~~~~ INFO: exiting WeatherForecast.fetchWeatherDetails() - WeatherService.java ~~~~~");
	}	
	
}


public class WeatherService {
	
	public int temperature;
	public double humidity;
	public double wind_speed;
	public double wind_angle;
	public String description;
	
	public void getWeatherForecast(String loc) {
		
		/* For debug purpose only */
		System.out.println("~~~~~ INFO: entering getWeatherForecast() - WeatherService.java ~~~~~");
		
		WeatherForecast weatherForecastObj = new WeatherForecast();
		
		weatherForecastObj.fetchWeatherDetails(loc);
		
		this.temperature = (int)weatherForecastObj.temperature;
		this.humidity = weatherForecastObj.humidity;
		this.wind_speed = weatherForecastObj.wind_speed;
		this.wind_angle = weatherForecastObj.wind_angle;
		this.description = weatherForecastObj.description;
		
		/* For debug purpose only */
		System.out.println("~~~~~ INFO: exiting getWeatherForecast() - WeatherService.java ~~~~~");
	}
	
}
