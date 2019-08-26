
package org.dept.main.controller;

import java.util.Date;

import org.dept.main.model.Department;
import org.dept.main.service.DepartmentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentResource {

	private static final Logger LOGGER = LoggerFactory.getLogger(DepartmentResource.class);

	@Autowired
	private DepartmentService departmentService;

	@GetMapping("/dept")
	public String deptHMS() {
		String dept= "Welcome TO Department Status In Hospital Management " + new Date();
		LOGGER.info("Department Message " + dept);
		return dept;
	}

	public Department saveDepartment(@RequestBody Department department) {
		LOGGER.info("Department Details " + department);
		return departmentService.createDepartment(department);

	}
}
