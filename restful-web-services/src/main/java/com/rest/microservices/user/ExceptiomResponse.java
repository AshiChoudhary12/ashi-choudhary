package com.rest.microservices.user;

import java.util.Date;

public class ExceptiomResponse {
	private Date timeStamp;
	private String message;
	private String detail;
	public ExceptiomResponse(Date timeStamp, String message, String detail) {
		super();
		this.timeStamp = timeStamp;
		this.message = message;
		this.detail = detail;
	}
	public Date getTimeStamp() {
		return timeStamp;
	}
	public String getMessage() {
		return message;
	}
	public String getDetail() {
		return detail;
	}
	

}
