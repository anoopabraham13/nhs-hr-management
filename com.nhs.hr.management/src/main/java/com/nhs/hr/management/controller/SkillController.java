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

import com.nhs.hr.management.entity.Skill;
import com.nhs.hr.management.service.SkillService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * Controller class to Handle the Employee Skill handling operations for NHS HR
 * management application.
 * 
 * @author Anoop Abraham
 *
 */
@Api(value = "NHS Skill Management")
@RestController
@RequestMapping("/skill")
public class SkillController {

	/**
	 * Instance variable to hold SkillService instance.
	 */
	@Autowired
	private SkillService skillService;

	/**
	 * Method to Create a new Skill in the NHS Skill Management system.
	 * 
	 * @param skill
	 * @return
	 */
	@ApiOperation(value = "Create a new Skill")
	@PostMapping("/create")
	public HttpStatus createSkill(@RequestBody Skill skill) {
		skillService.createSkill(skill);
		return HttpStatus.CREATED;
	}

	/**
	 * Method to Fetch all the Skills in the NHS Skill Management system.
	 * 
	 * @return
	 */
	@ApiOperation(value = "Fetch all the Skills")
	@GetMapping
	public ResponseEntity<List<Skill>> getAllSkills() {
		List<Skill> skillList = skillService.getAllSkills();
		return new ResponseEntity<List<Skill>>(skillList, new HttpHeaders(), HttpStatus.OK);
	}

	/**
	 * Method to Fetch the Skill for the id in the NHS Skill Management system.
	 * 
	 * @param id
	 * @return
	 */
	@ApiOperation(value = "Fetch the Skill for the id")
	@GetMapping(value = "/{id}")
	public ResponseEntity<Skill> getSkill(@PathVariable("id") final Long id) {
		Skill skill = skillService.getSkill(id);
		return new ResponseEntity<Skill>(skill, new HttpHeaders(), HttpStatus.OK);
	}

	/**
	 * Method to Delete the Skill for the id in the NHS Skill Management system.
	 * 
	 * @param id
	 * @return
	 */
	@ApiOperation(value = "Delete the Skill for the id")
	@DeleteMapping(value = "/{id}")
	public HttpStatus deleteSkill(@PathVariable("id") final Long id) {
		skillService.deleteSkill(id);
		return HttpStatus.OK;
	}

	/**
	 * Method to Update the the Skill in the NHS Skill Management system.
	 * 
	 * @param skill
	 * @return
	 */
	@ApiOperation(value = "Update the the Skill")
	@PutMapping(value = "/update")
	public HttpStatus updateSkill(@RequestBody Skill skill) {
		skillService.updateSkill(skill);
		return HttpStatus.OK;
	}
}
