package com.usestudent.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.usestudent.entity.UseStudent;

//public class UseStudentRepository {

public interface UseStudentRepository extends JpaRepository <UseStudent,Integer> {


                              //	Exception
	
//	@Query(value="Select * from student_table",nativeQuery=true)
//	public String postStudentDetail();
}

