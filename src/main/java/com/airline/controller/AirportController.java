package com.airline.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.airline.dto.AirportDTO;
import com.airline.service.AirportService;

@RestController
@RequestMapping(value = "/airport")
public class AirportController {

	@Autowired
	AirportService airportService;

	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public ResponseEntity<List<AirportDTO>> getAirportList() {
		List<AirportDTO> list = airportService.getAirportList();
		HttpStatus httpStatus = !list.isEmpty() ? HttpStatus.OK : HttpStatus.NOT_FOUND;
		return new ResponseEntity<List<AirportDTO>>(list, httpStatus);
	}

	@RequestMapping(value = "/getAirportByCountry/{countryName}", method = RequestMethod.GET)
	public ResponseEntity<List<AirportDTO>> getAirportByCountry(@PathVariable("countryName") String country) {
		List<AirportDTO> list = airportService.getAirportByCountry(country);
		HttpStatus httpStatus = !list.isEmpty() ? HttpStatus.OK : HttpStatus.NOT_FOUND;
		return new ResponseEntity<List<AirportDTO>>(list, httpStatus);
	}

	@RequestMapping(value = "/getAirportByIATA/{iata}", method = RequestMethod.GET)
	public ResponseEntity<List<AirportDTO>> getAirportByIATA(@PathVariable("iata") String iata) {
		List<AirportDTO> list = airportService.getAirportByIATA(iata);
		HttpStatus httpStatus = !list.isEmpty() ? HttpStatus.OK : HttpStatus.NOT_FOUND;
		return new ResponseEntity<List<AirportDTO>>(list, httpStatus);
	}

	@RequestMapping(value = "/getAirportByICAO/{icao}", method = RequestMethod.GET)
	public ResponseEntity<List<AirportDTO>> getAirportByICAO(@PathVariable("icao") String icao) {
		List<AirportDTO> list = airportService.getAirportByICAO(icao);
		HttpStatus httpStatus = !list.isEmpty() ? HttpStatus.OK : HttpStatus.NOT_FOUND;
		return new ResponseEntity<List<AirportDTO>>(list, httpStatus);
	}

}
