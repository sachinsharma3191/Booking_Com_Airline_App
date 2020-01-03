package com.airline.model;

import javax.persistence.*;

@Entity
@Table(name = "Airline")
public class Airline {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Airline_ID", nullable = false, updatable = false, unique = true)
	private Integer airlineId;
	private String airlineName;
	private String alias;
	private String callSign;
	private String IATACode;
	private String ICAOCode;
	private String country;
	private String isActive;

	/**
	 * @return the alias
	 */
	public String getAlias() {
		return alias;
	}

	/**
	 * @param alias the alias to set
	 */
	public void setAlias(String alias) {
		this.alias = alias;
	}

	public Airline(Integer airlineId, String airlineName, String alias, String callSign, String iATACode,
			String iCAOCode, String country, String isActive) {
		super();
		this.airlineId = airlineId;
		this.airlineName = airlineName;
		this.alias = alias;
		this.callSign = callSign;
		IATACode = iATACode;
		ICAOCode = iCAOCode;
		this.country = country;
		this.isActive = isActive;
	}

	public Airline() {
		// TODO Auto-generated constructor stub
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((IATACode == null) ? 0 : IATACode.hashCode());
		result = prime * result + ((ICAOCode == null) ? 0 : ICAOCode.hashCode());
		result = prime * result + ((airlineId == null) ? 0 : airlineId.hashCode());
		result = prime * result + ((airlineName == null) ? 0 : airlineName.hashCode());
		result = prime * result + ((alias == null) ? 0 : alias.hashCode());
		result = prime * result + ((callSign == null) ? 0 : callSign.hashCode());
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result + ((isActive == null) ? 0 : isActive.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */

	@Override
	public String toString() {
		return "Airline [airlineId=" + airlineId + ", airlineName=" + airlineName + ", alias=" + alias + ", callSign="
				+ callSign + ", IATACode=" + IATACode + ", ICAOCode=" + ICAOCode + ", country=" + country
				+ ", isActive=" + isActive + "]";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Airline other = (Airline) obj;
		if (IATACode == null) {
			if (other.IATACode != null)
				return false;
		} else if (!IATACode.equals(other.IATACode))
			return false;
		if (ICAOCode == null) {
			if (other.ICAOCode != null)
				return false;
		} else if (!ICAOCode.equals(other.ICAOCode))
			return false;
		if (airlineId == null) {
			if (other.airlineId != null)
				return false;
		} else if (!airlineId.equals(other.airlineId))
			return false;
		if (airlineName == null) {
			if (other.airlineName != null)
				return false;
		} else if (!airlineName.equals(other.airlineName))
			return false;
		if (alias == null) {
			if (other.alias != null)
				return false;
		} else if (!alias.equals(other.alias))
			return false;
		if (callSign == null) {
			if (other.callSign != null)
				return false;
		} else if (!callSign.equals(other.callSign))
			return false;
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
			return false;
		if (isActive == null) {
			if (other.isActive != null)
				return false;
		} else if (!isActive.equals(other.isActive))
			return false;
		return true;
	}

	/**
	 * @return the airlineId
	 */
	public Integer getAirlineId() {
		return airlineId;
	}

	/**
	 * @param airlineId the airlineId to set
	 */
	public void setAirlineId(Integer airlineId) {
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
	public String getIsActive() {
		return isActive;
	}

	/**
	 * @param isActive the isActive to set
	 */
	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

}
