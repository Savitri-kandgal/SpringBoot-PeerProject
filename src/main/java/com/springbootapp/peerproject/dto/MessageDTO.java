package com.springbootapp.peerproject.dto;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MessageDTO {

	 private static final Logger LOGGER=LoggerFactory.getLogger(MessageDTO.class);
	 
	private String fName;
	private String tName;
	private String message;

public MessageDTO() {
	LOGGER.info("LOGGER : MessageDTO :" + this.getClass().getSimpleName() + "object created");
}
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String gettName() {
		return tName;
	}

	public void settName(String tName) {
		this.tName = tName;
	}

	

}
