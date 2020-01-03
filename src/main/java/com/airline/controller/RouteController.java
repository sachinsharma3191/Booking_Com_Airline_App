package com.airline.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.airline.dto.RouteDTO;
import com.airline.service.RouteService;

@RestController
@RequestMapping(value = "/route")
public class RouteController {

	@Autowired
	RouteService routeService;

	@RequestMapping(value = "/info", method = RequestMethod.GET)
	public ResponseEntity<List<RouteDTO>> getRouteList(@RequestHeader String sourceCity,
			@RequestHeader String destinationCity) {
		List<RouteDTO> routeList = routeService.getRouteList(sourceCity, destinationCity);
		HttpStatus httpStatus = !routeList.isEmpty() ? HttpStatus.OK : HttpStatus.NOT_FOUND;
		return new ResponseEntity<List<RouteDTO>>(routeList, httpStatus);

	}
}
