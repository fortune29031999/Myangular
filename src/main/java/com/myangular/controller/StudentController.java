package com.myangular.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.myangular.MyAngularApplication;
import com.myangular.entity.Myangularentity;
import com.myangular.sevice.StudentfileService;

@RestController
public class StudentController extends Exception {
	@Autowired
	StudentfileService studentfileservice;
	
	static Logger log = Logger.getLogger(MyAngularApplication.class);
	
	@PostMapping("/insert") 
	public String insertAll(@RequestBody List<Myangularentity> a) {
		return studentfileservice.insertAll(a);
	}
	
	@GetMapping("/get")
	public List<Myangularentity> get() {
		return studentfileservice.get();
	}
	
	@GetMapping("/getbyname")
	public List<Myangularentity> getname(@RequestParam String course) throws Exception {
		PropertyConfigurator.configure("Myangular.properties");
		log.info(studentfileservice.getname(course));
		return studentfileservice.getname(course);
	}

}
