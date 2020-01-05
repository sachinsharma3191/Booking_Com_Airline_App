package com.airline.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.airline.dto.UserDTO;

@RestController
@RequestMapping()
public class UserController {

	@RequestMapping(value = "/regiser",method = RequestMethod.GET)
	public void login(@RequestBody UserDTO user) {
		
	}
}
