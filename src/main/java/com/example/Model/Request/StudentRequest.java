package com.example.Model.Request;

import com.example.entity.Courses;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class StudentRequest {

    private String name;
    private Long mobile;
    private Integer age;
    private String city;
    private Long pincode;
    private List<Integer> courseId;


}
