package com.example.service.IMPL;
import com.example.Model.Request.StudentRequest;
import com.example.Model.Response.StudentResponse;
import com.example.entity.Address;
import com.example.entity.Courses;
import com.example.entity.Student;
import com.example.exception.StudentNotFoundException;
import com.example.repository.CoursesRepository;
import com.example.repository.StudentRepository;
import com.example.service.StudentService;
import lombok.Builder;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Builder
public class StudentServiceImpl implements StudentService {

/*
    public final StudentRepository studentRepo;

    public final CoursesRepository coursesRepo;


    @Override
    public String saveStudent(Student student) {

        if (student != null) {
            studentRepo.save(student);
            return "student saved successfully";
        } else {
            throw new IllegalArgumentException("invalid input");
        }
    }


    @Override
    public String saveStudentWithDto(StudentRequest request) {
        Student student = new Student();
        student.setName(request.getName());
        student.setMobile(request.getMobile());

        Address address = new Address();
        address.setCity(request.getCity());
        address.setPincode(request.getPincode());


        student.setAddress(address);

        studentRepo.save(student);
        return "student saved";

    }

    @Override
    public String saveStudentWithCourse(StudentRequest request) {
       Student student = new Student();
        student.setName(request.getName());
        student.setMobile(request.getMobile());

        Address address = new Address();
        address.setPincode(request.getPincode());
        address.setCity(request.getCity());
        student.setAddress(address);

        List<Integer> courseId = request.getCourseId();
        List<Courses> courseList = coursesRepo.findAllById(courseId);

      student.setCourses(courseList);
        studentRepo.save(student);

        return "Student saved";

    }

    @Override
    public Student getStudentById(int id) {
        Optional<Student> byId = studentRepo.findById(id);
        if (byId.isPresent()) {
            return byId.get();
        } else {
            return null;
        }
    }

    @Override
    public StudentResponse getStudentByIdWithDto(int id) {
        Student student = studentRepo.findById(id).orElseThrow(() -> new IllegalArgumentException("Student id doesnot exist " + id));
        StudentResponse response = StudentResponse.builder()
                .id(student.getId())
                .name(student.getName())
                .mobile(student.getMobile())
                .city(student.getAddress().getCity())
                .pincode(student.getAddress().getPincode())
                .build();
        return response;
    }


    @Override
    public List<StudentResponse> getAllStudent() {
        List<Student> studentList = studentRepo.findAll();
        return studentList.stream()
                .map(student -> StudentResponse.builder()
                        .id(student.getId())
                        .name(student.getName())
                        .mobile(student.getMobile())
                        .city(student.getAddress().getCity())
                        .pincode(student.getAddress().getPincode())
                        .build()
                )
                .collect(Collectors.toList());
    }

    @Override
    public String updateStudent(Integer id, Student student) {

        Student existingStudent = studentRepo.findById(id).orElseThrow(() ->
                new StudentNotFoundException("Student with ID " + id + " does not exist")
        );

        existingStudent.setName(student.getName());
        existingStudent.setMobile(student.getMobile());
        existingStudent.setAddress(student.getAddress());
        studentRepo.save(existingStudent);

        return "Student updated..";
    }


    @Override
    public void deleteStudentById(Integer id) {
        studentRepo.deleteById(id);

    }

    @Override
    public StudentResponse getStudentCourseById(Integer id){
        Student student = studentRepo.findById(id).orElseThrow(() -> new StudentNotFoundException("Student with this id not found"));
        StudentResponse response = StudentResponse.builder()
                .name(student.getName())
                .id(student.getId())
                .mobile(student.getMobile())
                .courses(student.getCourses())
                .build();
        return response;


    }*/

}
