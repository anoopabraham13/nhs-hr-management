package com.nhs.hr.management.entity.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nhs.hr.management.entity.EmployeeSkill;

/**
 * Repository interface to handle the EmployeeSkill entity database operations.
 * 
 * @author Anoop Abraham
 *
 */
public interface EmployeeSkillRepository extends JpaRepository<EmployeeSkill, Long> {

}
