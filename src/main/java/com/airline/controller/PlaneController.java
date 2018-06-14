package com.airline.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.airline.dto.PlaneDTO;
import com.airline.service.PlaneService;

@RestController
@RequestMapping(value = "/Plane")
public class PlaneController {

	@Autowired
	PlaneService planeService;

	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public ResponseEntity<List<PlaneDTO>> getPlanesList() {
		List<PlaneDTO> list = planeService.getPlaneList();
		HttpStatus httpStatus = !list.isEmpty() ? HttpStatus.OK : HttpStatus.NOT_FOUND;
		return new ResponseEntity<List<PlaneDTO>>(list, httpStatus);
	}

	@RequestMapping(value = "/country/{countryName}", method = RequestMethod.GET)
	public ResponseEntity<List<PlaneDTO>> getPlanesByCountry(@PathVariable("countryName") String countryName) {
		List<PlaneDTO> list = planeService.getPlaneList(countryName);
		HttpStatus httpStatus = !list.isEmpty() ? HttpStatus.OK : HttpStatus.NOT_FOUND;
		return new ResponseEntity<List<PlaneDTO>>(list, httpStatus);

	}

	@RequestMapping(value = "/iata/{IATA}", method = RequestMethod.GET)
	public ResponseEntity<List<PlaneDTO>> getPlanesByIATA(@PathVariable("IATA") String IATA) {
		List<PlaneDTO> list = planeService.getPlaneByIATA(IATA);
		HttpStatus httpStatus = !list.isEmpty() ? HttpStatus.OK : HttpStatus.NOT_FOUND;
		return new ResponseEntity<List<PlaneDTO>>(list, httpStatus);
	}

	@RequestMapping(value = "/icao/{ICAO}", method = RequestMethod.GET)
	public ResponseEntity<List<PlaneDTO>> getPlanesByICAO(@PathVariable("ICAO") String ICAO) {
		List<PlaneDTO> list = planeService.getPlaneByICAO(ICAO);
		HttpStatus httpStatus = !list.isEmpty() ? HttpStatus.OK : HttpStatus.NOT_FOUND;
		return new ResponseEntity<List<PlaneDTO>>(list, httpStatus);
	}

	@RequestMapping(value = "/airline/{name}", method = RequestMethod.GET)
	public ResponseEntity<List<PlaneDTO>> getPlanesByAirline(@PathVariable("name") String airlineName) {
		List<PlaneDTO> list = planeService.getAirlineandPlaneInfo(airlineName);
		HttpStatus httpStatus = !list.isEmpty() ? HttpStatus.OK : HttpStatus.NOT_FOUND;
		return new ResponseEntity<List<PlaneDTO>>(list, httpStatus);
	}
		
	
}
