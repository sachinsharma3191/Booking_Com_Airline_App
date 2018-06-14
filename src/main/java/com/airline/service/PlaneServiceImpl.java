package com.airline.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.airline.dao.PlaneDAO;
import com.airline.dto.PlaneDTO;

@Transactional
@Service
public class PlaneServiceImpl implements PlaneService {

	@Autowired
	PlaneDAO planeDAO;
	
	@Override
	public List<PlaneDTO> getPlaneList(String countryName) {
		// TODO Auto-generated method stub
		return planeDAO.getPlaneList(countryName);
	}

	@Override
	public List<PlaneDTO> getPlaneByIATA(String IATA) {
		// TODO Auto-generated method stub
		return planeDAO.getPlaneByIATA(IATA);
	}

	@Override
	public List<PlaneDTO> getPlaneByICAO(String ICAO) {
		// TODO Auto-generated method stub
		return planeDAO.getPlaneByICAO(ICAO);
	}

	@Override
	public List<PlaneDTO> getAirlineandPlaneInfo(String airlineName){
		// TODO Auto-generated method stub
		return planeDAO.getAirlineandPlaneInfo(airlineName);
	}

	@Override
	public List<PlaneDTO> getPlaneList() {
		// TODO Auto-generated method stub
		return planeDAO.getPlaneList();
	}

}
