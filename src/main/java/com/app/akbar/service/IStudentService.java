package com.app.akbar.service;

import java.util.List;

import com.app.akbar.entity.Student;

public interface IStudentService {

	Integer saveStudent(Student student);

	void updateStudent(Student student);

	void deleteStudent(Integer id);

	Student getOneStudent(Integer id);

	List<Student> getAllStudents();

}
