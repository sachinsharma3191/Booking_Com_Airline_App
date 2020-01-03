package com.airline.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.airline.config.HibernateSessionFactory;
import com.airline.dto.AirlineDTO;

@Transactional
@Repository
public class AirlineDAOImpl implements AirlineDAO {

	@Autowired
	HibernateSessionFactory sessionFactory;

	
	@SuppressWarnings("unchecked")
	@Override
	public List<AirlineDTO> getAirlineList(String countryName) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getSessionFactory().openSession();
		Query query = session.createQuery("from Airline where country =:countryName and is_active = 'Y'");
		query.setString("countryName", countryName);
		List<AirlineDTO> airlineList = query.list();
		// session.close();
		return airlineList;
	}

	@Override
	public List<AirlineDTO> getAirlineByIATA(String IATA) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getSessionFactory().openSession();
		Query query = session.createQuery("From Airline where iatacode = :iata");
		query.setString("iata", IATA);
		List<AirlineDTO> airlineList = query.list();
		// session.close();
		return airlineList;
	}

	@Override
	public List<AirlineDTO> getAirlineByICAO(String ICAO) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getSessionFactory().openSession();
		Query query = session.createQuery("From Airline where icaocode = :icao");
		query.setString("icao", ICAO);
		List<AirlineDTO> airlineList = query.list();
		// session.close();
		return airlineList;
	}

	@Override
	public List<AirlineDTO> getActiveAirlines() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getSessionFactory().openSession();
		Query query = session.createQuery("From Airline where is_active = 'Y'");
		List<AirlineDTO> airlineList = query.list();
		// session.close();
		return airlineList;
	}

	@Override
	public List<AirlineDTO> getInActiveAirlines() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getSessionFactory().openSession();
		Query query = session.createQuery("From Airline where is_active = 'N'");
		List<AirlineDTO> airlineList = query.list();
		// session.close();
		return airlineList;
	}

}
