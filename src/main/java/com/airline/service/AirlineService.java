package com.airline.service;

import java.util.List;

import com.airline.dto.AirlineDTO;

public interface AirlineService {
	public List<AirlineDTO> getAirlineList(String countryName);
	public List<AirlineDTO> getAirlineByIATA(String IATA);
	public List<AirlineDTO> getAirlineByICAO(String ICAO);
	public List<AirlineDTO> getActiveAirlines();
	public List<AirlineDTO> getInActiveAirlines();
}
