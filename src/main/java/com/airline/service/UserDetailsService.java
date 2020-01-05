package com.airline.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import com.airline.dao.UserDetailsDAO;
import com.airline.model.User;

@Service("userDetailsService")
public class UserDetailsService {

	private UserDetailsDAO userDetailsDao;

	@Transactional(readOnly = true)
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		User user = userDetailsDao.findUserByUsername(username);
		UserBuilder builder = null;
		if (user != null) {

			builder = org.springframework.security.core.userdetails.User.withUsername(username);
			builder.disabled(!user.isEnabled());
			builder.password(user.getPassword());
			//String[] authorities = user.getAuthorities().stream().map(a -> a.getAuthority()).toArray(String[]::new);

			//builder.authorities(authorities);
		} else {
			throw new UsernameNotFoundException("User not found.");
		}
		return builder.build();
	}
}
