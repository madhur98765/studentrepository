package com.example.demo.studentrepository;

import com.example.demo.studentmodel.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {
}
