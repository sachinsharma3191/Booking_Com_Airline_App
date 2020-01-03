package com.airline.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.type.StringType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.airline.config.HibernateSessionFactory;
import com.airline.dto.PlaneDTO;

@Transactional
@Repository
public class PlaneDAOImpl implements PlaneDAO {

	@Autowired
	HibernateSessionFactory sessionFactory;

	@Override
	public List<PlaneDTO> getPlaneList(String countryName) {
		// TODO Auto-generated method stub
		String sqlQuery = "select distinct airline.country ,airline.airline_name,plane.plane_name from plane plane "
				+ " join airline airline " + " on plane.iata = airline.iatacode " + " or plane.icao = airline.icaocode "
				+ " where country = '" + countryName + "'";

		Session session = sessionFactory.getSessionFactory().openSession();
		Query query = session.createSQLQuery(sqlQuery).addScalar("country", new StringType())
				.addScalar("airline_name", new StringType()).addScalar("plane_name", new StringType());
		List<Object[]> rows = query.list();
		List<PlaneDTO> planeList = new ArrayList<PlaneDTO>();
		for (Object[] row : rows) {
			PlaneDTO planeDTO = new PlaneDTO();
			planeDTO.setCountryName(row[0].toString());
			planeDTO.setAirlineName(row[1].toString());
			planeDTO.setPlaneName(row[2].toString());
			planeList.add(planeDTO);
		}

		return planeList;
	}

	@Override
	public List<PlaneDTO> getPlaneByIATA(String IATA) {
		// TODO Auto-generated method stub

		Session session = sessionFactory.getSessionFactory().openSession();
		Query query = session.createQuery("From Plane where iata	 = :iata");
		query.setString("iata", IATA);
		List<PlaneDTO> planeList = query.list();
		return planeList;
	}

	@Override
	public List<PlaneDTO> getPlaneByICAO(String ICAO) {
		// TODO Auto-generated method stub

		Session session = sessionFactory.getSessionFactory().openSession();
		Query query = session.createQuery("From Plane where icao = :icao");
		query.setString("icao", ICAO);
		List<PlaneDTO> planeList = query.list();
		return planeList;
	}

	@Override
	public List<PlaneDTO> getAirlineandPlaneInfo(String airlineName) {
		// TODO Auto-generated method stub
		String sqlQuery = "select distinct airline.country ,airline.airline_name,plane.plane_name from plane plane "
				+ " join airline airline " + " on plane.iata = airline.iatacode " + " or plane.icao = airline.icaocode"
				+ " where airline.airline_name = '" + airlineName + "'" + " or plane.icao = '" + airlineName + "'"
				+ " or plane.iata = '" + airlineName + "'";

		Session session = sessionFactory.getSessionFactory().openSession();
		Query query = session.createSQLQuery(sqlQuery).addScalar("country", new StringType())
				.addScalar("airline_name", new StringType()).addScalar("plane_name", new StringType());
		List<Object[]> rows = query.list();
		List<PlaneDTO> planeList = new ArrayList<PlaneDTO>();
		for (Object[] row : rows) {
			System.out.println(row);
			PlaneDTO planeDTO = new PlaneDTO();
			planeDTO.setCountryName(row[0].toString());
			planeDTO.setAirlineName(row[1].toString());
			planeDTO.setPlaneName(row[2].toString());
			planeList.add(planeDTO);
		}

		return planeList;
	}

	@Override
	public List<PlaneDTO> getPlaneList() {
		// TODO Auto-generated method stub

		Session session = sessionFactory.getSessionFactory().openSession();
		Query query = session.createQuery("from Plane");
		List<PlaneDTO> planeList = query.list();
		return planeList;
	}

}
