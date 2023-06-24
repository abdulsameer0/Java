package com.management.system.controller;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.LibraryManagementSystem.LMSservice.UserNotFoundException;
import com.management.system.dao.PesentRepository;
import com.management.system.entity.Pesent;
import com.management.system.service.PesentService;


import jakarta.validation.Valid;

@RestController
public class PesentController {
	 
	 @Autowired
	 PesentService service;
	 @Autowired
	 PesentRepository repository;
	 
	@GetMapping("/pesent")
	 public List<Pesent> getPesent() {
		return service.getAllPesent();
	}
	 
	 @PostMapping("/addPesent")
	 public String insertPesent(@RequestBody Pesent pesent) {
		 service.insertPersent(pesent);
		 return "ADDED!!";
	 }
	 @DeleteMapping("deletePesentByID/{id}")
	 public String deletePesent(@PathVariable  int id){
		 service.delelePersentById(id);
		 return "Delete!!!";
	 }
	
	 @PutMapping("/updatePesent")
	 public String updatePesent(@RequestBody @Valid Pesent pesent ) {
		 service.updatePesrent(pesent);
		 return "Updated!!!";
		 
	 }
	 @GetMapping("/findbyid/{id}")
	 public Optional<Pesent> findbyid(@PathVariable int id) throws UserNotFoundException{
		 return service.findbyIdPesent(id);
		 
	 }
		
}
	 

