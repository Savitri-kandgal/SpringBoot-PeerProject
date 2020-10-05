package com.springbootapp.peerproject.Entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class AppInfoEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)	
	private int pId;
	private String pName;
	private String tManager;
	private String tEmail;
	private String dComissined;
	private String dDate;
	private String version;
	private String lReleased;
	private String nReleased;
	
	@OneToMany(mappedBy = "appInfoEntity", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<EnvEntity> envEntity = new ArrayList<EnvEntity>();
	
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	
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

	public List<EnvEntity> getEnvEntity() {
		return envEntity;
	}
	public void setEnvEntity(List<EnvEntity> envEntity) {
		this.envEntity = envEntity;
	}
	
	
	
}
