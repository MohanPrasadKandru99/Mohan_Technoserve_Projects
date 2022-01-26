package com.cg.placementmanagement.repository;

import com.cg.placementmanagement.entities.Student;

public interface IStudentRepository {

	public Student addStudent(Student student);
	public Student updateStudent(Student student);
	public Student searchStudentById(long id);
	public Student searchStudentByHallTicket(long ticketNo);
	public boolean deleteStudent(long id);
}
