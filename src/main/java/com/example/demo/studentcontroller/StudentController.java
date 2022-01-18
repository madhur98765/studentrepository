package com.example.demo.studentcontroller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api/student")
public class StudentController {

    public static final Logger logger = LoggerFactory.getLogger(StudentController.class);

    @GetMapping("/name")
    public String getStudentDetails()
    {
        logger.info("/api/student/name end point is called");

        return "Madhurendra Singh";
    }
}
