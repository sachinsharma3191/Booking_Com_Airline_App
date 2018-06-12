package com.airline.model;

import javax.persistence.*;

@Entity
@Table(name = "Airline")
public class Airline {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "AirlineID",nullable = false,updatable  = false)
	private String airlineId;
	private String airlineName;
	private String lias;
	private String callSign;
	private String IATACode;
	private String ICAOCode;
	private String country;
	private Boolean isActive;
	
	public Airline(String airlineId, String airlineName, String lias, String callSign, String iATACode, String iCAOCode,
			String country, Boolean isActive) {
		super();
		this.airlineId = airlineId;
		this.airlineName = airlineName;
		this.lias = lias;
		this.callSign = callSign;
		IATACode = iATACode;
		ICAOCode = iCAOCode;
		this.country = country;
		this.isActive = isActive;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Airline [airlineId=" + airlineId + ", airlineName=" + airlineName + ", lias=" + lias + ", callSign="
				+ callSign + ", IATACode=" + IATACode + ", ICAOCode=" + ICAOCode + ", country=" + country
				+ ", isActive=" + isActive + "]";
	}

	/**
	 * @return the airlineId
	 */
	public String getAirlineId() {
		return airlineId;
	}

	/**
	 * @param airlineId the airlineId to set
	 */
	public void setAirlineId(String airlineId) {
		this.airlineId = airlineId;
	}

	/**
	 * @return the airlineName
	 */
	public String getAirlineName() {
		return airlineName;
	}

	/**
	 * @param airlineName the airlineName to set
	 */
	public void setAirlineName(String airlineName) {
		this.airlineName = airlineName;
	}

	/**
	 * @return the lias
	 */
	public String getLias() {
		return lias;
	}

	/**
	 * @param lias the lias to set
	 */
	public void setLias(String lias) {
		this.lias = lias;
	}

	/**
	 * @return the callSign
	 */
	public String getCallSign() {
		return callSign;
	}

	/**
	 * @param callSign the callSign to set
	 */
	public void setCallSign(String callSign) {
		this.callSign = callSign;
	}

	/**
	 * @return the iATACode
	 */
	public String getIATACode() {
		return IATACode;
	}

	/**
	 * @param iATACode the iATACode to set
	 */
	public void setIATACode(String iATACode) {
		IATACode = iATACode;
	}

	/**
	 * @return the iCAOCode
	 */
	public String getICAOCode() {
		return ICAOCode;
	}

	/**
	 * @param iCAOCode the iCAOCode to set
	 */
	public void setICAOCode(String iCAOCode) {
		ICAOCode = iCAOCode;
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
	 * @return the isActive
	 */
	public Boolean getIsActive() {
		return isActive;
	}

	/**
	 * @param isActive the isActive to set
	 */
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}
	
	
	
	
	
}
