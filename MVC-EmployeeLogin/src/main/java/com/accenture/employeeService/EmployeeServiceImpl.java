package com.accenture.employeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accenture.employeeBo.EmployeeDetails;
import com.accenture.employeeBo.EmployeeLogin;
import com.accenture.employeeDao.EmployeeDao;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao dao;

	@Override
	public String userLogin(EmployeeLogin bo) {

		
		int result=dao.userLogin(bo);
		if(result==1){
			
			return "Employee Logged SuccessFully";
		}
		else
			return "Employee Credential is not Valid";
	}

	@Override
	public EmployeeDetails fetchRow(int id) {
		
		//use the dao Object
		EmployeeDetails details=dao.fetchRow(id);
		return details;
	}

}
