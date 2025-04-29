package com.example.repository;

import com.example.entity.Courses;
import com.example.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CoursesRepository extends JpaRepository<Courses, Integer> {

}


