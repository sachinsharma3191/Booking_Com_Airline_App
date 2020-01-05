package com.airline.dto;

public class RouteDTO {

	private Integer routeId;
	private String airlineName;
	private String airlineId;
	private String sourceAirportId;
	private String sourceAirport;
	private String destinationAirportId;
	private String destinationAirport;
	private String codeShare;
	private String numberOfStops;
	private String equipment;
	private String departureTime;
	private String arrivalTime;
	/**
	 * @return the routeId
	 */
	public Integer getRouteId() {
		return routeId;
	}
	/**
	 * @param routeId the routeId to set
	 */
	public void setRouteId(Integer routeId) {
		this.routeId = routeId;
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
	 * @return the sourceAirportId
	 */
	public String getSourceAirportId() {
		return sourceAirportId;
	}
	/**
	 * @param sourceAirportId the sourceAirportId to set
	 */
	public void setSourceAirportId(String sourceAirportId) {
		this.sourceAirportId = sourceAirportId;
	}
	/**
	 * @return the sourceAirport
	 */
	public String getSourceAirport() {
		return sourceAirport;
	}
	/**
	 * @param sourceAirport the sourceAirport to set
	 */
	public void setSourceAirport(String sourceAirport) {
		this.sourceAirport = sourceAirport;
	}
	/**
	 * @return the destinationAirportId
	 */
	public String getDestinationAirportId() {
		return destinationAirportId;
	}
	/**
	 * @param destinationAirportId the destinationAirportId to set
	 */
	public void setDestinationAirportId(String destinationAirportId) {
		this.destinationAirportId = destinationAirportId;
	}
	/**
	 * @return the destinationAirport
	 */
	public String getDestinationAirport() {
		return destinationAirport;
	}
	/**
	 * @param destinationAirport the destinationAirport to set
	 */
	public void setDestinationAirport(String destinationAirport) {
		this.destinationAirport = destinationAirport;
	}
	/**
	 * @return the codeShare
	 */
	public String getCodeShare() {
		return codeShare;
	}
	/**
	 * @param codeShare the codeShare to set
	 */
	public void setCodeShare(String codeShare) {
		this.codeShare = codeShare;
	}
	/**
	 * @return the numberOfStops
	 */
	public String getNumberOfStops() {
		return numberOfStops;
	}
	/**
	 * @param numberOfStops the numberOfStops to set
	 */
	public void setNumberOfStops(String numberOfStops) {
		this.numberOfStops = numberOfStops;
	}
	/**
	 * @return the equipment
	 */
	public String getEquipment() {
		return equipment;
	}
	/**
	 * @param equipment the equipment to set
	 */
	public void setEquipment(String equipment) {
		this.equipment = equipment;
	}
	/**
	 * @return the departureTime
	 */
	public String getDepartureTime() {
		return departureTime;
	}
	/**
	 * @param departureTime the departureTime to set
	 */
	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}
	/**
	 * @return the arrivalTime
	 */
	public String getArrivalTime() {
		return arrivalTime;
	}
	/**
	 * @param arrivalTime the arrivalTime to set
	 */
	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((airlineId == null) ? 0 : airlineId.hashCode());
		result = prime * result + ((airlineName == null) ? 0 : airlineName.hashCode());
		result = prime * result + ((arrivalTime == null) ? 0 : arrivalTime.hashCode());
		result = prime * result + ((codeShare == null) ? 0 : codeShare.hashCode());
		result = prime * result + ((departureTime == null) ? 0 : departureTime.hashCode());
		result = prime * result + ((destinationAirport == null) ? 0 : destinationAirport.hashCode());
		result = prime * result + ((destinationAirportId == null) ? 0 : destinationAirportId.hashCode());
		result = prime * result + ((equipment == null) ? 0 : equipment.hashCode());
		result = prime * result + ((numberOfStops == null) ? 0 : numberOfStops.hashCode());
		result = prime * result + ((routeId == null) ? 0 : routeId.hashCode());
		result = prime * result + ((sourceAirport == null) ? 0 : sourceAirport.hashCode());
		result = prime * result + ((sourceAirportId == null) ? 0 : sourceAirportId.hashCode());
		return result;
	}
	/* (non-Javadoc)
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
		RouteDTO other = (RouteDTO) obj;
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
		if (arrivalTime == null) {
			if (other.arrivalTime != null)
				return false;
		} else if (!arrivalTime.equals(other.arrivalTime))
			return false;
		if (codeShare == null) {
			if (other.codeShare != null)
				return false;
		} else if (!codeShare.equals(other.codeShare))
			return false;
		if (departureTime == null) {
			if (other.departureTime != null)
				return false;
		} else if (!departureTime.equals(other.departureTime))
			return false;
		if (destinationAirport == null) {
			if (other.destinationAirport != null)
				return false;
		} else if (!destinationAirport.equals(other.destinationAirport))
			return false;
		if (destinationAirportId == null) {
			if (other.destinationAirportId != null)
				return false;
		} else if (!destinationAirportId.equals(other.destinationAirportId))
			return false;
		if (equipment == null) {
			if (other.equipment != null)
				return false;
		} else if (!equipment.equals(other.equipment))
			return false;
		if (numberOfStops == null) {
			if (other.numberOfStops != null)
				return false;
		} else if (!numberOfStops.equals(other.numberOfStops))
			return false;
		if (routeId == null) {
			if (other.routeId != null)
				return false;
		} else if (!routeId.equals(other.routeId))
			return false;
		if (sourceAirport == null) {
			if (other.sourceAirport != null)
				return false;
		} else if (!sourceAirport.equals(other.sourceAirport))
			return false;
		if (sourceAirportId == null) {
			if (other.sourceAirportId != null)
				return false;
		} else if (!sourceAirportId.equals(other.sourceAirportId))
			return false;
		return true;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "RouteDTO [routeId=" + routeId + ", airlineName=" + airlineName + ", airlineId=" + airlineId
				+ ", sourceAirportId=" + sourceAirportId + ", sourceAirport=" + sourceAirport
				+ ", destinationAirportId=" + destinationAirportId + ", destinationAirport=" + destinationAirport
				+ ", codeShare=" + codeShare + ", numberOfStops=" + numberOfStops + ", equipment=" + equipment
				+ ", departureTime=" + departureTime + ", arrivalTime=" + arrivalTime + "]";
	}
	
	public RouteDTO() {
		
	}
	
	public RouteDTO(Integer routeId, String airlineName, String airlineId, String sourceAirportId, String sourceAirport,
			String destinationAirportId, String destinationAirport, String codeShare, String numberOfStops,
			String equipment, String departureTime, String arrivalTime) {
		super();
		this.routeId = routeId;
		this.airlineName = airlineName;
		this.airlineId = airlineId;
		this.sourceAirportId = sourceAirportId;
		this.sourceAirport = sourceAirport;
		this.destinationAirportId = destinationAirportId;
		this.destinationAirport = destinationAirport;
		this.codeShare = codeShare;
		this.numberOfStops = numberOfStops;
		this.equipment = equipment;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
	}
	
	
}
