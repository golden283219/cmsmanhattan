package com.cbsinc.entity;

// Generated 29.03.2014 21:04:05 by Hibernate Tools 3.4.0.CR1

/**
 * Catalog generated by hbm2java
 */
public class Catalog implements java.io.Serializable {

	private Long id;
	private long catalogId;
	private Long userId;
	private String lable;
	private boolean active;
	private Double tax;
	private String description;
	private Long siteId;
	private Long langId;
	private Long parentId;
	private Long catalogImageId;

	public Catalog() {
	}

	public Catalog(long catalogId, boolean active) {
		this.catalogId = catalogId;
		this.active = active;
	}

	public Catalog(long catalogId, Long userId, String lable, boolean active,
			Double tax, String description, Long siteId, Long langId,
			Long parentId, Long catalogImageId) {
		this.catalogId = catalogId;
		this.userId = userId;
		this.lable = lable;
		this.active = active;
		this.tax = tax;
		this.description = description;
		this.siteId = siteId;
		this.langId = langId;
		this.parentId = parentId;
		this.catalogImageId = catalogImageId;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public long getCatalogId() {
		return this.catalogId;
	}

	public void setCatalogId(long catalogId) {
		this.catalogId = catalogId;
	}

	public Long getUserId() {
		return this.userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getLable() {
		return this.lable;
	}

	public void setLable(String lable) {
		this.lable = lable;
	}

	public boolean isActive() {
		return this.active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public Double getTax() {
		return this.tax;
	}

	public void setTax(Double tax) {
		this.tax = tax;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
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

	public Long getParentId() {
		return this.parentId;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	public Long getCatalogImageId() {
		return this.catalogImageId;
	}

	public void setCatalogImageId(Long catalogImageId) {
		this.catalogImageId = catalogImageId;
	}

}
