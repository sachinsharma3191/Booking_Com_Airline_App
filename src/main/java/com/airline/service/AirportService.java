package com.airline.service;

import java.util.List;

import com.airline.dto.AirportDTO;

public interface AirportService {
	public List<AirportDTO> getAirportList();

	public List<AirportDTO> getAirportByCountry(String country);

	public List<AirportDTO> getAirportByIATA(String iataCode);

	public List<AirportDTO> getAirportByICAO(String icaoCode);

}
