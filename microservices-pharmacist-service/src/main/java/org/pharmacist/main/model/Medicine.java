package org.pharmacist.main.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MEDICIAN_TBL")
public class Medicine implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String medicineId;
	private String medicineName;
	private String cost;
	private String quantity;
	private String manufacturDate;
	private String medicianExpired;
	private String unitPerDay;

	public Medicine() {
	}

	public Medicine(Long id, String medicineId, String medicineName, String cost, String quantity,
			String manufacturDate, String medicianExpired, String unitPerDay) {
		super();
		this.id = id;
		this.medicineId = medicineId;
		this.medicineName = medicineName;
		this.cost = cost;
		this.quantity = quantity;
		this.manufacturDate = manufacturDate;
		this.medicianExpired = medicianExpired;
		this.unitPerDay = unitPerDay;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMedicineId() {
		return medicineId;
	}

	public void setMedicineId(String medicineId) {
		this.medicineId = medicineId;
	}

	public String getMedicineName() {
		return medicineName;
	}

	public void setMedicineName(String medicineName) {
		this.medicineName = medicineName;
	}

	public String getCost() {
		return cost;
	}

	public void setCost(String cost) {
		this.cost = cost;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getManufacturDate() {
		return manufacturDate;
	}

	public void setManufacturDate(String manufacturDate) {
		this.manufacturDate = manufacturDate;
	}

	public String getMedicianExpired() {
		return medicianExpired;
	}

	public void setMedicianExpired(String medicianExpired) {
		this.medicianExpired = medicianExpired;
	}

	public String getUnitPerDay() {
		return unitPerDay;
	}

	public void setUnitPerDay(String unitPerDay) {
		this.unitPerDay = unitPerDay;
	}

}
