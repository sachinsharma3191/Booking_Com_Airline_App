package com.airline.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.airline.dto.AirportDTO;

@Transactional
@Repository
public class AirportDAOImpl implements AirportDAO {

	@Autowired
	SessionFactory sessionFactory;

	@Override
	public List<AirportDTO> getAirportList() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		List<AirportDTO> planeList = session.createQuery("From Airport").list();
		return planeList;
	}

	@Override
	public List<AirportDTO> getAirportByCountry(String country) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		List<AirportDTO> planeList = session.createQuery("From Airport where country = :country")
				.setString("country", country).list();
		return planeList;
	}

	@Override
	public List<AirportDTO> getAirportByIATA(String iataCode) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		List<AirportDTO> planeList = session.createQuery("From Airport where iata = :iata").setString("iata", iataCode)
				.list();
		return planeList;
	}

	@Override
	public List<AirportDTO> getAirportByICAO(String icaoCode) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		List<AirportDTO> planeList = session.createQuery("From Airport where icao = :icao").setString("icao", icaoCode)
				.list();
		return planeList;
	}

}