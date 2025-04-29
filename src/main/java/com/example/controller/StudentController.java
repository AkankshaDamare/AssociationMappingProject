package com.example.controller;

import com.example.Model.Request.StudentRequest;
import com.example.Model.Response.StudentResponse;
import com.example.entity.Student;
import com.example.exception.StudentNotFoundException;
import com.example.service.StudentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping ("/api/v1/student")
@Slf4j
@RestController
public class StudentController {

    public final StudentService studentService;

/*
    @PostMapping("/save")
    public ResponseEntity<String> saveStudent(@RequestBody Student student) {
        String s = studentService.saveStudent(student);
        return new ResponseEntity<>(s, HttpStatus.ACCEPTED);
    }

    @PostMapping("/saveWithDto")
    public ResponseEntity<String> saveStudentWithDto(@RequestBody StudentRequest request) {
        String s = studentService.saveStudentWithDto(request);
        return new ResponseEntity<>(s, HttpStatus.ACCEPTED);
    }


    @GetMapping("/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable("id") Integer id) {

        Student stud = studentService.getStudentById(id);
        if (stud != null) {
            return new ResponseEntity<>(stud, HttpStatus.OK);

        } else {
            log.error("Student does not exist by this id {}", id);
            return new ResponseEntity<>(stud, HttpStatus.valueOf(404));
        }

    }

    @GetMapping ("/get")
    public ResponseEntity<StudentResponse> getStudentByIdWithDto(@RequestParam Integer id) {

        StudentResponse response = studentService.getStudentByIdWithDto(id);
        return ResponseEntity.ok().body(response);


    }

    @GetMapping ("/all")
    public ResponseEntity<List<StudentResponse>> getAllStudents(){

        List<StudentResponse> allStudent = studentService.getAllStudent();
        return ResponseEntity.ok(allStudent);
    }

    @DeleteMapping
    public void deleteStudentById(@RequestParam Integer id) {
        studentService.deleteStudentById(id);
    }

    @PutMapping
    public ResponseEntity<String> updateStudentById(@RequestParam Integer id, @RequestBody Student student) {
        try {
            String s = studentService.updateStudent(id, student);
            return new ResponseEntity<>(s, HttpStatus.OK);
        } catch (StudentNotFoundException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
        }
    }


    @PostMapping ("/saveWithCourse")
    public ResponseEntity<String> saveStudentWithCourse(@RequestBody StudentRequest request){
        String s = studentService.saveStudentWithCourse(request);
        return new ResponseEntity<>(s, HttpStatus.OK);


    }


    @GetMapping ("/StudWithCourse")
    public ResponseEntity<StudentResponse> getStudentCourseById(@RequestParam Integer id){
        StudentResponse s = studentService.getStudentCourseById(id);
        return new ResponseEntity<>(s, HttpStatus.OK);


    }
*/

}
