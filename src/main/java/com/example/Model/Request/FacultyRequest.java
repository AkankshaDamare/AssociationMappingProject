package com.example.Model.Request;

import com.example.entity.Courses;
import lombok.*;


import java.util.List;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FacultyRequest {


    private String name;
    private Double experience;
    private List<Courses> coursesList;
}
