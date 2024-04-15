package com.myangular.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.myangular.entity.Myangularentity;
import com.myangular.repository.StudentfileRepository;

@Repository
public class Studentfiledao {
@Autowired
StudentfileRepository studentfilerepository;

public String insertAll(List<Myangularentity> a) {
	studentfilerepository.saveAll(a);
	return "inserted";
}
public List<Myangularentity> get() {
	return studentfilerepository.findAll();
}
public List<Myangularentity> getname() {
	return studentfilerepository.findAll();
}
}
