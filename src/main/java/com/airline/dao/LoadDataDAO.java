package com.airline.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.airline.common.AirlineData;
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

		session.close();
	}

	public void saveAirPlaneData() {
		String[] lines = AirlineData.readAirPlaneFile();
		Session session = sessionFactory.getCurrentSession();
		for (String line : lines) {
			Plane plane = ConvertData.convertToAirPlane(line.replaceAll("\"",""));
			session.save(plane);
			// etc...
		}

		session.close();
	}

	public void saveAirportData() {
		String[] lines = AirlineData.readAirportFile();
		Session session = sessionFactory.getCurrentSession();
		for (String line : lines) {
			
			Airport airport = ConvertData.convertToAirPort(line.replaceAll("\"",""));
			session.save(airport);
	
			// etc...
		}
		session.close();
	}

	public void saveAirRouteData() {
		String[] lines = AirlineData.readAirRouteFile();
		Session session = sessionFactory.getCurrentSession();
		for (String line : lines) {
			
			Route route = ConvertData.convertToRoute(line.replaceAll("\"",""));
			session.save(route);
			// etc...
		}
		session.close();
	}
}
