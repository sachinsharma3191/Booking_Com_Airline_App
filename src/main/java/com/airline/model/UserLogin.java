package com.airline.model;

import java.time.LocalDateTime;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
class UserLoginId implements java.io.Serializable {

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

@Entity
@Table(name = "USER_LOGIN")
public class UserLogin implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private UserLoginId id = new UserLoginId();

	private boolean isSuccessful;
	private LocalDateTime lastLogin;

	@ManyToOne
	@MapsId("USER_ID")
	@JoinColumn(name = "USER_ID")
	private UserDetail user;

	@ManyToOne
	@MapsId("id")
	@JoinColumn(name = "id")
	private User login;

	public UserLoginId getId() {
		return id;
	}

	public void setId(UserLoginId id) {
		this.id = id;
	}

	public boolean isSuccessful() {
		return isSuccessful;
	}

	public void setSuccessful(boolean isSuccessful) {
		this.isSuccessful = isSuccessful;
	}

	public LocalDateTime getLastLogin() {
		return lastLogin;
	}

	public void setLastLogin(LocalDateTime lastLogin) {
		this.lastLogin = lastLogin;
	}

	public UserDetail getUser() {
		return user;
	}

	public void setUser(UserDetail user) {
		this.user = user;
	}

	public User getLogin() {
		return login;
	}

	public void setLogin(User login) {
		this.login = login;
	}

	public UserLogin(boolean isSuccessful, LocalDateTime lastLogin, UserDetail user, User login) {
		super();
		this.isSuccessful = isSuccessful;
		this.lastLogin = lastLogin;
		this.user = user;
		this.login = login;
	}

	public UserLogin() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + (isSuccessful ? 1231 : 1237);
		result = prime * result + ((lastLogin == null) ? 0 : lastLogin.hashCode());
		result = prime * result + ((login == null) ? 0 : login.hashCode());
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
		UserLogin other = (UserLogin) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (isSuccessful != other.isSuccessful)
			return false;
		if (lastLogin == null) {
			if (other.lastLogin != null)
				return false;
		} else if (!lastLogin.equals(other.lastLogin))
			return false;
		if (login == null) {
			if (other.login != null)
				return false;
		} else if (!login.equals(other.login))
			return false;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		return true;
	}

}
