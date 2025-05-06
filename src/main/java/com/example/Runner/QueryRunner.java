package com.example.Runner;

import com.example.entity.Student;
import com.example.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.querydsl.QPageRequest;
import org.springframework.stereotype.Component;

import java.lang.reflect.Array;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

//@Component
public class QueryRunner implements CommandLineRunner {

    @Autowired
    StudentRepository studentRepo;

    @Override
    public void run(String... args) throws Exception {

        /*Optional<Student> student = studentRepo.getStudentById(2);
        if (student.isPresent()) {
            Student stud = student.get();
            System.out.println("Student id : " + stud.getId());
            System.out.println("Student name : " + stud.getName());
            System.out.println("Student age : " + stud.getAge());
        }
*/
       /* Optional<String> s = studentRepo.getStudNameById(2);
        if (s.isPresent()) {
            System.out.println(s.get());
        }*/

  /*    Optional<Object[]> objects = studentRepo.getStudDetailsById(3);
        if(objects.isPresent()){
            Object[] obj = objects.get();
            System.out.println(Array.getLength(obj));
            System.out.println("id :" + obj[0]);
           *//* System.out.println("name :" +obj[1]);
            System.out.println("mobile :" +obj[2]);
            System.out.println("age :" +obj[3]);*//*
        }

*/

        int pageNo = 4;
        int pageNum = pageNo - 1;
        int pageSize = 6;


        Pageable pageable = PageRequest.of(pageNum, pageSize);
        Page<Student> studList = studentRepo.findAll(pageable);

        System.out.println("Total number of students: " + studList.getTotalElements());


        if (studList.hasContent()) {
            List<Student> students = studList.getContent();
            System.out.println("Page result: " + students.size());


            students.forEach(stud -> {
                System.out.println("============Next==========");
                System.out.println("Id: " + stud.getId());
                System.out.println("Name: " + stud.getName());
                System.out.println("Age: " + stud.getAge());
                System.out.println("Mobile: " + stud.getMobile());
            });
        } else {
            System.out.println("No students found on this page.");
        }


        Page<Student> allStudentPaged = studentRepo.getAllStudentPaged(pageable);
        System.out.println(allStudentPaged.getTotalElements());

    }

}
