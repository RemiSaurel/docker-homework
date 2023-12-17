package com.example.devops.web;

import com.example.devops.domain.Person;
import com.example.devops.domain.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Remi Venant <remi.venant@gmail.com>
 */
@RestController
@RequestMapping("api/persons")
public class PersonController {
    @Autowired
    private PersonRepository personRepo;
    
    @GetMapping
    public Iterable<Person> getPersons(){
        return this.personRepo.findAll();
    }

}
