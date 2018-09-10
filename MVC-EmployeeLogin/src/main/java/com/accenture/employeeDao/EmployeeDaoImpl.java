package com.accenture.employeeDao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.accenture.employeeBo.EmployeeDetails;
import com.accenture.employeeBo.EmployeeLogin;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	private static final String AUTH_QRY="select count(*) from employeedata where id=? and username=?";
	
	private static final String FETCH_ROW="select id,username,address,phoneno,projectdetails from employeedata where id=?";
			                               

	@Autowired
	private JdbcTemplate jt;

	@Override
	public int userLogin(EmployeeLogin bo) {
		
		int result=jt.queryForInt(AUTH_QRY,bo.getId(),bo.getUserName());
		
		return result;
	}
	

	@Override
	public EmployeeDetails fetchRow(int id) {
		
		EmployeeDetails details=jt.queryForObject(FETCH_ROW, new RowMapper<EmployeeDetails>(){

			@Override
			public EmployeeDetails mapRow(ResultSet rs, int rowNum) throws SQLException {
				EmployeeDetails details=null;
				//create the Object
				details=new EmployeeDetails();
				details.setId(rs.getInt(1));
				details.setUserName(rs.getString(2));
				details.setAddress(rs.getString(3));
				details.setPhoneNo(rs.getLong(4));
				details.setProjectDetails(rs.getString(5));
				return details;
			}
			
		},id);		
		return details;
	}

}
