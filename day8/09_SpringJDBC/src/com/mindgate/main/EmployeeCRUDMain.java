package com.mindgate.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mindgate.config.ApplicationConfig;
import com.mindgate.pojo.Employee;
import com.mindgate.service.EmployeeService;
import com.mindgate.service.EmployeeServiceInterface;

public class EmployeeCRUDMain {

	public static void main(String[] args) {
		Employee employee = new Employee(2, "Rahul", 1000);
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		EmployeeServiceInterface employeeServiceInterface = applicationContext.getBean("employeeService",
				EmployeeService.class);
//		boolean result= employeeServiceInterface.addNewEmployee(employee);
//		if(result)
//		{
//			System.out.println("Employee added sucessfully");
//		}
//		else
//		{
//			System.out.println("Fails to add new Employee");
//		}
//		List<Employee> allEmployees = employeeServiceInterface.getallEmployees();
//		for (Employee emp : allEmployees) {
//			System.out.println(emp);
//		}
//		System.out.println("-".repeat(100));
//		Employee sachin = employeeServiceInterface.getEmployeeByEmployeeId(25);
//		System.out.println(sachin);
//		Employee emp= new Employee(60,"Springjdbc", 30000);
//		boolean result=employeeServiceInterface.updateEmployee(emp);
//		if(result)
//		{
//			System.out.println("Employee update sucessfully");
//		}
//		else
//		{
//			System.out.println("Faile to update employee");
//		}
		boolean result1=employeeServiceInterface.deleteEmployeeByEmployeeId(50);
		if(result1)
		{
			System.out.println("Employee delete sucessfully");
		}
		else
		{
			System.out.println("Faile to delete employee");
		}

	}

}
