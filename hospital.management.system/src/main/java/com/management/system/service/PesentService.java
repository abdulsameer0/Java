package com.management.system.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;


import com.management.system.dao.PesentRepository;
import com.management.system.entity.Pesent;

@Service
public class PesentService {
        @Autowired
        PesentRepository repository;
        
        
	public List<Pesent> getAllPesent() {
		ArrayList<Pesent> list = new ArrayList<>();
		 repository.findAll().forEach(list :: add);
		 return list;
		 
		 
	}
	
	public void insertPersent(Pesent pesent) {
		repository.save(pesent);
	}
	
	public void delelePersentById(int id) {
		repository.deleteById(id);
	}
	
	
	
	  public void updatePesrent(Pesent name) { 
	// TODO Auto-generated method stub
	  repository.save(name);
	  
	  }
	
	 
	public Optional<Pesent> findbyIdPesent(int id){
		return repository.findById(id);
	}
	
}
