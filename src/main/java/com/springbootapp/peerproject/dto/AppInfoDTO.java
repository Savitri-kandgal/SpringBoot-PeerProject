package com.springbootapp.peerproject.dto;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AppInfoDTO {

	private static final Logger LOGGER = LoggerFactory.getLogger(AppInfoDTO1.class);

	private String pName;
	private String tManager;
	private String tEmail;
	private String dComissined;
	private String dDate;
	private String version;
	private String lReleased;
	private String nReleased;

	public AppInfoDTO() {
		LOGGER.info("LOGGER : AppInfoDTO :" + this.getClass().getSimpleName() + "object created");
	}

	ArrayList<EnvDTO> environmentList;

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public String gettManager() {
		return tManager;
	}

	public void settManager(String tManager) {
		this.tManager = tManager;
	}

	public String gettEmail() {
		return tEmail;
	}

	public void settEmail(String tEmail) {
		this.tEmail = tEmail;
	}

	public String getdComissined() {
		return dComissined;
	}

	public void setdComissined(String dComissined) {
		this.dComissined = dComissined;
	}

	public String getdDate() {
		return dDate;
	}

	public void setdDate(String dDate) {
		this.dDate = dDate;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getlReleased() {
		return lReleased;
	}

	public void setlReleased(String lReleased) {
		this.lReleased = lReleased;
	}

	public String getnReleased() {
		return nReleased;
	}

	public void setnReleased(String nReleased) {
		this.nReleased = nReleased;
	}

	public ArrayList<EnvDTO> getEnvironmentList() {
		return environmentList;
	}

	public void setEnvironmentList(ArrayList<EnvDTO> environmentList) {
		this.environmentList = environmentList;
	}
}
