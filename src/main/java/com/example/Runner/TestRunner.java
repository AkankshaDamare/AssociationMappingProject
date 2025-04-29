package com.example.Runner;

import com.example.entity.Courses;
import com.example.entity.Student;
import com.example.exception.StudentNotFoundException;
import com.example.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Objects;
import java.util.Optional;


@Component
public class TestRunner implements CommandLineRunner {

    @Autowired
    StudentRepository studentRepo;

    @Override
    @Transactional

    public void run(String... args) throws Exception {



        //Student student1 = studentRepo.getById(10).orElseThrow();
        //System.out.println(student1);

        //boolean b = studentRepo.existsByMobile(847596L);
        //System.out.println(b);

        //long l = studentRepo.countByAgeGreaterThan(30);
        //System.out.println(l);

        //studentRepo.deleteByName("Sayali");

        //List<Student> studList = studentRepo.findAllByName("Tom");

        // List<Student> studList = studentRepo.findByNameIgnoreCase("harrY");

        //List<Student> studList = studentRepo.findByAge(40);

        // List<Student> studList = studentRepo.findByNameOrMobile("Monika", 986574520L);

        // List<Student> studList = studentRepo.findByNameAndMobile("Sahil", 847596L);

        //List<Student> studList = studentRepo.findByAgeLessThan(23);



        //ADDRESS:


        //Student student = studentRepo.findByAddressId(402).orElseThrow();
        //System.out.println(student);

        //List<Student> studList = studentRepo.findByAddressCity("Pune");



        //COURSES


        //List<Student> studList = studentRepo.findByCoursesName("Mysql");

        // List<Student> studList = studentRepo.findByCoursesId(5);

        //List<Student> studList = studentRepo.findTop2ByCoursesNameOrderByAgeDesc("Mysql");

        //List<Student> studList = studentRepo.findByNameContaining("o");

        //List<Student> studList = studentRepo.findByCourses_NameOrderByAgeDesc("Mysql");




       /* studList.forEach((stud) -> {
            System.out.println("============Next==========");
            System.out.println("Id " + stud.getId());
            System.out.println("Name " + stud.getName());
            System.out.println("age " + stud.getAge());
            System.out.println("Address City : " + stud.getAddress().getCity());

            stud.getCourses().forEach(course ->
                    System.out.println("course id : " + course.getId() + "\n" + "course name : " + course.getName()));
        });
*/

    }

}
