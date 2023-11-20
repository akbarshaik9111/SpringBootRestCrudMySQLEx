package com.app.akbar.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.akbar.entity.Student;
import com.app.akbar.exception.StudentNotFoundException;
import com.app.akbar.repo.StudentRepository;
import com.app.akbar.service.IStudentService;

@Service
public class StudentServiceImpl implements IStudentService {
	
	@Autowired
	private StudentRepository repo;

	public Integer saveStudent(Student student) {
		student = repo.save(student);
		return student.getStdId();
	}

	public void updateStudent(Student student) {
		if(student.getStdId() == null || !repo.existsById(student.getStdId())) 
			throw new StudentNotFoundException("Student '"+student.getStdId()+"' Not Exist");
		 else 
			repo.save(student);
	}

	public void deleteStudent(Integer id) {
		repo.delete(this.getOneStudent(id));
	}

	public Student getOneStudent(Integer id) {
		return repo.findById(id).orElseThrow(() -> new StudentNotFoundException("Student '"+id+"' Not Exist"));
	}

	public List<Student> getAllStudents() {
		List<Student> list = repo.findAll();
		return list;
	}

}
