package com.nhs.hr.management.entity.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nhs.hr.management.entity.Employee;

/**
 * Repository interface to handle the Employee entity database operations.
 * 
 * @author Anoop Abraham
 *
 */
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
