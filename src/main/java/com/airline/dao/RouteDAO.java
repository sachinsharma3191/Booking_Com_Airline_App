package com.airline.dao;

import java.util.List;

import com.airline.dto.RouteDTO;

public interface RouteDAO {

	public List<RouteDTO> getRouteList(String sourceCity,String destinationCity);
}
