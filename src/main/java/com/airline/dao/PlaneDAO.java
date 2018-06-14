package com.airline.dao;

import java.util.List;

import com.airline.dto.PlaneDTO;

public interface PlaneDAO {
	public List<PlaneDTO> getPlaneList();
	public List<PlaneDTO> getPlaneList(String countryName);
	public List<PlaneDTO> getPlaneByIATA(String IATA);
	public List<PlaneDTO> getPlaneByICAO(String ICAO);
	public List<PlaneDTO> getAirlineandPlaneInfo(String airlineName);
}
