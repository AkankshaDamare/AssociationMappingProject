package com.example.Model.Response;

import com.example.entity.Courses;
import lombok.*;

import java.util.List;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FacultyResponse {
    private Integer id;
    private String name;
    private Double experience;
    private List<Courses> coursesList;
}
