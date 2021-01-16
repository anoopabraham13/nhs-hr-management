package com.nhs.hr.management.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.DynamicUpdate;

import com.nhs.hr.management.entity.domain.SkillLevel;

/**
 * Entity class to capture the Skill related details of the {@link Employee} in
 * NHS HR management application.
 * 
 * @author Anoop Abraham
 *
 */
@Entity
@DynamicUpdate
public class EmployeeSkill extends BusinessEntity {

	/**
	 * Skill
	 */
	@OneToOne(cascade = CascadeType.ALL)
	private Skill skill;

	/**
	 * Skill level.
	 */
	@Enumerated(EnumType.STRING)
	private SkillLevel skillLevel;

	/**
	 * @return the skill
	 */
	public Skill getSkill() {
		return skill;
	}

	/**
	 * @param skill the skill to set
	 */
	public void setSkill(Skill skill) {
		this.skill = skill;
	}

	/**
	 * @return the skillLevel
	 */
	public SkillLevel getSkillLevel() {
		return skillLevel;
	}

	/**
	 * @param skillLevel the skillLevel to set
	 */
	public void setSkillLevel(SkillLevel skillLevel) {
		this.skillLevel = skillLevel;
	}

}
