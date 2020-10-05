package com.springbootapp.peerproject.Entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class EnvEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)	
	private int eId;
	private String env;
	private String url;
	private String accessible;
	
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name="pId")
	private AppInfoEntity appInfoEntity;
	
	
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
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
	public String getAccessible() {
		return accessible;
	}
	public void setAccessible(String accessible) {
		this.accessible = accessible;
	}
	public AppInfoEntity getAppInfoEntity() {
		return appInfoEntity;
	}
	public void setAppInfoEntity(AppInfoEntity appInfoEntity) {
		this.appInfoEntity = appInfoEntity;
	}

}
