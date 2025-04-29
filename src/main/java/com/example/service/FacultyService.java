package com.example.service;

import com.example.Model.Request.FacultyRequest;
import com.example.entity.Faculty;
import org.springframework.stereotype.Service;

@Service
public interface FacultyService {
public String saveFaculty (FacultyRequest faculty);



}
