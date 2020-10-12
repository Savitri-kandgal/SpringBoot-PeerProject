package com.springbootapp.peerproject.dto;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EnvDTO {

	private static final Logger LOGGER=LoggerFactory.getLogger(EnvDTO.class);
	
	private String env;
	private String url;
	private boolean isAccessible;
	
	public EnvDTO() {
		LOGGER.info("LOGGER : EnvDTO :" + this.getClass().getSimpleName() + "object created");
	}
	public String getEnv() {
		return env;
	}
	public void setEnv(String env) {
		this.env = env;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public boolean isAccessible() {
		return isAccessible;
	}
	public void setAccessible(boolean isAccessible) {
		this.isAccessible = isAccessible;
	}

	
}
