package com.usestudent.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.usestudent.dao.UseStudentDao;
import com.usestudent.entity.UseStudent;
import com.usestudent.exception.AgeException;

@Service
public class UseStudentService {
	@Autowired
	UseStudentDao ud;
	
	public String post(UseStudent e) {
		return ud.post(e);
	}
	
	public UseStudent get(int id) {
		return ud.get(id);
	}
	
	
	public String put(UseStudent e) {
		return ud.put(e);
	}
	
	public String delete(int id) {
		return ud.delete(id);
	}
	
	
	
	public String postStudentDetail(UseStudent e) throws AgeException {
		if(e.getAge()>=18) {
			return ud.postStudentDetail(e);
		}
		else {
			throw new AgeException();
		}
	}
	
}
