package com.airline.common;

import com.airline.model.*;

public class ConvertData {

	private static final String COMMA_SEPARATOR = "\\,";

	public static String[] cleanData(String [] input) {
		String output[] = new String[input.length];
		for(int i =0; i < input.length; i++) {
			output[i] = input[i].length() != 0 ? input[i] : "";
		}
		return output;
	}
	
	public static String cleanData(String  input) {
		return input.replaceAll("\"","");
	}
	
	public static Plane convertToAirPlane(String planeInfo) {
		Plane plane = new Plane();
		
		String data[] = planeInfo.split(COMMA_SEPARATOR);
		data = cleanData(data);
		if (data.length > 0) {
			plane.setPlaneName(data[0]);
			plane.setICAO(data[1]);
			plane.setIATA(data.length == 2 ? "" : data[2]);
		}
		return plane;
	}

	public static Airline convertToAirline(String airlineInfo) {
		String data[] = airlineInfo.split(COMMA_SEPARATOR);
		Airline airline = new Airline();
		if (data.length > 0) {
			data = cleanData(data);
			airline.setAirlineName(data[1]);
			airline.setalias(data[2]);
			airline.setCallSign(data[3]);
			airline.setIATACode(data[4]);
			airline.setICAOCode(data[5]);
			airline.setCountry(data[6]);
			airline.setIsActive(data[7]);
		}
		return airline;
	}

	public static Airport convertToAirPort(String airportInfo) {
		String data[] = airportInfo.split(COMMA_SEPARATOR);
		Airport airport = new Airport();
		if (data.length > 0) {

			data = cleanData(data);
			airport.setAirportName(data[1]);
			airport.setCity(data[2]);
			airport.setCountry(data[3]);
			airport.setIATA(data[4]);
			airport.setICAO(data[5]);
			airport.setLatitude(data[6]);
			airport.setLongitude(data[7]);
			airport.setAltitude(data[8]);
			airport.setTimeZone(data[9]);
			airport.setDayLightSaving(data[10]);
			airport.setTimeZoneOslonFormat(data[11]);
			airport.setAirportType(data[12]);
		}
		return airport;
	}

	public static Route convertToRoute(String routeInfo) {
		Route route = new Route();
		String data[] = routeInfo.split(COMMA_SEPARATOR);
		if (data.length > 0) {
			data = cleanData(data);
			route.setAirlineName(data[0]);
			route.setAirlineId(data[1]);
			route.setSourceAirport(data[2]);
			route.setSourceAirportId(data[3]);
			route.setDestinationAirport(data[4]);
			route.setDestinationAirportId(data[5]);
			route.setCodeShare(data[6]);
			route.setNumberOfStops(data[7]);
			route.setEquipment(data.length == 8 ? "" : data[8]);
		}
		return route;
	}
}
