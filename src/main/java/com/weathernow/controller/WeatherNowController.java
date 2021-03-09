/*
 * author: @tridib2003
 */

package com.weathernow.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.weathernow.service.WeatherService;

@Controller
public class WeatherNowController {
	
	@RequestMapping("/weather-forecast")
	public ModelAndView getWeatherForecast(HttpServletRequest request, HttpServletResponse response) {
		
		/* For debug purpose only */
		System.out.println("~~~~~ INFO: inside getWeatherForecast() - WeatherNowController.java ~~~~~");
		
		String location = request.getParameter("area");

		WeatherService ws = new WeatherService();
		ws.getWeatherForecast(location);
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("display-weather.jsp");
		
		mv.addObject("location", location);
		mv.addObject("temperature", ws.temperature);
		mv.addObject("description", ws.description);
		mv.addObject("humidity", ws.humidity);
		mv.addObject("wind_speed", ws.wind_speed);
		mv.addObject("wind_angle", ws.wind_angle);
		
		/* For debug purpose only */
		System.out.println("~~~~~ INFO: exiting getWeatherForecast() - WeatherNowController.java ~~~~~");
		
		return mv;
	}
	
}
