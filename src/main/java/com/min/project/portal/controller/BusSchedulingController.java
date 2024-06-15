package com.min.project.portal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.min.project.portal.pojos.BusSchedulingReqPojo;
import com.min.project.portal.pojos.RegistrationReqPojo;
import com.min.project.portal.pojos.RegistrationRespPojo;
import com.min.project.portal.service.BusSchedulingSrvc;
@RestController
public class BusSchedulingController {
	@Autowired
	BusSchedulingSrvc schsrvc;
	@PostMapping("/schedulebus")
	public RegistrationRespPojo schedulebus(@RequestBody BusSchedulingReqPojo busschrep)
	{
		return(schsrvc.schedulebusrequest(busschrep));
	}

}
