package com.airline.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.airline.service.LoadService;

@RestController
@RequestMapping(value = "/load")
public class LoadDataController {

	@Autowired
	LoadService loadService;

	@RequestMapping(value = "/airline", method = RequestMethod.GET)
	public String saveAirlineData() {
		loadService.saveAirlineService();
		return "Data Saved";
	}
	
	@RequestMapping(value = "/airport", method = RequestMethod.GET)
	public String saveAirPortData() {
		loadService.saveAirportService();
		return "Data SAved";
	}

	@RequestMapping(value = "/route", method = RequestMethod.GET)
	public String saveAirRouteData() {
		loadService.saveAirRouteService();
		return "Data SAved";
	}

	@RequestMapping(value = "/plane", method = RequestMethod.GET)
	public String saveAirPlaneData() {
		loadService.saveAirPlaneService();
		return "Data Saved";
	}
}
