package com.mindgate.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mindgate.pojo.Address;
import com.mindgate.pojo.Employee;

public class AnnotationMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext applicationContext= new ClassPathXmlApplicationContext("spring.xml");
		Address address=applicationContext.getBean("address",Address.class);
		
		address.setAddressId(101);
		address.setCity("sangli");
		address.setStreet("M.G.Road");
		address.setCity("Mumbai");
		address.setState("Maharashrta");
		System.out.println(address);
		System.out.println("-".repeat(50));
		Employee employee=applicationContext.getBean("employee",Employee.class);
		employee.setEmployeeId(1077);
		employee.setName("Santosh");
		employee.setSalary(1000);
		employee.setHomeAddress(address);
		System.out.println(employee);

	}

}
