package com.airline.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

@Embeddable
class UserRoleId implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "USER_ID")
	private int userId;

	@Column(name = "ROLE_ID")
	private int userRoleId;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getRoleId() {
		return userRoleId;
	}

	public void setRoleId(int userRoleId) {
		this.userRoleId = userRoleId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + userRoleId;
		result = prime * result + userId;
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
		UserRoleId other = (UserRoleId) obj;
		if (userRoleId != other.userRoleId)
			return false;
		if (userId != other.userId)
			return false;
		return true;
	}

	public UserRoleId() {
		super();
	}

	public UserRoleId(int userId, int userRoleId) {
		super();
		this.userId = userId;
		this.userRoleId = userRoleId;
	}

}

@Entity
@Table(name = "USER_ROLES")
public class UserRoles implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private UserRoleId userRoleId = new UserRoleId();

	@ManyToOne
	@MapsId("USER_ID")
	@JoinColumn(name = "USER_ID")
	private User user;

	@ManyToOne
	@MapsId("ROLE_ID")
	@JoinColumn(name = "ROLE_ID")
	private Role role;

	public UserRoleId getRoleId() {
		return userRoleId;
	}

	public void setRoleId(UserRoleId userRoleId) {
		this.userRoleId = userRoleId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Role getRoles() {
		return role;
	}

	public void setRoles(Role role) {
		this.role = role;
	}

	public UserRoles() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserRoles(UserRoleId userRoleId, User user, Role role) {
		super();
		this.userRoleId = userRoleId;
		this.user = user;
		this.role = role;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((userRoleId == null) ? 0 : userRoleId.hashCode());
		result = prime * result + ((role == null) ? 0 : role.hashCode());
		result = prime * result + ((user == null) ? 0 : user.hashCode());
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
		UserRoles other = (UserRoles) obj;
		if (userRoleId == null) {
			if (other.userRoleId != null)
				return false;
		} else if (!userRoleId.equals(other.userRoleId))
			return false;
		if (role == null) {
			if (other.role != null)
				return false;
		} else if (!role.equals(other.role))
			return false;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		return true;
	}

}
