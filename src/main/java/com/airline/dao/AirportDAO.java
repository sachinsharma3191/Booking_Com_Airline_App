package com.airline.dao;

import java.util.List;

import com.airline.dto.AirportDTO;

public interface AirportDAO {
	public List<AirportDTO> getAirportList();

	public List<AirportDTO> getAirportByCountry(String country);

	public List<AirportDTO> getAirportByIATA(String iataCode);

	public List<AirportDTO> getAirportByICAO(String icaoCode);
	
	public List<String> getAirportByCity(String city);
	
}
