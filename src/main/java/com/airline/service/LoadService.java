package com.airline.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.airline.dao.LoadDataDAO;

@Service
@Transactional
public class LoadService {

	@Autowired
	LoadDataDAO save;

	public void saveAirlineService() {
		save.saveAirlineData();
	}

	public void saveAirPlaneService() {
		save.saveAirPlaneData();
	}

	public void saveAirportService() {
		save.saveAirportData();
	}

	public void saveAirRouteService() {
		save.saveAirRouteData();
	}
}
