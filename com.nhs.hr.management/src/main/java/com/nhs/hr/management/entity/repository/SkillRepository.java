package com.nhs.hr.management.entity.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nhs.hr.management.entity.Skill;

/**
 * Repository interface to handle the Skill entity database operations.
 * 
 * @author Anoop Abraham
 *
 */
public interface SkillRepository extends JpaRepository<Skill, Long> {

}
