package com.employee;

public class EmployeeBusiness {
	public double calculateyearlysalary(EmployeeDetails employeeDetails) {
		double yearlysalary=0;
		yearlysalary=employeeDetails.getMonthlySalary()*12;
		return yearlysalary;
	}
	public double calculateappraisal(EmployeeDetails employeeDetails) {
		double appraisal=0;
		if(employeeDetails.getMonthlySalary()<10000) {
			appraisal=500;
		}else
		{
			appraisal=1000;
		}
		return appraisal;
	}

}
