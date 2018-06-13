package com.bway.springproject.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.bway.springproject.daos.StudentDao;
import com.bway.springproject.models.Student;

@RestController
@RequestMapping("api/student")
public class StudentRestController {

	@Autowired
	private StudentDao studentDao;

	@RequestMapping(value="/list",method=RequestMethod.GET)
	public  ResponseEntity<List<Student>> studentList() {
		
		ResponseEntity<List<Student>> studList=
				new ResponseEntity(studentDao.getAllStudent(),HttpStatus.OK);
		
		return studList;
	}
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	public ResponseEntity<Student> getById(@PathVariable("id") int id){
		
		
		ResponseEntity<Student> s=
				new ResponseEntity(studentDao.getById(id),HttpStatus.OK);
		return s;
	}
@RequestMapping(value="/currency",method=RequestMethod.GET)	
public ResponseEntity<String> getTodayRate(){
	
	RestTemplate restTemplate=new RestTemplate();
	
	ResponseEntity<String> resp=
			restTemplate.getForEntity(" http://data.fixer.io/api/latest?access_key=2808c7c99ee78680e920798e80f09b82 ", String.class);
	
	return resp;
	
}
	
}
