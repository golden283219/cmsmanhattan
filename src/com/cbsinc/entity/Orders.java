package com.cbsinc.entity;

// Generated 29.03.2014 21:04:05 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * Orders generated by hbm2java
 */
public class Orders implements java.io.Serializable {

	private long orderId;
	private Long userId;
	private Date deliveryTimeend;
	private double amount;
	private Double tax;
	private Double endAmount;
	private Double deliveryAmount;
	private Integer deliveryLong;
	private Long paystatusId;
	private Date deliveryStart;
	private Date cdate;
	private Long currencyId;
	private Long countryId;
	private Long cityId;
	private String address;
	private String phone;
	private String contactPerson;
	private String email;
	private String fax;
	private String description;
	private Integer zip;
	private Integer treeId;
	private Integer imei;
	private Integer phonemodelId;
	private Long deliverystatusId;

	public Orders() {
	}

	public Orders(long orderId, Date deliveryTimeend, double amount) {
		this.orderId = orderId;
		this.deliveryTimeend = deliveryTimeend;
		this.amount = amount;
	}

	public Orders(long orderId, Long userId, Date deliveryTimeend,
			double amount, Double tax, Double endAmount, Double deliveryAmount,
			Integer deliveryLong, Long paystatusId, Date deliveryStart,
			Date cdate, Long currencyId, Long countryId, Long cityId,
			String address, String phone, String contactPerson, String email,
			String fax, String description, Integer zip, Integer treeId,
			Integer imei, Integer phonemodelId, Long deliverystatusId) {
		this.orderId = orderId;
		this.userId = userId;
		this.deliveryTimeend = deliveryTimeend;
		this.amount = amount;
		this.tax = tax;
		this.endAmount = endAmount;
		this.deliveryAmount = deliveryAmount;
		this.deliveryLong = deliveryLong;
		this.paystatusId = paystatusId;
		this.deliveryStart = deliveryStart;
		this.cdate = cdate;
		this.currencyId = currencyId;
		this.countryId = countryId;
		this.cityId = cityId;
		this.address = address;
		this.phone = phone;
		this.contactPerson = contactPerson;
		this.email = email;
		this.fax = fax;
		this.description = description;
		this.zip = zip;
		this.treeId = treeId;
		this.imei = imei;
		this.phonemodelId = phonemodelId;
		this.deliverystatusId = deliverystatusId;
	}

	public long getOrderId() {
		return this.orderId;
	}

	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}

	public Long getUserId() {
		return this.userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Date getDeliveryTimeend() {
		return this.deliveryTimeend;
	}

	public void setDeliveryTimeend(Date deliveryTimeend) {
		this.deliveryTimeend = deliveryTimeend;
	}

	public double getAmount() {
		return this.amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Double getTax() {
		return this.tax;
	}

	public void setTax(Double tax) {
		this.tax = tax;
	}

	public Double getEndAmount() {
		return this.endAmount;
	}

	public void setEndAmount(Double endAmount) {
		this.endAmount = endAmount;
	}

	public Double getDeliveryAmount() {
		return this.deliveryAmount;
	}

	public void setDeliveryAmount(Double deliveryAmount) {
		this.deliveryAmount = deliveryAmount;
	}

	public Integer getDeliveryLong() {
		return this.deliveryLong;
	}

	public void setDeliveryLong(Integer deliveryLong) {
		this.deliveryLong = deliveryLong;
	}

	public Long getPaystatusId() {
		return this.paystatusId;
	}

	public void setPaystatusId(Long paystatusId) {
		this.paystatusId = paystatusId;
	}

	public Date getDeliveryStart() {
		return this.deliveryStart;
	}

	public void setDeliveryStart(Date deliveryStart) {
		this.deliveryStart = deliveryStart;
	}

	public Date getCdate() {
		return this.cdate;
	}

	public void setCdate(Date cdate) {
		this.cdate = cdate;
	}

	public Long getCurrencyId() {
		return this.currencyId;
	}

	public void setCurrencyId(Long currencyId) {
		this.currencyId = currencyId;
	}

	public Long getCountryId() {
		return this.countryId;
	}

	public void setCountryId(Long countryId) {
		this.countryId = countryId;
	}

	public Long getCityId() {
		return this.cityId;
	}

	public void setCityId(Long cityId) {
		this.cityId = cityId;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getContactPerson() {
		return this.contactPerson;
	}

	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFax() {
		return this.fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getZip() {
		return this.zip;
	}

	public void setZip(Integer zip) {
		this.zip = zip;
	}

	public Integer getTreeId() {
		return this.treeId;
	}

	public void setTreeId(Integer treeId) {
		this.treeId = treeId;
	}

	public Integer getImei() {
		return this.imei;
	}

	public void setImei(Integer imei) {
		this.imei = imei;
	}

	public Integer getPhonemodelId() {
		return this.phonemodelId;
	}

	public void setPhonemodelId(Integer phonemodelId) {
		this.phonemodelId = phonemodelId;
	}

	public Long getDeliverystatusId() {
		return this.deliverystatusId;
	}

	public void setDeliverystatusId(Long deliverystatusId) {
		this.deliverystatusId = deliverystatusId;
	}

}
