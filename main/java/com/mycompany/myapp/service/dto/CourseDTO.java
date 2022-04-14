package com.mycompany.myapp.service.dto;

// DTO: Data transfer object

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class CourseDTO {
    private String courseName;
    private String courseContent;
    private String courseLocation;
    private Long teacherId;
}
