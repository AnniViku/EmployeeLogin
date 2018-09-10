package com.accenture.employeeService;

import com.accenture.employeeBo.EmployeeDetails;
import com.accenture.employeeBo.EmployeeLogin;

public interface EmployeeService {
	

	public String userLogin(EmployeeLogin bo);
	public EmployeeDetails fetchRow(int id);

}
