package com.example.Model.Response;

import com.example.entity.Address;
import com.example.entity.Courses;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StudentResponse {

    private Integer id;
    private String name;
    private Integer age;
    private Long mobile;
    private String city;
    private Long pincode;
    private List<CourseResponse> courseResponses;
    private List<Courses> courses;

}

