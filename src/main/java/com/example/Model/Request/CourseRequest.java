package com.example.Model.Request;

import com.example.entity.Faculty;
import lombok.*;


import java.time.LocalDateTime;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CourseRequest {

    private String name;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private Faculty faculty;

}

