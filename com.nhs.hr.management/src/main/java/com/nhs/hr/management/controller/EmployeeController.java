package com.nhs.hr.management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nhs.hr.management.entity.Employee;
import com.nhs.hr.management.service.EmployeeService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * Controller class to Handle the Employee handling operations for NHS HR
 * management application.
 * 
 * @author Anoop Abraham
 *
 */
@Api(value = "NHS Employee Management")
@RestController
@RequestMapping("/employee")
public class EmployeeController {

	/**
	 * Instance variable to hold EmployeeService instance.
	 */
	@Autowired
	private EmployeeService employeeService;

	/**
	 * Method to Create a new Employee for NHS Employee Management system.
	 * 
	 * @param employee
	 * @return
	 */
	@ApiOperation(value = "Create a new Employee")
	@PostMapping("/create")
	public HttpStatus createEmployee(@RequestBody Employee employee) {
		employeeService.createEmployee(employee);
		return HttpStatus.CREATED;
	}

	/**
	 * Method to Fetch all the Employees in the NHS Employee Management system.
	 * 
	 * @return
	 */
	@ApiOperation(value = "Fetch all the Employees")
	@GetMapping
	public ResponseEntity<List<Employee>> getAllEmployees() {
		List<Employee> employeeList = employeeService.getAllEmployees();
		return new ResponseEntity<List<Employee>>(employeeList, new HttpHeaders(), HttpStatus.OK);
	}

	/**
	 * Method to Fetch the Employee for the id in the NHS Employee Management
	 * system.
	 * 
	 * @param id
	 * @return
	 */
	@ApiOperation(value = "Fetch the Employee for the id")
	@GetMapping(value = "/{id}")
	public ResponseEntity<Employee> getEmployee(@PathVariable("id") final Long id) {
		Employee employee = employeeService.getEmployee(id);
		return new ResponseEntity<Employee>(employee, new HttpHeaders(), HttpStatus.OK);
	}

	/**
	 * Method to Delete the Employee for the id in the NHS Employee Management
	 * system.
	 * 
	 * @param id
	 * @return
	 */
	@ApiOperation(value = "Delete the Employee for the id")
	@DeleteMapping(value = "/{id}")
	public HttpStatus deleteEmployee(@PathVariable("id") final Long id) {
		employeeService.deleteEmployee(id);
		return HttpStatus.OK;
	}

	/**
	 * Method to Update the the Employee in the NHS Employee Management system.
	 * 
	 * @param employee
	 * @return
	 */
	@ApiOperation(value = "Update the the Employee")
	@PutMapping(value = "/update")
	public HttpStatus updateEmployee(@RequestBody Employee employee) {
		employeeService.updateEmployee(employee);
		return HttpStatus.OK;
	}
}
