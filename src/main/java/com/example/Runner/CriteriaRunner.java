package com.example.Runner;

import com.example.entity.Student;
import com.example.service.IMPL.StudentFilterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

@Component
public class CriteriaRunner implements CommandLineRunner {

    @Autowired
    StudentFilterService service;
    @Override
    public void run(String... args) throws Exception {
        //List<Student> studList = service.findStudentWithSearchAndFilter("Pooja", 10, 455228L, LocalDate.now());
        List<Student> studList = service.findStudentWithSearchAndFilter("Pooja", 10, 455228L , LocalDate.now());


        studList.forEach((stud) -> {
            System.out.println("============Next==========");
            System.out.println("Id " + stud.getId());
            System.out.println("Name " + stud.getName());
            System.out.println("age " + stud.getAge());

            if (Objects.nonNull(stud.getAddress())) {
                System.out.println("Address City : " + stud.getAddress().getCity());
                System.out.println("pincode : " + stud.getAddress().getPincode());
            }

            stud.getCourses().forEach(course ->
                    System.out.println("course id : " + course.getId() + "\n" + "course name : " + course.getName()));
        });

    }
}
