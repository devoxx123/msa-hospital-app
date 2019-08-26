package org.dept.main.service;

import org.apache.commons.lang.RandomStringUtils;
import org.dept.main.model.Department;
import org.dept.main.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	private DepartmentRepository departmentRepository;

	@Override
	public Department createDepartment(Department department) {
		department.setDepartmentId(RandomStringUtils.randomNumeric(8));
		return departmentRepository.save(department);
	}

}
