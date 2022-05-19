package com.mindgate.main;

import com.mindgate.pojo.Address;
import com.mindgate.pojo.Employee;

public class Main {

	public static void main(String[] args) {

		Employee employee=new Employee(101, "santosh", 50000, new Address(1022, "M.G. ROAD", "SANGLI", "MAHARASHTRA") );
		System.out.println(employee);
	}

}
