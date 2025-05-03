package com.example.Runner;

import com.example.entity.Student;
import com.example.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.lang.reflect.Array;
import java.util.Objects;
import java.util.Optional;

@Component
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

      Optional<Object[]> objects = studentRepo.getStudDetailsById(3);
        if(objects.isPresent()){
            Object[] obj = objects.get();
            System.out.println(Array.getLength(obj));
            System.out.println("id :" + obj[0]);
           /* System.out.println("name :" +obj[1]);
            System.out.println("mobile :" +obj[2]);
            System.out.println("age :" +obj[3]);*/
        }



    }
}
