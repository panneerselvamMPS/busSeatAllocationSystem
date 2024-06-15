package com.min.project.portal.controller;

import java.io.ByteArrayOutputStream;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.min.project.portal.model.BusDispatchModel;
import com.min.project.portal.pojos.BusDetailsRespPojo;
import com.min.project.portal.pojos.RegistrationReqPojo;
import com.min.project.portal.pojos.RegistrationRespPojo;
import com.min.project.portal.service.FetchBusDetailsSrvc;
import com.min.project.portal.service.SeatpdfSrvc;

@RestController
public class FetchBusDetailsController {
	@Autowired
	FetchBusDetailsSrvc dtlssrvc;
	@Autowired
	SeatpdfSrvc pdfsrvc;
	
	@PostMapping("/fetchbusdetails")
	public BusDetailsRespPojo fetchbusdetails(@RequestBody String busid)
	{
		return(dtlssrvc.fetchbusdetails(busid));
	}
	
	@PostMapping("/fetchuncompletedtrips")
	public List<BusDispatchModel> fetchuncompletedtrips(@RequestBody String busid)
	{
		return(dtlssrvc.fetchuncompletedtrip(busid));
	}
	
	@PostMapping("/fetchcompletedtrips")
	public List<BusDispatchModel> fetchcompletedtrips(@RequestBody String busid)
	{
		return(dtlssrvc.fetchcompletedtrip(busid));
	}
	
	@GetMapping("fetchpdf/{busschid}")
	public HttpEntity<byte[]> fetchpdf(@RequestBody @PathVariable("busschid") Long busschid)
	{
		return(pdfsrvc.pdfgenerator(busschid));
	}
}