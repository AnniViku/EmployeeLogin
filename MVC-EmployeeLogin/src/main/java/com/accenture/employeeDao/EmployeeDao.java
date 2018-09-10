package com.accenture.employeeDao;

import com.accenture.employeeBo.EmployeeDetails;
import com.accenture.employeeBo.EmployeeLogin;

public interface EmployeeDao {
	
	
	public int userLogin(EmployeeLogin bo);
	
	public EmployeeDetails fetchRow(int id);

}
