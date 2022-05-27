
package com.cg.client;

import com.cg.entities.Student;
import com.cg.service.StudentService;
import com.cg.service.StudentServiceImpl;

public class Client {

	public static void main(String[] args) {
		StudentService obj=new StudentServiceImpl();
		Student student=new Student();
		
		//create
		student.setStudentId(104);
		student.setName("Asim");
		obj.addStudent(student);
		
		/*//retrieve
		student=obj.findStudentById(101);
		System.out.println("Student Id: "+student.getStudentId());
		System.out.println("Student Name: "+student.getName());*/
	
		
		
		
	/*	//Update
		student=obj.findStudentById(101);
		student.setName("rekha");
		obj.updateStudent(student);*/
		
		
		//Delete
		
		
		student=obj.findStudentById(102);
		student.setName("rekha");
		obj.removeStudent(student);

	}

}
