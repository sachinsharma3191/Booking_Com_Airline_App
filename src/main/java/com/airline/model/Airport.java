package com.airline.model;

import javax.persistence.*;

@Entity
@Table(name = "airport")
public class Airport {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "AirportId",nullable = false,updatable  = false,unique= true)
	private Integer airportID;
	private String airportName;
	private String city;
	private String country;
	private String IATA;
	private String ICAO;
	private String longitude;
	private String latitude;
	private String altitude;
	private String timeZone;
	private String dayLightSaving;
	private String timeZoneOslonFormat;
	private String airportType;
	
	public Airport(Integer airportID, String airportName, String city, String country, String iATA, String iCAO,
			String longitude, String latitude, String altitude, String timeZone, String dayLightSaving,
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
	


	public Airport() {
		// TODO Auto-generated constructor stub
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
	 * @return the timeZoneOslonFormat
	 */
	public String getTimeZoneOslonFormat() {
		return timeZoneOslonFormat;
	}



	/**
	 * @param timeZoneOslonFormat the timeZoneOslonFormat to set
	 */
	public void setTimeZoneOslonFormat(String timeZoneOslonFormat) {
		this.timeZoneOslonFormat = timeZoneOslonFormat;
	}

	/**
	 * @return the airportID
	 */
	public Integer getAirportID() {
		return airportID;
	}


	/**
	 * @param airportID the airportID to set
	 */
	public void setAirportID(Integer airportID) {
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
	public String getAltitude() {
		return altitude;
	}


	/**
	 * @param data the altitude to set
	 */
	public void setAltitude(String data) {
		this.altitude = data;
	}


	/**
	 * @return the timeZone
	 */
	public String getTimeZone() {
		return timeZone;
	}


	/**
	 * @param data the timeZone to set
	 */
	public void setTimeZone(String data) {
		this.timeZone = data;
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
