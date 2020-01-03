package com.airline.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.airline.common.CommonUtil;
import com.airline.config.HibernateSessionFactory;
import com.airline.dto.AirportDTO;
import com.airline.model.Airport;

@Transactional
@Repository
public class AirportDAOImpl implements AirportDAO {

	@Autowired
	HibernateSessionFactory sessionFactory;

	@Override
	public List<AirportDTO> getAirportList() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getSessionFactory().openSession();
		List<AirportDTO> planeList = session.createQuery("From Airport").list();
		return planeList;
	}

	@Override
	public List<AirportDTO> getAirportByCountry(String country) {
		// TODO Auto-generated method stub

		Session session = sessionFactory.getSessionFactory().openSession();
		List<AirportDTO> planeList = session.createQuery("From Airport where country = :country")
				.setString("country", country).list();
		return planeList;
	}

	@Override
	public List<AirportDTO> getAirportByIATA(String iataCode) {
		// TODO Auto-generated method stub

		Session session = sessionFactory.getSessionFactory().openSession();
		List<AirportDTO> planeList = session.createQuery("From Airport where iata = :iata").setString("iata", iataCode)
				.list();
		return planeList;
	}

	@Override
	public List<AirportDTO> getAirportByICAO(String icaoCode) {
		// TODO Auto-generated method stub

		Session session = sessionFactory.getSessionFactory().openSession();
		List<AirportDTO> planeList = session.createQuery("From Airport where icao = :icao").setString("icao", icaoCode)
				.list();
		return planeList;
	}

	@Override
	public List<String> getAirportByCity(String city) {
		// TODO Auto-generated method stub

		Session session = sessionFactory.getSessionFactory().openSession();
		Criteria crit = session.createCriteria(Airport.class);
		crit.add(Restrictions.isNotNull("IATA"));
		crit.add(Restrictions.eqOrIsNull("city", city));
		crit.setProjection(Projections.property("IATA"));

		List<String> rows = crit.list();
		List<String> iataCodes = null;
		iataCodes = crit.list();
		if (CommonUtil.isNotEmptyList(rows)) {
			iataCodes = new ArrayList<String>();
			for (String row : rows) {
				if (CommonUtil.isNotNullOrEmptyString(row)) {
					iataCodes.add(row);
				}

			}
		}

		for (String row : iataCodes) {

		}
		return iataCodes;
	}

}
