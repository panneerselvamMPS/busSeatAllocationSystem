package com.min.project.portal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.min.project.portal.model.BusDispatchModel;
import com.min.project.portal.pojos.BusDetailsRespPojo;
import com.min.project.portal.pojos.RegistrationRespPojo;
import com.min.project.portal.repository.BusDetailsRepo;

public interface FetchBusDetailsSrvc {
	BusDetailsRespPojo fetchbusdetails(String busid);
	Boolean validatebusid(String busid);
	List<BusDispatchModel> fetchuncompletedtrip(String busid);
	List<BusDispatchModel> fetchcompletedtrip(String busid);
}
