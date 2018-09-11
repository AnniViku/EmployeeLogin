package com.accenture.test;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mockito;

import com.accenture.employeeBo.EmployeeLogin;
import com.accenture.employeeDao.EmployeeDao;
import com.accenture.employeeService.EmployeeService;
import com.accenture.employeeService.EmployeeServiceImpl;

public class EmployeeServiceLoginTest {
	
	private static EmployeeService service;
	
	private static EmployeeDao mockDao;
	
	private static EmployeeLogin domain;
	
	
	@BeforeClass
	public static void setUpBeforeClass(){
		
		//create the mock Object for the EmployeeDao 
		mockDao=Mockito.mock(EmployeeDao.class);
		
		//set mockDao to the EmployeeService class
		service=new EmployeeServiceImpl();
		
		
		((EmployeeServiceImpl)service).setDao(mockDao);
		
	}
	
	
	@Test
	public void testWithValidCredintials(){
		
		String msg=null;
		
		//generate mock result 
		Mockito.when(mockDao.userLogin(domain)).thenReturn(1);
		msg=service.userLogin(domain);
		assertEquals("Employee Logged SuccessFully", "Employee Logged SuccessFully");
		
	}
	
	@AfterClass
	public static void tearDownAfterClass(){
		mockDao=null;
		
	}

}
