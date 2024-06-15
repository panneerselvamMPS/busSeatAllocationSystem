package com.min.project.portal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.min.project.portal.model.UserDetailsModel;
import com.min.project.portal.pojos.RegistrationRespPojo;
import com.min.project.portal.pojos.UserMessagePojo;
import com.min.project.portal.pojos.UserReqPojo;
import com.min.project.portal.repository.UserDetailsRepo;
@Service
public class UserDetailsSrvcImpl implements UserDetailsSrvc{

	@Autowired
	private UserDetailsRepo userDetailsRepo;
	
	@Override
	public UserMessagePojo validateLogin(UserReqPojo userReqPojo) {
		UserMessagePojo resppojo = new UserMessagePojo();
		UserDetailsModel userDetailsModel = userDetailsRepo.findByUserName(userReqPojo.getUserName());
		if(userDetailsModel!=null) {
			if(userDetailsModel.getPassword().equals(userReqPojo.getPassword())){
				resppojo.setUserType(userDetailsModel.getUserType());
				resppojo.setStatus("Success");
				resppojo.setMessage("Login Success");
			}
			else {
				resppojo.setStatus("Failed");
				resppojo.setMessage("Invalid Password");	
			}
		}else {
			resppojo.setStatus("Failed");
			resppojo.setMessage("Invalid Username/Username doesn't exist");
		}
		return resppojo;
	}

	@Override
	public RegistrationRespPojo saveUser(UserReqPojo userReqPojo) {
		RegistrationRespPojo resppojo = new RegistrationRespPojo();
		if (userDetailsRepo.findByUserName(userReqPojo.getUserName()) == null) {
			Boolean result = saveUserDetails(userReqPojo);
			if (result == true) {
				
				resppojo.setStatus("Success");
				resppojo.setMessage("User Registered with username " + userReqPojo.getUserName());
			} else {
				resppojo.setStatus("Failed");
				resppojo.setMessage("User Registration Failed.Please try again later");
			}
		}else {
			resppojo.setStatus("Failed");
			resppojo.setMessage("Username Already Exists");
		}
		
		return resppojo;
	}

	
	public Boolean saveUserDetails(UserReqPojo userReqPojo) {
		Long id1 = 0L;
		try {
			UserDetailsModel userDetailsModel = new UserDetailsModel();
			userDetailsModel.setUserName(userReqPojo.getUserName());
			userDetailsModel.setPassword(userReqPojo.getPassword());
			userDetailsModel.setUserType("user");;
			userDetailsRepo.save(userDetailsModel);
			return true;
		} catch (Exception e) {
			System.out.println("Error Occured at"+e.getMessage());
			return false;
		}
	}

	public Boolean validateUserDetails(UserDetailsModel userDetailsModel,UserReqPojo userReqPojo) {
		
		return null;
		
	}
}
