package com.cyr.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cyr.rest.entity.Programmer;
import com.cyr.rest.repository.ProgrammerRepository;

@RestController
@RequestMapping("/api")
public class ProgrammerController {
@Autowired
	private ProgrammerRepository prepository;

@PostMapping
public Programmer saveprogrammer(@RequestBody Programmer programmer) {
return prepository.save(programmer);
}
@GetMapping
public List<Programmer> getAllStudents() { 
	 return prepository.findAll(); 
	}
@PutMapping
public Programmer updateProgrammer(@RequestBody Programmer programmer) {
	return prepository.save(programmer);
}
@DeleteMapping
public String deleteProgrammer(@RequestParam Integer id) {
	prepository.deleteById(id);
	return "deleted success";
}
}
