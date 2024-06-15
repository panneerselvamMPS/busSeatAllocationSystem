package com.min.project.portal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.min.project.portal.model.BusInfo;
import com.min.project.portal.repository.BusInfoRepo;

@Service
public class BusInforService {

	@Autowired
	private BusInfoRepo busInfoRepo;
	
	public void savebusdetails(BusInfo busInfo) {
		busInfoRepo.save(busInfo);
	}
}
