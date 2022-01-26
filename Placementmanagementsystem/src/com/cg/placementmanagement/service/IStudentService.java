package com.cg.placementmanagement.service;

import com.cg.placementmanagement.entities.Certificate;
import com.cg.placementmanagement.entities.Student;

public interface IStudentService {
public Student addStudent(Student student);
public Student updateStudent(Student student);
public Student searchStudentById(long id);

public Student searchStudentByHallTicket(long id);
public Certificate addCertificate(Certificate certificate);
public Certificate updateCertificate(Certificate certificate);
public boolean deleteStudent(long id);
}
