package com.airline.model;

import java.util.TimeZone;

import javax.persistence.*;

@Entity
@Table(name = "airport")
public class Airport {

	/*
	 * airport ID Unique OpenFlights identifier for this airport. Name Name of
	 * airport. May or may not contain the City name. City Main city served by
	 * airport. May be spelled differently from Name. Country Country or territory
	 * where airport is located. See countries.dat to cross-reference to ISO 3166-1
	 * codes. IATA 3-letter IATA code. Null if not assigned/unknown. ICAO 4-letter
	 * ICAO code. Null if not assigned. Latitude Decimal degrees, usually to six
	 * significant digits. Negative is South, positive is North. Longitude Decimal
	 * degrees, usually to six significant digits. Negative is West, positive is
	 * East. Altitude In feet. Timezone Hours offset from UTC. Fractional hours are
	 * expressed as decimals, eg. India is 5.5. DST Daylight savings time. One of E
	 * (Europe), A (US/Canada), S (South America), O (Australia), Z (New Zealand), N
	 * (None) or U (Unknown). See also: Help: Time Tz database time zone Timezone in
	 * "tz" (Olson) format, eg. "America/Los_Angeles". Type Type of the airport.
	 * Value "airport" for air terminals, "station" for train stations, "port" for
	 * ferry terminals and "unknown" if not known. In airports.csv, only
	 * type=airport is included.
	 */

	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "AirportId", nullable = false, updatable = false)
	private String airportID;
	private String airportName;
	private String city;
	private String country;
	private String IATA;
	private String ICAO;
	private String longitude;
	private String latitude;
	private Integer altitude;
	private TimeZone timeZone;
	private String dayLightSaving;
	private String airportType;
	
	
	public Airport(String airportID, String airportName, String city, String country, String iATA, String iCAO,
			String longitude, String latitude, Integer altitude, TimeZone timeZone, String dayLightSaving,
			String airportType) {
		super();
		this.airportID = airportID;
		this.airportName = airportName;
		this.city = city;
		this.country = country;
		IATA = iATA;
		ICAO = iCAO;
		this.longitude = longitude;
		this.latitude = latitude;
		this.altitude = altitude;
		this.timeZone = timeZone;
		this.dayLightSaving = dayLightSaving;
		this.airportType = airportType;
	}
	


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Airport [airportID=" + airportID + ", airportName=" + airportName + ", city=" + city + ", country="
				+ country + ", IATA=" + IATA + ", ICAO=" + ICAO + ", longitude=" + longitude + ", latitude=" + latitude
				+ ", altitude=" + altitude + ", timeZone=" + timeZone + ", dayLightSaving=" + dayLightSaving
				+ ", airportType=" + airportType + "]";
	}



	/**
	 * @return the airportID
	 */
	public String getAirportID() {
		return airportID;
	}


	/**
	 * @param airportID the airportID to set
	 */
	public void setAirportID(String airportID) {
		this.airportID = airportID;
	}


	/**
	 * @return the airportName
	 */
	public String getAirportName() {
		return airportName;
	}


	/**
	 * @param airportName the airportName to set
	 */
	public void setAirportName(String airportName) {
		this.airportName = airportName;
	}


	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}


	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}


	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}


	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}


	/**
	 * @return the iATA
	 */
	public String getIATA() {
		return IATA;
	}


	/**
	 * @param iATA the iATA to set
	 */
	public void setIATA(String iATA) {
		IATA = iATA;
	}


	/**
	 * @return the iCAO
	 */
	public String getICAO() {
		return ICAO;
	}


	/**
	 * @param iCAO the iCAO to set
	 */
	public void setICAO(String iCAO) {
		ICAO = iCAO;
	}


	/**
	 * @return the longitude
	 */
	public String getLongitude() {
		return longitude;
	}


	/**
	 * @param longitude the longitude to set
	 */
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}


	/**
	 * @return the latitude
	 */
	public String getLatitude() {
		return latitude;
	}


	/**
	 * @param latitude the latitude to set
	 */
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}


	/**
	 * @return the altitude
	 */
	public Integer getAltitude() {
		return altitude;
	}


	/**
	 * @param altitude the altitude to set
	 */
	public void setAltitude(Integer altitude) {
		this.altitude = altitude;
	}


	/**
	 * @return the timeZone
	 */
	public TimeZone getTimeZone() {
		return timeZone;
	}


	/**
	 * @param timeZone the timeZone to set
	 */
	public void setTimeZone(TimeZone timeZone) {
		this.timeZone = timeZone;
	}


	/**
	 * @return the dayLightSaving
	 */
	public String getDayLightSaving() {
		return dayLightSaving;
	}


	/**
	 * @param dayLightSaving the dayLightSaving to set
	 */
	public void setDayLightSaving(String dayLightSaving) {
		this.dayLightSaving = dayLightSaving;
	}


	/**
	 * @return the airportType
	 */
	public String getAirportType() {
		return airportType;
	}


	/**
	 * @param airportType the airportType to set
	 */
	public void setAirportType(String airportType) {
		this.airportType = airportType;
	}
	
	

}
