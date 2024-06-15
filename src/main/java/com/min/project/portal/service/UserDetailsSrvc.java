package com.min.project.portal.service;

import com.min.project.portal.pojos.RegistrationRespPojo;
import com.min.project.portal.pojos.UserMessagePojo;
import com.min.project.portal.pojos.UserReqPojo;

public interface UserDetailsSrvc {
	UserMessagePojo validateLogin(UserReqPojo userReqPojo);
	RegistrationRespPojo saveUser(UserReqPojo userReqPojo);
	Boolean saveUserDetails(UserReqPojo userReqPojo);
}
