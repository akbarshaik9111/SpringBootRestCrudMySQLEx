package com.app.akbar.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.akbar.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
