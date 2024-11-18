package com.usestudent.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.usestudent.entity.UseStudent;
import com.usestudent.exception.AgeException;
import com.usestudent.service.UseStudentService;

@RestController
public class UseStudentController {
	@Autowired
	UseStudentService us;
	
                                       //	post
	@PostMapping(value="/postValue")
	public String post(@RequestBody UseStudent e) {
		return us.post(e);
	}
	
                                          //	get
	@GetMapping(value="/getValue/{id}")
	public UseStudent get(@PathVariable int id) {
		return us.get(id);
	}
	
                                           //	update
	
	@PutMapping(value="/updateValue")
	public String put(@RequestBody UseStudent e) {
		return us.put(e);
	}
	
                                         //	delete
	@DeleteMapping(value="deleteValue/{id}")
	public String delete(@PathVariable int id) {
		return us.delete(id);
	}
	
	
                                         //	Exception
@PostMapping(value="/postStudentDetail")
public String postStudentDetail(@RequestBody UseStudent ud) throws AgeException {
	return us.postStudentDetail(ud);
}

}
