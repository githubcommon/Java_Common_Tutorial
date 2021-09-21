package com.murali.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.murali.springboot.model.Employee;
import com.murali.springboot.service.EmployeeService;

/**
 * @author:Sanapala Muralidharan
 * @date:Sep 17, 2021 3:39:36 PM
 * @version:2.x
 */

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @Value("${app.name}")
    private String appName;

    @Value("${app.version}")
    private String appVersion;

    @GetMapping("/version")
    public String getAppDetails() {
	return appName + " - " + appVersion;
    }

    @GetMapping("/employees")
    public List<Employee> getEmployees() {
	return service.getEmployees();
    }

    @GetMapping("/employees/{id}")
    public String getEmployee(@PathVariable("id") Long id) {
	return "Fetching the employee details for the id " + id;
    }

    @PostMapping("/employees")
    public String saveEmployee(@RequestBody Employee employee) {
	return "Saving the employee details to the data base " + employee;
    }

    @PutMapping("/employees/{id}")
    public Employee updateEmployee(@PathVariable Long id, @RequestBody Employee employee) {
	System.out.println("Updating the employee data for the id " + id);
	return employee;
    }

    @DeleteMapping("/employees")
    public String deleteEmployee(@RequestParam("id") Long id) {
	return "Deleting the employee details for the id " + id;
    }
}
