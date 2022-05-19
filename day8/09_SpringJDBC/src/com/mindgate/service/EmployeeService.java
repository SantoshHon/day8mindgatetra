package com.mindgate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.mindgate.dao.EmployeeDaoInterface;
import com.mindgate.pojo.Employee;

@Service("employeeService")
@Scope("prototype")
public class EmployeeService implements EmployeeServiceInterface {
	@Autowired
	private EmployeeDaoInterface employeeDaoInterface;

	@Override
	public boolean addNewEmployee(Employee employee) {
		System.out.println("inside EmployeeSevice addnewEmployee");
		System.out.println(employee);

		return employeeDaoInterface.addNewEmployee(employee);
	}

	@Override
	public List<Employee> getallEmployees() {
		return employeeDaoInterface.getallEmployees();
	}

	@Override
	public Employee getEmployeeByEmployeeId(int empployeeId) {
		return employeeDaoInterface.getEmployeeByEmployeeId(empployeeId);
	}

	@Override
	public boolean updateEmployee(Employee employee) {
		return employeeDaoInterface.updateEmployee(employee);
	}

	@Override
	public boolean deleteEmployeeByEmployeeId(int employeeId) {
		return employeeDaoInterface.deleteEmployeeByEmployeeId(employeeId);
	}

}
