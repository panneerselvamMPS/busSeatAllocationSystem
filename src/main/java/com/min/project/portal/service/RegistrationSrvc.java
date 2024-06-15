package com.min.project.portal.service;

import java.io.PrintWriter;

import com.min.project.portal.pojos.RegistrationReqPojo;
import com.min.project.portal.pojos.RegistrationRespPojo;

public interface RegistrationSrvc {
	public Boolean savebusdetails(RegistrationReqPojo regpojo);
	public RegistrationRespPojo registersinglebusdetails(RegistrationReqPojo regpojo);
	public RegistrationRespPojo checkusername(String username);
}