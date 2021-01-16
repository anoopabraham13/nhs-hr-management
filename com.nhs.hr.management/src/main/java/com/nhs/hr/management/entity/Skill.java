package com.nhs.hr.management.entity;

import javax.persistence.Entity;

import org.hibernate.annotations.DynamicUpdate;

/**
 * Entity class to capture the details about the Skill which is used in NHS HR
 * management application.
 * 
 * @author Anoop Abraham
 *
 */
@Entity
@DynamicUpdate
public class Skill extends BusinessEntity {

	/**
	 * short name of the skill
	 */
	private String skillName;

	/**
	 * description about the skill.
	 */
	private String skillDescription;

	/**
	 * @return the skillName
	 */
	public String getSkillName() {
		return skillName;
	}

	/**
	 * @param skillName the skillName to set
	 */
	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}

	/**
	 * @return the skillDescription
	 */
	public String getSkillDescription() {
		return skillDescription;
	}

	/**
	 * @param skillDescription the skillDescription to set
	 */
	public void setSkillDescription(String skillDescription) {
		this.skillDescription = skillDescription;
	}

}
