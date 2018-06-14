package com.airline.service;

import java.util.List;

import com.airline.dto.PlaneDTO;

public interface PlaneService {
	public List<PlaneDTO> getPlaneList();

	public List<PlaneDTO> getPlaneList(String countryName);

	public List<PlaneDTO> getPlaneByIATA(String IATA);

	public List<PlaneDTO> getPlaneByICAO(String ICAO);

	public List<PlaneDTO> getAirlineandPlaneInfo(String airlineName);

}
