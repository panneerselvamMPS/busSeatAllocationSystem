package com.min.project.portal.service;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;

import com.min.project.portal.model.BusDispatchModel;
import com.min.project.portal.pojos.AllocationReqPojo;
import com.min.project.portal.pojos.CustomerBookingReqPojo;
import com.min.project.portal.pojos.CustomerBookingResp;
import com.min.project.portal.pojos.CustomerBusSeatResp;
import com.min.project.portal.pojos.RegistrationRespPojo;

public interface SeatBookingSrvc {
	public List<CustomerBookingResp> customerseatbooking(CustomerBookingReqPojo reqpojo);
	public CustomerBusSeatResp fetchbusseatdetails(CustomerBookingResp reqpojo);
	public RegistrationRespPojo allocateseats(AllocationReqPojo reqpojo);
}