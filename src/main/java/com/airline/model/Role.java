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
@Table(name = "ROLES")
public class Role {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ROLE_ID")
	private Integer roleId;

	@Column(name = "ROLE_NAME")
	private String roleName;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "role")
	private Set<UserRoles> userRoles = new HashSet<>(0);

	public Integer getAuthorityId() {
		return roleId;
	}

	public void setAuthorityId(Integer roleId) {
		this.roleId = roleId;
	}

	public String getAuthority() {
		return roleName;
	}

	public void setAuthority(String roleName) {
		this.roleName = roleName;
	}

	public Set<UserRoles> getUserRoles() {
		return userRoles;
	}

	public void setUserRoles(Set<UserRoles> userRoles) {
		this.userRoles = userRoles;
	}

	public Role() {
		super();
	}

	public Role(Integer roleId, String roleName, Set<UserRoles> userRoles) {
		super();
		this.roleId = roleId;
		this.roleName = roleName;
		this.userRoles = userRoles;
	}

}