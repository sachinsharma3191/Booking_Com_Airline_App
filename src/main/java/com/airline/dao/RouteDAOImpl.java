package com.airline.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.airline.dto.RouteDTO;
import com.airline.model.Route;

@Transactional
@Repository
public class RouteDAOImpl implements RouteDAO {

	//@Autowired
	SessionFactory sessionFactory;

	@Autowired
	AirportDAO airportDAO;

	@Override
	public List<RouteDTO> getRouteList(String sourceCity, String destinationCity) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		Criteria crit = session.createCriteria(Route.class);
		crit.add(Restrictions.in("sourceAirport", airportDAO.getAirportByCity(sourceCity)));
		crit.add(Restrictions.in("destinationAirport", airportDAO.getAirportByCity(destinationCity)));
		List<RouteDTO> routeList = new ArrayList<RouteDTO>();
		routeList = crit.list();
		return routeList;
	}
}
