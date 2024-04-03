package com.gkfcsolution.demo_postgresql.controller;

import com.gkfcsolution.demo_postgresql.model.Person;
import com.gkfcsolution.demo_postgresql.repo.PersonneRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @Autowired
    private PersonneRepo repo;

    @PostMapping("/addPerson")
    public void addPerson(@RequestBody Person person) {
        repo.save(person);
    }

}
