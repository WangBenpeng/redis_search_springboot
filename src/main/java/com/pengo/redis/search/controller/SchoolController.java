package com.pengo.redis.search.controller;

import com.pengo.redis.search.entity.School;
import com.pengo.redis.search.mapper.SchoolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

/**
 * @author benpeng
 * @date 2022/12/3 15:08
 */
@RestController
@RequestMapping("/school")
public class SchoolController {

    @Autowired
    private SchoolRepository schoolRepository;

    @GetMapping("/all")
    public Iterable<School> findAll() {
        return schoolRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<School> byId(@PathVariable("id") String id) {
        return schoolRepository.findById(id);
    }


}
