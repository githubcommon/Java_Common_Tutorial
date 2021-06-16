package com.murali.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.murali.entity.Employee;

/**
 * @author:Sanapala Muralidharan
 * @date:Jun 16, 2021 3:08:32 PM
 * @version:2.x
 */
@RestController
public class EmployeeController {
    @RequestMapping("/")
    public List<Employee> getEmployees() {
	List<Employee> employeesList = new ArrayList<Employee>();
	employeesList.add(new Employee(1, "Murali", "dharan", "githubcommon@gmail.com"));
	return employeesList;
    }
}
