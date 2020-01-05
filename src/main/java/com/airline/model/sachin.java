package com.airline.model;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class sachin {

	public static void main(String args[]) {
		String encoded = new BCryptPasswordEncoder().encode("admin@123");
		System.out.print(encoded);
	}
}
