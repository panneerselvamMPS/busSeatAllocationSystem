package com.min.project.portal.service;

import com.min.project.portal.pojos.BusSchedulingReqPojo;
import com.min.project.portal.pojos.RegistrationRespPojo;

public interface BusSchedulingSrvc {
	Boolean schedulebus(BusSchedulingReqPojo schbusreqpojo);
	RegistrationRespPojo schedulebusrequest(BusSchedulingReqPojo schbusreqpojo);

}