package com.training.springmvc.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.springmvc.dao.HelloDAO;
import com.training.springmvc.model.Course;

@Service
public class HelloService {
@Autowired
	HelloDAO dao;
		public boolean isValid(String user, String pwd) {
			boolean valid = false;
			valid = dao.getUser(user, pwd);
			if(valid) {
				
				return true;
			}
			else {
				return false;
			}
			
		}
		public List<Course> getCourse(){
			List<Course> list = dao.getCourse();
			return list;
           
		}}
