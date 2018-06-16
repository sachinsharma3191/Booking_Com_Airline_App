package com.airline.service;

import java.util.List;

import com.airline.dto.RouteDTO;

public interface RouteService {
	public List<RouteDTO> getRouteList(String sourceCity, String destinationCity);
}
