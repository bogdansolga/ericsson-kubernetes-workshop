package com.ericsson.java.app.web;

import com.ericsson.java.app.domain.Person;
import com.ericsson.java.app.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@RestController
public class PersonController {

    private final PersonRepository personRepository;

    @Autowired
    public PersonController(final PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @GetMapping("/people")
    public Set<Person> getPersons() {
        return StreamSupport.stream(personRepository.findAll().spliterator(), false)
                            .collect(Collectors.toSet());
    }
}
