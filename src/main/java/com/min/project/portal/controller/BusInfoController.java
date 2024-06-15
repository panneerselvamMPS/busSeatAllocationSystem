package com.min.project.portal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.min.project.portal.model.BusInfo;
import com.min.project.portal.service.BusInforService;

@RestController
public class BusInfoController {
	
	@Autowired
	private BusInforService busInforService;
	
	@PostMapping("/businfo")
	public void saveBusInfo(@RequestBody BusInfo busInfo) {
		busInforService.savebusdetails(busInfo);
	}

}
