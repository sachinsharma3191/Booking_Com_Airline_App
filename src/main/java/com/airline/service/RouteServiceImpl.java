package com.airline.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.airline.dao.RouteDAO;
import com.airline.dto.RouteDTO;

@Transactional
@Service
public class RouteServiceImpl implements RouteService {

	@Autowired
	RouteDAO routeDAO;

	@Override
	public List<RouteDTO> getRouteList(String sourceCity, String destinationCity) {
		return routeDAO.getRouteList(sourceCity, destinationCity);
	}

}
