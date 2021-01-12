package com.tp.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tp.model.Formation;
import com.tp.repository.FormationRepository;

@RestController("formation")
public class FormationController {

	@Autowired
	FormationRepository formationRepository;
	
	@GetMapping("formation")
	public List<Formation> getFormations()
	{
		return (List<Formation>) formationRepository.findAll();
		
		
	}
	@PostMapping("formations")
	public Formation addFormation(@Valid @RequestBody Formation formation)
	{
		System.out.println("ouibi");
		return formationRepository.save(formation);
		
	}
}