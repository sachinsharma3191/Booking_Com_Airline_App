package com.airline.dao;

import com.airline.model.User;

public interface UserDetailsDAO {
	User findUserByUsername(String username);
}
