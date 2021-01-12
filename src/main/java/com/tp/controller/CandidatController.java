package com.tp.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tp.model.Candidat;
import com.tp.repository.CandidatRepository;

@RestController
@RequestMapping("/candidats")
public class CandidatController {
	
	@Autowired
	CandidatRepository candidatRepository;
	
	@GetMapping
	public List<Candidat> afficherCandidats(){
		return (List<Candidat>) candidatRepository.findAll();
	}
	
	@PostMapping
	public Candidat ajouterCandidat(@Valid @RequestBody Candidat candidat) {
		String code = candidat.getCodeAcces();
		//String hashedcode=new BCryptPasswordEncoder().encode(code);
		//candidat.setCodeAcces(hashedcode);
		return candidatRepository.save(candidat);
	}

}
