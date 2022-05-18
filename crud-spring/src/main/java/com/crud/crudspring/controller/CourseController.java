package com.crud.crudspring.controller;

import com.crud.crudspring.model.Course;
import com.crud.crudspring.repository.CourseRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController //informa ao spring que esta classe contem um endpoint
@RequestMapping("/api/courses") //endpoint exposto
@AllArgsConstructor
public class CourseController {

    private CourseRepository courseRepository;

    //@RequestMapping(method = RequestMethod.GET)
    @GetMapping
    public List<Course> list() {
        return courseRepository.findAll();
    }

}
