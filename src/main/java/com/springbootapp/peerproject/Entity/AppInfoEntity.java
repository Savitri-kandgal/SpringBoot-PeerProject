package com.springbootapp.peerproject.Entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Entity
@Table(name = "app_Info")
public class AppInfoEntity {

	private static final Logger LOGGER = LoggerFactory.getLogger(AppInfoEntity.class);

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "P_ID")
	private int pId;
	@Column(name = "P_NAME")
	private String pName;
	@Column(name = "TEAM_MANAGER")
	private String tManager;
	@Column(name = "TEAM_CONTACT_EMAIL")
	private String tEmail;
	@Column(name = "DE_COMISSINED")
	private String dComissined;
	@Column(name = "DEVELOPED_DATE")
	private String dDate;
	@Column(name = "VERSION")
	private String version;
	@Column(name = "LAST_RELEASED")
	private String lReleased;
	@Column(name = "NEXT_RELEASED")
	private String nReleased;
	@Column(name = "CREATED_TIMESTAMP")
	private String createdTime;
	@Column(name = "CREATED_BY")
	private String createdBy;
	@Column(name = "UPDATED_TIMESTAMP")
	private String updatedTime;
	@Column(name = "UPDATED_BY")
	private String updatedBy;

	@OneToMany(mappedBy = "appInfoEntity", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<EnvEntity> envList = new ArrayList<EnvEntity>();

	public AppInfoEntity() {
		LOGGER.info("LOGGER : AppInfoEntity :" + this.getClass().getSimpleName() + "object created");
	}

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

	public String getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(String createdTime) {
		this.createdTime = createdTime;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getUpdatedTime() {
		return updatedTime;
	}

	public void setUpdatedTime(String updatedTime) {
		this.updatedTime = updatedTime;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;

	}

	public List<EnvEntity> getEnvList() {
		return envList;
	}

	public void setEnvList(List<EnvEntity> envList) {
		this.envList = envList;
	}

	@Override
	public String toString() {
		return "AppInfoEntity [pId=" + pId + ", pName=" + pName + ", tManager=" + tManager + ", tEmail=" + tEmail
				+ ", dComissined=" + dComissined + ", dDate=" + dDate + ", version=" + version + ", lReleased="
				+ lReleased + ", nReleased=" + nReleased + ", createdTime=" + createdTime + ", createdBy=" + createdBy
				+ ", updatedTime=" + updatedTime + ", updatedBy=" + updatedBy + "]";
	}

}
