package com.example.demo.dao;

import com.example.demo.model.Person;

import java.util.Optional;
import java.util.UUID;
import java.util.List;

public interface PersonDao {
    //Define operations allowed
    //Define contract
    //Use dependency injection to switch between implementations
    //insert person to db

    int insertPerson(UUID id, Person person);

    default int insertPerson(Person person)
    {
        UUID id= UUID.randomUUID();
        return insertPerson(id,person);
    }

    List<Person> selectAllPeople();

    Optional<Person> selectPersonById(UUID id);

    int deletePersonById(UUID id);

    int updatePersonById(UUID id,Person person);
}
