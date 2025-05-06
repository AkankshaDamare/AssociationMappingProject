package com.example.Runner;

import com.example.entity.Student;
import com.example.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.hibernate.query.Order;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Objects;

@Component
@RequiredArgsConstructor
public class SortRunner implements CommandLineRunner {

    public final StudentRepository studentRepo;

    @Override
    public void run(String... args) throws Exception {
        //Sort name = Sort.by("name");
        //Sort name = Sort.by(Sort.Direction.DESC, "name");
        //Sort name = Sort.by("name", "age");
        //Sort name = Sort.by(Sort.Direction.DESC, "name", "age");
        //Sort name = Sort.by(Sort.Order.asc("name"), Sort.Order.desc("age"));
        //PageRequest pageRequest = PageRequest.of(0, 10, name);
        //Page<Student> all = studentRepo.findAll(pageRequest);
        //List<Student> studList = all.getContent();


         List<Student> studList = studentRepo.findAll();

        studList.forEach((stud) -> {
            System.out.println("============Next==========");
            System.out.println("Id " + stud.getId());
            System.out.println("Name " + stud.getName());
            System.out.println("age " + stud.getAge());

            if (Objects.nonNull(stud.getAddress())) {
                System.out.println("Address City : " + stud.getAddress().getCity());
            }

            stud.getCourses().forEach(course ->
                    System.out.println("course id : " + course.getId() + "\n" + "course name : " + course.getName()));
        });
    }

}

