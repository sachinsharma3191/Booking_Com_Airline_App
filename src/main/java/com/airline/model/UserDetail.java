package com.airline.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "USER_DETAILS")
public class UserDetail implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8461696627141198264L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "USER_ID", nullable = false, updatable = false, unique = true)
	private int userId;
	private String firstName;
	private String lastName;
	private String userName;
	private String email;
	private String address;
	private String city;
	private String state;
	private String postalCode;
	private String country;
	private String dob;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user", cascade = CascadeType.ALL)
	private Set<UserLogin> userLogins = new HashSet<>(0);

	public UserDetail() {

	}

	public UserDetail(Builder builder) {
		this.firstName = builder.firstName;
		this.lastName = builder.lastName;
		this.email = builder.email;
		this.address = builder.address;
		this.city = builder.city;
		this.state = builder.state;
		this.postalCode = builder.postalCode;
		this.country = builder.country;
		this.dob = builder.dob;
	}

	public UserDetail(String firstName, String lastName, String userName, String email, String address, String city,
			String state, String postalCode, String country, String dob) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.address = address;
		this.city = city;
		this.state = state;
		this.postalCode = postalCode;
		this.country = country;
		this.dob = dob;
	}

	public UserDetail(int userId, String firstName, String lastName, String userName, String email, String address,
			String city, String state, String postalCode, String country, String dob, Set<UserLogin> userLogins) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.address = address;
		this.city = city;
		this.state = state;
		this.postalCode = postalCode;
		this.country = country;
		this.dob = dob;
		this.userLogins = userLogins;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public Set<UserLogin> getuserLogins() {
		return userLogins;
	}

	public void setuserLogins(Set<UserLogin> userLogins) {
		this.userLogins = userLogins;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result + ((dob == null) ? 0 : dob.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((postalCode == null) ? 0 : postalCode.hashCode());
		result = prime * result + ((state == null) ? 0 : state.hashCode());
		result = prime * result + userId;
		result = prime * result + ((userLogins == null) ? 0 : userLogins.hashCode());
		result = prime * result + ((userName == null) ? 0 : userName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserDetail other = (UserDetail) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
			return false;
		if (dob == null) {
			if (other.dob != null)
				return false;
		} else if (!dob.equals(other.dob))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (postalCode == null) {
			if (other.postalCode != null)
				return false;
		} else if (!postalCode.equals(other.postalCode))
			return false;
		if (state == null) {
			if (other.state != null)
				return false;
		} else if (!state.equals(other.state))
			return false;
		if (userId != other.userId)
			return false;
		if (userLogins == null) {
			if (other.userLogins != null)
				return false;
		} else if (!userLogins.equals(other.userLogins))
			return false;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		return true;
	}

	/* Builder Class for User Model */
	public static class Builder {

		private String firstName;
		private String lastName;
		private String email;
		private String address;
		private String city;
		private String state;
		private String postalCode;
		private String country;
		private String dob;

		public Builder firstName(String firstName) {
			this.firstName = firstName;
			return this;
		}

		public Builder lasttName(String lastName) {
			this.lastName = lastName;
			return this;
		}

		public Builder address(String address) {
			this.address = address;
			return this;
		}

		public Builder city(String city) {
			this.city = city;
			return this;
		}

		public Builder state(String state) {
			this.state = state;
			return this;
		}

		public Builder postalCode(String postalCode) {
			this.postalCode = postalCode;
			return this;
		}

		public Builder country(String country) {
			this.country = country;
			return this;
		}

		public Builder dob(String dob) {
			this.dob = dob;
			return this;
		}

		public static Builder builder() {
			return new Builder();
		}

		public UserDetail build() {
			return new UserDetail(this);
		}

	}

}
