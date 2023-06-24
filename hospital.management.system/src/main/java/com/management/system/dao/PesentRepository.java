package com.management.system.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.management.system.entity.Pesent;
@Repository
public interface PesentRepository extends CrudRepository<Pesent, Integer> {

	//void save(int id);

}
