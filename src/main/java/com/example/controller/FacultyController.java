package com.example.controller;

import com.example.Model.Request.FacultyRequest;
import com.example.service.FacultyService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/faculty")
public class FacultyController {

   public final FacultyService facultyService;

 @PostMapping
   public ResponseEntity<String> saveFaculty(@RequestBody FacultyRequest faculty){
     String s = facultyService.saveFaculty(faculty);
     return new ResponseEntity<>(s,HttpStatus.ACCEPTED);
   }

}
