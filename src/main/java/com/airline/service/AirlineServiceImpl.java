package com.airline.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.airline.dao.AirlineDAO;
import com.airline.dto.AirlineDTO;

@Transactional
@Service
public class AirlineServiceImpl implements AirlineService {

	@Autowired
	AirlineDAO airlineDAO;
	
	@Override
	public List<AirlineDTO> getAirlineList(String countryName) {
		// TODO Auto-generated method stub
		return airlineDAO.getAirlineList(countryName);
	}

	@Override
	public List<AirlineDTO> getAirlineByIATA(String IATA) {
		// TODO Auto-generated method stub
		return airlineDAO.getAirlineByIATA(IATA);
	}

	@Override
	public List<AirlineDTO> getAirlineByICAO(String ICAO) {
		// TODO Auto-generated method stub
		return airlineDAO.getAirlineByICAO(ICAO);
	}

	@Override
	public List<AirlineDTO> getActiveAirlines() {
		// TODO Auto-generated method stub
		return airlineDAO.getActiveAirlines();
	}

	@Override
	public List<AirlineDTO> getInActiveAirlines() {
		// TODO Auto-generated method stub
		return airlineDAO.getInActiveAirlines();
	}

}
