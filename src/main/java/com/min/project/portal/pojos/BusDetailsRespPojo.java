package com.min.project.portal.pojos;

import java.util.List;

import com.min.project.portal.model.BusDetailsModel;
import com.min.project.portal.model.BusDispatchModel;

public class BusDetailsRespPojo {
	List<String> locationname;
	BusDetailsModel busdtls;
	String status;
	String reason;
	public List<String> getLocationname() {
		return locationname;
	}
	public void setLocationname(List<String> locationname) {
		this.locationname = locationname;
	}
	public BusDetailsModel getBusdtls() {
		return busdtls;
	}
	public void setBusdtls(BusDetailsModel busdtls) {
		this.busdtls = busdtls;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	
}
