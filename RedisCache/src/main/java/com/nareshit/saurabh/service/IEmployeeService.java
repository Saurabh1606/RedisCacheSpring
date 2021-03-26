package com.nareshit.saurabh.service;

import java.util.List;

import com.nareshit.saurabh.model.Employee;

public interface IEmployeeService {
	public Employee createEmployee(Employee employee);
	public Employee updateEmployee(Integer empId,Employee employee);
	public void deleteEmployee(Integer empId);
	
	public Employee getOneEmployee(Integer empId);
	public List<Employee> getAllEmployees();
}
