package com.employee;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class TestEmployeeDetails {
	EmployeeBusiness employeebusiness=new EmployeeBusiness();
	EmployeeDetails employee=new EmployeeDetails();
	@Test
	public void testCalculateApprisal() {
		employee.setName("Aiswarya");
		employee.setAge(22);
		employee.setMonthlySalary(8000);
		
		double appraisal= employeebusiness.calculateappraisal(employee);
		assertEquals(500,appraisal,0.0);
	}
	@Test
	public void testcalculateyearlysalary() {
		employee.setName("Aiswarya");
		employee.setAge(22);
		employee.setMonthlySalary(8000);
		
		double salary= employeebusiness.calculateyearlysalary(employee);
		assertEquals(96000,salary,0.0);
	}
	}
	

