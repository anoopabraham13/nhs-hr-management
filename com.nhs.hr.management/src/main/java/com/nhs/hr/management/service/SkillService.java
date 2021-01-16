package com.nhs.hr.management.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nhs.hr.management.entity.Skill;
import com.nhs.hr.management.entity.repository.SkillRepository;
import com.nhs.hr.management.exception.EntityNotFoundException;

/**
 * Service class to handle the Employee handling operations for NHS HR
 * management application.
 * 
 * @author Anoop Abraham
 *
 */
@Service
public class SkillService {

	/**
	 * Instance variable for skillRepository
	 */
	@Autowired
	SkillRepository skillRepository;

	/**
	 * Method to save the Skill entity.
	 * 
	 * @param skill
	 */
	public void createSkill(Skill skill) {
		skillRepository.save(skill);
	}

	/**
	 * Method to fetch the Skill based on employee id.
	 * 
	 * @param id
	 * @return
	 */
	public Skill getSkill(Long id) {
		Optional<Skill> skills = skillRepository.findById(id);
		if (!skills.isPresent())
			throw new EntityNotFoundException("Skill record is not available for the given id");
		return skills.get();
	}

	/**
	 * Method to delete the Skill based on id.
	 * 
	 * @param id
	 * @return
	 */
	public void deleteSkill(Long id) {
		skillRepository.deleteById(id);
	}

	/**
	 * Method to fetch all the Skills in the database.
	 * 
	 * @return
	 */
	public List<Skill> getAllSkills() {
		return skillRepository.findAll();
	}

	/**
	 * Method to update the Skill entity attributes.
	 * 
	 * @param skill
	 */
	public void updateSkill(Skill skill) {
		Optional<Skill> skills = skillRepository.findById(skill.getId());
		if (!skills.isPresent())
			throw new EntityNotFoundException("Skill record is not available for the given id");
		skillRepository.save(skill);
	}

}
