package com.murali.springboot.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.murali.springboot.model.Employee;

@Service
public class EmployeeServiceimpl implements EmployeeService {

    private static List<Employee> list = new ArrayList<Employee>();
    static {
	Employee e = new Employee();
	e.setName("Murali");
	e.setAge(34L);
	e.setDepartment("IT");
	e.setEmail("m@gmail.com");
	e.setLocation("Hyderabad");
	list.add(e);
	
	e.setName("Naveen");
	e.setAge(34L);
	e.setDepartment("Business");
	e.setEmail("n@gmail.com");
	e.setLocation("Malaysia");
	list.add(e);
    }

    @Override
    public List<Employee> getEmployees() {

	return list;
    }

}
