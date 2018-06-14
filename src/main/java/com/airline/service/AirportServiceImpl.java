package com.airline.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.airline.dao.AirportDAO;
import com.airline.dto.AirportDTO;

@Transactional
@Service
public class AirportServiceImpl implements AirportService {

	@Autowired
	AirportDAO airportDAO;

	@Override
	public List<AirportDTO> getAirportList() {
		// TODO Auto-generated method stub
		return airportDAO.getAirportList();
	}

	@Override
	public List<AirportDTO> getAirportByCountry(String country) {
		// TODO Auto-generated method stub
		return airportDAO.getAirportByCountry(country);
	}

	@Override
	public List<AirportDTO> getAirportByIATA(String iataCode) {
		// TODO Auto-genearated method stub
		return airportDAO.getAirportByIATA(iataCode);
	}

	@Override
	public List<AirportDTO> getAirportByICAO(String icaoCode) {
		// TODO Auto-generated method stub
		return airportDAO.getAirportByICAO(icaoCode);
	}

}
