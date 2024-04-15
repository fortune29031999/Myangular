package com.myangular.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myangular.entity.Myangularentity;

public interface StudentfileRepository extends JpaRepository<Myangularentity, Integer>{
	
	

}
