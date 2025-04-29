package com.example.Model.Response;

import com.example.entity.Faculty;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CourseResponse {

    private Integer id;
    private String name;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private Faculty faculty;
}
