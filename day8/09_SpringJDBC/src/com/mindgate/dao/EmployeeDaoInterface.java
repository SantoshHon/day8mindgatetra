package com.mindgate.dao;

import java.util.List;

import com.mindgate.pojo.Employee;

public interface EmployeeDaoInterface {
	public boolean addNewEmployee(Employee employee) ;
	public List<Employee>getallEmployees();
	public Employee getEmployeeByEmployeeId(int empployeeId);
	public boolean updateEmployee(Employee employee);
	public boolean deleteEmployeeByEmployeeId(int employeeId);


}
