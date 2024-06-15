package com.min.project.portal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.min.project.portal.pojos.RegistrationReqPojo;
import com.min.project.portal.pojos.RegistrationRespPojo;
import com.min.project.portal.pojos.UserMessagePojo;
import com.min.project.portal.pojos.UserReqPojo;
import com.min.project.portal.service.UserDetailsSrvc;

@RestController
public class UserController {

	@Autowired
	private UserDetailsSrvc userDetailsSrvc;
	@PostMapping("/saveuser")
	public RegistrationRespPojo saveUser(@RequestBody UserReqPojo userReqPojo)
	{
		RegistrationRespPojo resppojo=userDetailsSrvc.saveUser(userReqPojo);
		return resppojo;
	}
	
	@PostMapping("/validatelogin")
	public UserMessagePojo validateLogin(@RequestBody UserReqPojo userReqPojo)
	{
		UserMessagePojo resppojo=userDetailsSrvc.validateLogin(userReqPojo);
		return resppojo;
	}
}
