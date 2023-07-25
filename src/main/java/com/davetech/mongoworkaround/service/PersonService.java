package com.davetech.mongoworkaround.service;

import com.davetech.mongoworkaround.collection.Person;

import java.util.List;

public interface PersonService {
    String save(Person person);

    List<Person> getPersonWith(String name);

    void delete(String id);

    List<Person> getByPersonAge(Integer minAge, Integer maxAge);
}
