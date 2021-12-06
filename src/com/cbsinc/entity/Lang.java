package com.cbsinc.entity;

// Generated 29.03.2014 21:04:05 by Hibernate Tools 3.4.0.CR1

/**
 * Lang generated by hbm2java
 */
public class Lang implements java.io.Serializable {

	private long langId;
	private String lable;
	private String description;
	private boolean active;

	public Lang() {
	}

	public Lang(long langId, boolean active) {
		this.langId = langId;
		this.active = active;
	}

	public Lang(long langId, String lable, String description, boolean active) {
		this.langId = langId;
		this.lable = lable;
		this.description = description;
		this.active = active;
	}

	public long getLangId() {
		return this.langId;
	}

	public void setLangId(long langId) {
		this.langId = langId;
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

}