package com.airline.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.airline.common.CommonUtil;
import com.airline.dto.RouteDTO;

@Transactional
@Repository
public class RouteDAOImpl implements RouteDAO {

	@Autowired
	SessionFactory sessionFactory;

	@Override
	public List<RouteDTO> getRouteList(String sourceCity, String destinationCity) {
		// TODO Auto-generated method stub
		String sqlQuery = new StringBuffer(
				"select * from route where destination_airport in (select iata from airport where city = '")
						.append(destinationCity).append("') ")
						.append(" and source_airport in (select iata from airport where city = '")
						.append(sourceCity).append("')").toString();
		System.out.println(sqlQuery);
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createSQLQuery(sqlQuery);
		List<Object[]> rows = query.list();
		List<RouteDTO> routeList = new ArrayList<RouteDTO>();
		for (Object[] row : rows) {
			if (row.length > 0) {
				RouteDTO routeDTO = new RouteDTO();
				routeDTO.setRouteId(Integer.parseInt(row[0].toString()));
				routeDTO.setAirlineId(row[1].toString());
				routeDTO.setAirlineName(row[2].toString());
				routeDTO.setDepartureTime(CommonUtil.convertStringToDate(row[5].toString()).toString());
				routeDTO.setArrivalTime(CommonUtil.convertStringToDate(row[3].toString()).toString());
				routeDTO.setDestinationAirport(row[6].toString());
				routeDTO.setDestinationAirportId(row[7].toString());
				routeDTO.setEquipment(row[8].toString());
				routeDTO.setNumberOfStops(row[9].toString());
				routeDTO.setSourceAirport(row[10].toString());
				routeDTO.setSourceAirportId(row[11].toString());
				routeList.add(routeDTO);
			}
		}
		return routeList;
	}
}
