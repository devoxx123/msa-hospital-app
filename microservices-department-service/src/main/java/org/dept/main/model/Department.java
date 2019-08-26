package org.dept.main.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "DEPARTMENT_TBL")
public class Department implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String departmentId;
	private String departmentName;
	private String departmentStaff;
	private String departmentFloor;
	private String departmentDescription;

	public Department() {
	}

	public Department(Long id, String departmentId, String departmentName, String departmentStaff,
			String departmentFloor, String departmentDescription) {
		super();
		this.id = id;
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.departmentStaff = departmentStaff;
		this.departmentFloor = departmentFloor;
		this.departmentDescription = departmentDescription;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getDepartmentStaff() {
		return departmentStaff;
	}

	public void setDepartmentStaff(String departmentStaff) {
		this.departmentStaff = departmentStaff;
	}

	public String getDepartmentFloor() {
		return departmentFloor;
	}

	public void setDepartmentFloor(String departmentFloor) {
		this.departmentFloor = departmentFloor;
	}

	public String getDepartmentDescription() {
		return departmentDescription;
	}

	public void setDepartmentDescription(String departmentDescription) {
		this.departmentDescription = departmentDescription;
	}

}
