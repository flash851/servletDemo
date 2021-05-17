package com.flash.servletDemo.mvc;

import java.util.ArrayList;
import java.util.List;

public class StudentsDataUtils {
	public static List<Student> getStudents(){
		//create an empty list
		List<Student> students=new ArrayList<>();
		//add sample data
		students.add(new Student("Anuj","Yadav","anujyadav@gmail.com"));
		students.add(new Student("Anany","Dwivedi","danany52@gmail.com"));
		students.add(new Student("Anubhav","Mishra","anubhavmishra851@gmail.com"));
		//return list
		return students;
	}
}
