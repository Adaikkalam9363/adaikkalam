package com.usestudent.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.usestudent.entity.UseStudent;
import com.usestudent.repository.UseStudentRepository;

@Repository
public class UseStudentDao {
	@Autowired
	UseStudentRepository ur;
	
	public String post(UseStudent e) {
		ur.save(e);
		return "Posted Successfully";
	}
	
	public UseStudent get(int id) {
		return ur.findById(id).get();
	}
	
	
	public String put(UseStudent e) {
		ur.save(e);
		return "Update Succsssfully";
	}
	
	
	public String delete(int id) {
		ur.deleteById(id);
		return "Deleted Succssfully";
	}
	
	
	
	public String postStudentDetail(UseStudent e) {
		 ur.save(e);
		 return "Posted Success";
	}

}
