package com.cbsinc.entity;

// Generated 29.03.2014 21:04:05 by Hibernate Tools 3.4.0.CR1

/**
 * Creteria10 generated by hbm2java
 */
public class Creteria10 implements java.io.Serializable {

	private long creteria10Id;
	private String name;
	private Boolean active;
	private Long langId;
	private long linkId;
	private long catalogId;
	private String label;

	public Creteria10() {
	}

	public Creteria10(long creteria10Id, long linkId, long catalogId) {
		this.creteria10Id = creteria10Id;
		this.linkId = linkId;
		this.catalogId = catalogId;
	}

	public Creteria10(long creteria10Id, String name, Boolean active,
			Long langId, long linkId, long catalogId, String label) {
		this.creteria10Id = creteria10Id;
		this.name = name;
		this.active = active;
		this.langId = langId;
		this.linkId = linkId;
		this.catalogId = catalogId;
		this.label = label;
	}

	public long getCreteria10Id() {
		return this.creteria10Id;
	}

	public void setCreteria10Id(long creteria10Id) {
		this.creteria10Id = creteria10Id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getActive() {
		return this.active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public Long getLangId() {
		return this.langId;
	}

	public void setLangId(Long langId) {
		this.langId = langId;
	}

	public long getLinkId() {
		return this.linkId;
	}

	public void setLinkId(long linkId) {
		this.linkId = linkId;
	}

	public long getCatalogId() {
		return this.catalogId;
	}

	public void setCatalogId(long catalogId) {
		this.catalogId = catalogId;
	}

	public String getLabel() {
		return this.label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

}