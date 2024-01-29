package com.demo.crudop;

import java.util.Optional;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.demo.crudop.entities.Student;
import com.demo.crudop.repositories.StudentRepository;

 @SpringBootTest
class DemoCrudOperationApplicationTests {
    @Autowired
    
    StudentRepository studentRepo;
    
    
//	@Test
//	void insertStudentRecord() {
//		Student  student =  new Student();
    
//		student.setSname("Naasir");;
//		
//		student.setScourse("java back end Dev");
//		student.setSfees(100000);
//		studentRepo.save(student);
//	}
    
//	@Test
//   public void updateStudentRecord() {
//	   
//	   Optional<Student> findById = studentRepo.findById(2L);
//	   Student student = findById.get();
//	   student.setSfees(19999);
//	   studentRepo.save(student);
//	   
//   }
    
//    @Test
//    public void deleteStudentRecord()
//    {
//    	studentRepo.deleteById(2L);
//    }
	
//    @Test
// public void fetchStudentRecords()
// {
//	 Optional<Student> findById = studentRepo.findById(1L);
//	 Student student = findById.get();
//	 System.out.println(student.getSname());
//	 System.out.println(student.getId());
//	 System.out.println(student.getScourse());
//	 System.out.println(student.getSfees());
//	
// }
     @Test
     public void fetchAllRecord()
     {
    	 Iterable<Student> student = studentRepo.findAll();
    	 System.out.println(student);
    	 
     }
	

}
