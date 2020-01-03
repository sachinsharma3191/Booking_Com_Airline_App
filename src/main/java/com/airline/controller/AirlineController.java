package com.airline.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.airline.dto.AirlineDTO;
import com.airline.service.AirlineService;

@RestController
@RequestMapping(value = "/airline")
public class AirlineController {

	@Autowired
	AirlineService airlineService;

	@RequestMapping(value = "/country/{countryName}", method = RequestMethod.GET)
	public ResponseEntity<List<AirlineDTO>> getAirlinesByCountry(@PathVariable("countryName") String countryName) {
		List<AirlineDTO> list = airlineService.getAirlineList(countryName);
		HttpStatus httpStatus = !list.isEmpty()  ? HttpStatus.OK : HttpStatus.NOT_FOUND;
		return new ResponseEntity<List<AirlineDTO>>(list, httpStatus);
	}

	@RequestMapping(value = "/iata/{IATA}", method = RequestMethod.GET)
	public ResponseEntity<List<AirlineDTO>> getAirlineByIATA(@PathVariable("IATA") String IATA) {
		List<AirlineDTO> list = airlineService.getAirlineByIATA(IATA);
		HttpStatus httpStatus = !list.isEmpty()  ? HttpStatus.OK : HttpStatus.NOT_FOUND;
		return new ResponseEntity<List<AirlineDTO>>(list, httpStatus);

	}

	@RequestMapping(value = "/icao/{ICAO}", method = RequestMethod.GET)
	public ResponseEntity<List<AirlineDTO>> getAirlineByICAO(@PathVariable("ICAO") String ICAO) {
		List<AirlineDTO> list = airlineService.getAirlineByICAO(ICAO);
		HttpStatus httpStatus = !list.isEmpty()  ? HttpStatus.OK : HttpStatus.NOT_FOUND;
		return new ResponseEntity<List<AirlineDTO>>(list, httpStatus);
	}

	@RequestMapping(value = "/Active", method = RequestMethod.GET)
	public ResponseEntity<List<AirlineDTO>> getActiveAirlines() {
		List<AirlineDTO> list = airlineService.getActiveAirlines();
		HttpStatus httpStatus = !list.isEmpty()  ? HttpStatus.OK : HttpStatus.NOT_FOUND;
		return new ResponseEntity<List<AirlineDTO>>(list, httpStatus);

	}

	@RequestMapping(value = "/Inactive", method = RequestMethod.GET)
	public ResponseEntity<List<AirlineDTO>> getInActiveAirlines() {
		List<AirlineDTO> list = airlineService.getActiveAirlines();
		HttpStatus httpStatus = !list.isEmpty()  ? HttpStatus.OK : HttpStatus.NOT_FOUND;
		return new ResponseEntity<List<AirlineDTO>>(list, httpStatus);
	}
}
