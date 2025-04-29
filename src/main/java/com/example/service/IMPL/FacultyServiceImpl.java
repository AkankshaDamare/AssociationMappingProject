package com.example.service.IMPL;

import com.example.Model.Request.CourseRequest;
import com.example.Model.Request.FacultyRequest;
import com.example.entity.Courses;
import com.example.entity.Faculty;
import com.example.repository.CoursesRepository;
import com.example.repository.FacultyRepository;
import com.example.service.FacultyService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class FacultyServiceImpl implements FacultyService {

    public final FacultyRepository facultyRepo;
    public final CoursesRepository coursesRepo;

    @Override
    public String saveFaculty(FacultyRequest request) {

        Faculty faculty = new Faculty();
        faculty.setName(request.getName());
        faculty.setExperience(request.getExperience());

        List<Courses> coursesList = request.getCoursesList().stream()
                .map(CourseRequest -> {
            Courses courses = new Courses();
            courses.setName(CourseRequest.getName());
            courses.setStartDate(CourseRequest.getStartDate());
            courses.setEndDate(CourseRequest.getEndDate());
            courses.setFaculty(faculty);
            return courses;

        }).collect(Collectors.toList());

        faculty.setCoursesList(coursesList);
        facultyRepo.save(faculty);
        return "Faculty saved..";


    }

}