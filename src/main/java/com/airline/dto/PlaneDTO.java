package com.airline.dto;

import javax.persistence.*;

public class PlaneDTO {

	private Integer PlaneID;
	private String planeName;
	private String IATA;
	private String ICAO;
	
	
	/**
	 * @return the planeID
	 */
	public Integer getPlaneID() {
		return PlaneID;
	}
	/**
	 * @param planeID the planeID to set
	 */
	public void setPlaneID(Integer planeID) {
		PlaneID = planeID;
	}
	/**
	 * @return the planeName
	 */
	public String getPlaneName() {
		return planeName;
	}
	/**
	 * @param planeName the planeName to set
	 */
	public void setPlaneName(String planeName) {
		this.planeName = planeName;
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
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Plane [PlaneID=" + PlaneID + ", planeName=" + planeName + ", IATA=" + IATA + ", ICAO=" + ICAO + "]";
	}
	
	
}
