package com.airline.dao;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.file.Files;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.airline.common.AirlineAbstractFactory;
import com.airline.common.AirlineData;
import com.airline.common.ClassFinder;
import com.airline.common.ConvertData;
import com.airline.model.Airline;
import com.airline.model.Airport;
import com.airline.model.Plane;
import com.airline.model.Route;

@Transactional
@Repository
public class LoadDataDAO {

	@Autowired
	SessionFactory sessionFactory;

	public void saveAirlineData()  {
		String[] lines = AirlineData.readAirlineFile();
		Session session = sessionFactory.openSession();
		for (String line : lines) {
			Airline airline = ConvertData.convertToAirline(line.replaceAll("\"",""));
			session.save(airline);
			// etc...
		}
	}

	public void saveAirPlaneData() {
		String[] lines = AirlineData.readAirPlaneFile();
		Session session = sessionFactory.openSession();
		for (String line : lines) {
			Plane plane = ConvertData.convertToAirPlane(line.replaceAll("\"",""));
			session.save(plane);
			// etc...
		}
	}

	public void saveAirportData() {
		String[] lines = AirlineData.readAirportFile();
		Session session = sessionFactory.openSession();
		for (String line : lines) {
			
			Airport airport = ConvertData.convertToAirPort(line.replaceAll("\"",""));
			session.save(airport);
	
			// etc...
		}
		session.close();
	}

	public void saveAirRouteData() {
		String[] lines = AirlineData.readAirRouteFile();
		Session session = sessionFactory.openSession();
		for (String line : lines) {
			
			Route route = ConvertData.convertToRoute(line.replaceAll("\"",""));
			session.save(route);
			// etc...
		}
	}
}
