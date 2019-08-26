package org.dept.main.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "BILLING_TBL")
public class Billing implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String billNumber;
	private String dischargeId;
	private String billingDate;
	private String roomCharges;
	private String serviceCharges;
	private String paymentMode;
	private String paymentModeDetails;
	private String totalCharges;
	private String noOfDays;
	private String totalRoomCharges;

	public Billing() {
	}

	public Billing(Long id, String billNumber, String dischargeId, String billingDate, String roomCharges,
			String serviceCharges, String paymentMode, String paymentModeDetails, String totalCharges, String noOfDays,
			String totalRoomCharges) {
		super();
		this.id = id;
		this.billNumber = billNumber;
		this.dischargeId = dischargeId;
		this.billingDate = billingDate;
		this.roomCharges = roomCharges;
		this.serviceCharges = serviceCharges;
		this.paymentMode = paymentMode;
		this.paymentModeDetails = paymentModeDetails;
		this.totalCharges = totalCharges;
		this.noOfDays = noOfDays;
		this.totalRoomCharges = totalRoomCharges;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBillNumber() {
		return billNumber;
	}

	public void setBillNumber(String billNumber) {
		this.billNumber = billNumber;
	}

	public String getDischargeId() {
		return dischargeId;
	}

	public void setDischargeId(String dischargeId) {
		this.dischargeId = dischargeId;
	}

	public String getBillingDate() {
		return billingDate;
	}

	public void setBillingDate(String billingDate) {
		this.billingDate = billingDate;
	}

	public String getRoomCharges() {
		return roomCharges;
	}

	public void setRoomCharges(String roomCharges) {
		this.roomCharges = roomCharges;
	}

	public String getServiceCharges() {
		return serviceCharges;
	}

	public void setServiceCharges(String serviceCharges) {
		this.serviceCharges = serviceCharges;
	}

	public String getPaymentMode() {
		return paymentMode;
	}

	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}

	public String getPaymentModeDetails() {
		return paymentModeDetails;
	}

	public void setPaymentModeDetails(String paymentModeDetails) {
		this.paymentModeDetails = paymentModeDetails;
	}

	public String getTotalCharges() {
		return totalCharges;
	}

	public void setTotalCharges(String totalCharges) {
		this.totalCharges = totalCharges;
	}

	public String getNoOfDays() {
		return noOfDays;
	}

	public void setNoOfDays(String noOfDays) {
		this.noOfDays = noOfDays;
	}

	public String getTotalRoomCharges() {
		return totalRoomCharges;
	}

	public void setTotalRoomCharges(String totalRoomCharges) {
		this.totalRoomCharges = totalRoomCharges;
	}

}

/*INSERT INTO `bill_room` VALUES (1,'2015-01-12',5000,500,'by Cash','Payment done successfully!',1485500,297,1485000,'120150112')*/
