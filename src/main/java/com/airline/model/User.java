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
@Table(name = "USER_ACCOUNT")
public class User implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "LOGIN_ID", nullable = false, updatable = false, unique = true)
	private int id;
	
	@Column(name = "USER_ID")
	private String userId;

	@Column(name = "USERNAME")
	private String username;

	@Column(name = "PASSWORD", nullable = false)
	private String password;

	@Column(name = "ENABLED", nullable = false)
	private boolean enabled;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user", cascade = CascadeType.ALL)
	private Set<UserRoles> authorities = new HashSet<>();

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "login")
	private Set<UserLogin> userLogins = new HashSet<>(0);

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getusername() {
		return username;
	}

	public void setusername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Set<UserRoles> getAuthorities() {
		return authorities;
	}

	public void setAuthorities(Set<UserRoles> authorities) {
		this.authorities = authorities;
	}

	public Set<UserLogin> getUserLogins() {
		return userLogins;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public void setUserLogins(Set<UserLogin> userLogins) {
		this.userLogins = userLogins;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((username == null) ? 0 : username.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((userId == null) ? 0 : userId.hashCode());
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
		User other = (User) obj;
		if (id != other.id)
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (userId == null) {
			if (other.userId != null)
				return false;
		} else if (!userId.equals(other.userId))
			return false;
		return true;
	}

	public User() {
		super();
	}

	public User(int id, String userId, String username, String password, Set<UserRoles> authorities,
			Set<UserLogin> userLogins) {
		super();
		this.id = id;
		this.userId = userId;
		this.username = username;
		this.password = password;
		this.authorities = authorities;
		this.userLogins = userLogins;
	}

	public User(int id, String username, String password, Set<UserLogin> userLogins) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.userLogins = userLogins;
	}

	public User(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public User(LoginBuilder builder) {
		super();
		this.userId = builder.userId;
		this.username = builder.username;
		this.password = builder.password;
	}

	public static class LoginBuilder {
		private String userId;
		private String username;
		private String password;

		public static LoginBuilder builder() {
			return new LoginBuilder();
		}

		public LoginBuilder userId(String userId) {
			this.userId = userId;
			return this;
		}

		public LoginBuilder username(String name) {
			this.username = name;
			return this;
		}

		public LoginBuilder password(String password) {
			this.password = password;
			return this;
		}

		public User build() {
			return new User(this);
		}
	}

}
