package com.springbootapp.peerproject.Entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Entity
@Table(name="env_info")
public class EnvEntity {

	private static final Logger LOGGER=LoggerFactory.getLogger(EnvEntity.class);
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	@Column(name = "E_ID")
	private int eId;
	@Column(name = "ENV_NAME")
	private String env;
	@Column(name = "URL")
	private String url;
	@Column(name = "IS_ACCESSIBLE")
	private boolean isAccessible;
	
	public EnvEntity() {
		LOGGER.info("LOGGER : EnvEntity :" + this.getClass().getSimpleName() + "object created");
	}
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name="P_ID")
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

	public AppInfoEntity getAppInfoEntity() {
		return appInfoEntity;
	}
	public void setAppInfoEntity(AppInfoEntity appInfoEntity) {
		this.appInfoEntity = appInfoEntity;
	}
	public boolean isAccessible() {
		return isAccessible;
	}
	public void setAccessible(boolean isAccessible) {
		this.isAccessible = isAccessible;
	}
	@Override
	public String toString() {
		return "EnvEntity [eId=" + eId + ", env=" + env + ", url=" + url + ", isAccessible=" + isAccessible + "]";
	}

}
