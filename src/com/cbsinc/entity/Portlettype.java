package com.cbsinc.entity;

// Generated 29.03.2014 21:04:05 by Hibernate Tools 3.4.0.CR1

/**
 * Portlettype generated by hbm2java
 */
public class Portlettype implements java.io.Serializable {

	private long portlettypeId;
	private String name;
	private Long langId;

	public Portlettype() {
	}

	public Portlettype(long portlettypeId) {
		this.portlettypeId = portlettypeId;
	}

	public Portlettype(long portlettypeId, String name, Long langId) {
		this.portlettypeId = portlettypeId;
		this.name = name;
		this.langId = langId;
	}

	public long getPortlettypeId() {
		return this.portlettypeId;
	}

	public void setPortlettypeId(long portlettypeId) {
		this.portlettypeId = portlettypeId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getLangId() {
		return this.langId;
	}

	public void setLangId(Long langId) {
		this.langId = langId;
	}

}
