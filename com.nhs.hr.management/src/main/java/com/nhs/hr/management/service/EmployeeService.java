package com.nhs.hr.management.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nhs.hr.management.entity.Employee;
import com.nhs.hr.management.entity.repository.EmployeeRepository;
import com.nhs.hr.management.exception.EntityNotFoundException;

/**
 * Service class to handle the Employee handling operations for NHS HR
 * management application.
 * 
 * @author Anoop Abraham
 *
 */
@Service
public class EmployeeService {

	/**
	 * Instance variable for employeeRepository
	 */
	@Autowired
	EmployeeRepository employeeRepository;

	/**
	 * Method to save the Employee entity.
	 * 
	 * @param employee
	 */
	public void createEmployee(Employee employee) {
		employeeRepository.save(employee);
	}

	/**
	 * Method to fetch the Employee based on employee id.
	 * 
	 * @param id
	 * @return
	 */
	public Employee getEmployee(Long id) {
		Optional<Employee> employees = employeeRepository.findById(id);
		if (!employees.isPresent())
			throw new EntityNotFoundException("Employee record is not available for the given id");
		return employees.get();
	}

	/**
	 * Method to delete the Employee based on employee id.
	 * 
	 * @param id
	 * @return
	 */
	public void deleteEmployee(Long id) {
		employeeRepository.deleteById(id);
	}

	/**
	 * Method to fetch all the employees in the database.
	 * 
	 * @return
	 */
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}

	/**
	 * Method to update the Employee entity attributes.
	 * 
	 * @param employee
	 */
	public void updateEmployee(Employee employee) {
		Optional<Employee> employees = employeeRepository.findById(employee.getId());
		if (!employees.isPresent())
			throw new EntityNotFoundException("Employee record is not available for the given id");

		employeeRepository.save(employee);
	}

}
