package com.cbsinc.entity;

// Generated 29.03.2014 21:04:05 by Hibernate Tools 3.4.0.CR1

/**
 * Licence generated by hbm2java
 */
public class Licence implements java.io.Serializable {

	private long licenceId;
	private String lable;
	private String description;
	private boolean active;
	private Long siteId;
	private Long langId;

	public Licence() {
	}

	public Licence(long licenceId, boolean active) {
		this.licenceId = licenceId;
		this.active = active;
	}

	public Licence(long licenceId, String lable, String description,
			boolean active, Long siteId, Long langId) {
		this.licenceId = licenceId;
		this.lable = lable;
		this.description = description;
		this.active = active;
		this.siteId = siteId;
		this.langId = langId;
	}

	public long getLicenceId() {
		return this.licenceId;
	}

	public void setLicenceId(long licenceId) {
		this.licenceId = licenceId;
	}

	public String getLable() {
		return this.lable;
	}

	public void setLable(String lable) {
		this.lable = lable;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isActive() {
		return this.active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public Long getSiteId() {
		return this.siteId;
	}

	public void setSiteId(Long siteId) {
		this.siteId = siteId;
	}

	public Long getLangId() {
		return this.langId;
	}

	public void setLangId(Long langId) {
		this.langId = langId;
	}

}
