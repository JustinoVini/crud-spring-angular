package com.testescrud.crudspring.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.testescrud.crudspring.repository.CourseRepository;

import lombok.AllArgsConstructor;

import com.testescrud.crudspring.model.Course;


@RestController
@RequestMapping("/api/courses")
@AllArgsConstructor
public class CursosController {

    private final CourseRepository CourseRepository;

    /*Este método abaixo utiliza o JPA para fazer a parte do CRUD do Read, ou seja select * from... */
    @GetMapping
    public List<Course> list(){
        return CourseRepository.findAll();
    }
}
