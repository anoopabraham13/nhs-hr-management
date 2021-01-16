package com.nhs.hr.management.entity;

import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToMany;

import org.hibernate.annotations.DynamicUpdate;

import com.nhs.hr.management.entity.domain.Gender;

/**
 * Entity class to capture the details about the employee in NHS HR management
 * application.
 * 
 * @author Anoop Abraham
 *
 */
@Entity
@DynamicUpdate
public class Employee extends BusinessEntity {

	/**
	 * Employee first Name
	 */
	private String firstName;

	/**
	 * Employee middle Name
	 */
	private String middleName;

	/**
	 * Employee last Name
	 */
	private String lastName;

	/**
	 * Employee date Of Birth
	 */
	private Date dateOfBirth;

	/**
	 * Employee gender
	 */
	@Enumerated(EnumType.STRING)
	private Gender gender;

	/**
	 * Employee skills
	 */
	@OneToMany(cascade = CascadeType.ALL)
	private List<EmployeeSkill> skills;

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the middleName
	 */
	public String getMiddleName() {
		return middleName;
	}

	/**
	 * @param middleName the middleName to set
	 */
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the dateOfBirth
	 */
	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	/**
	 * @param dateOfBirth the dateOfBirth to set
	 */
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	/**
	 * @return the gender
	 */
	public Gender getGender() {
		return gender;
	}

	/**
	 * @param gender the gender to set
	 */
	public void setGender(Gender gender) {
		this.gender = gender;
	}

	/**
	 * @return the skills
	 */
	public List<EmployeeSkill> getSkills() {
		return skills;
	}

	/**
	 * @param skills the skills to set
	 */
	public void setSkills(List<EmployeeSkill> skills) {
		this.skills = skills;
	}

}
