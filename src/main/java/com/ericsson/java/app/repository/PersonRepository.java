package com.ericsson.java.app.repository;

import com.ericsson.java.app.domain.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Integer> {
}
