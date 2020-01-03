package com.airline.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

@Embeddable
public class UserLoginId implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "user_id")
	private int user_id;

	@Column(name = "id")
	private int id;

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public UserLoginId() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserLoginId(int user_id, int id) {
		super();
		this.user_id = user_id;
		this.id = id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + user_id;
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
		UserLoginId other = (UserLoginId) obj;
		if (id != other.id)
			return false;
		if (user_id != other.user_id)
			return false;
		return true;
	}
	
	
	

}
