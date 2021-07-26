package com.revoltcode.SpringBootElasticSearch.controller;

import com.revoltcode.SpringBootElasticSearch.document.Person;
import com.revoltcode.SpringBootElasticSearch.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1")
public class PersonController {

    private final PersonService service;

    @PostMapping("/save")
    public void savePerson(@RequestBody final Person person){
        service.save(person);
    }

    @GetMapping("/find/{id}")
    public Person findById(@PathVariable final String id){
        return service.findById(id);
    }
}
