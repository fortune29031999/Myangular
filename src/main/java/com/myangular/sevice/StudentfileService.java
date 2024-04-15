package com.myangular.sevice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myangular.dao.Studentfiledao;
import com.myangular.entity.Myangularentity;
import com.myangular.exception.Coursenotfoundexception;

@Service
public class StudentfileService {
	@Autowired
	Studentfiledao studentfiledao;

	public String insertAll(List<Myangularentity> a) {
		return studentfiledao.insertAll(a);
	}

	public List<Myangularentity> get() {
		return studentfiledao.get();
	}

	public List<Myangularentity> getname(String course) throws Exception{
		List<Myangularentity> b = new ArrayList<>();
		for (Myangularentity x : studentfiledao.getname()) {
			if (course.equalsIgnoreCase(x.getCourse())) {
				b.add(x);
			}
			else if(course.equalsIgnoreCase("")) {
				throw new Coursenotfoundexception("course is empty");
			}
		}

		return b;
	}

}
