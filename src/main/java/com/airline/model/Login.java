package com.airline.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "login")
public class Login implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", nullable = false, updatable = false, unique = true)
	private int id;
	private String login_name;
	private String password;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "login")
	private Set<UserLogin> userLogins = new HashSet<>(0);

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLogin_name() {
		return login_name;
	}

	public void setLogin_name(String login_name) {
		this.login_name = login_name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Set<UserLogin> getUserLogins() {
		return userLogins;
	}

	public void setUserLogins(Set<UserLogin> userLogins) {
		this.userLogins = userLogins;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((login_name == null) ? 0 : login_name.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((userLogins == null) ? 0 : userLogins.hashCode());
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
		Login other = (Login) obj;
		if (id != other.id)
			return false;
		if (login_name == null) {
			if (other.login_name != null)
				return false;
		} else if (!login_name.equals(other.login_name))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (userLogins == null) {
			if (other.userLogins != null)
				return false;
		} else if (!userLogins.equals(other.userLogins))
			return false;
		return true;
	}

	public Login() {
		super();	
	}
	
	
	public Login(int id, String login_name, String password, Set<UserLogin> userLogins) {
		super();
		this.id = id;
		this.login_name = login_name;
		this.password = password;
		this.userLogins = userLogins;
	}

	public Login(String login_name, String password) {
		super();
		this.login_name = login_name;
		this.password = password;
	}

}
