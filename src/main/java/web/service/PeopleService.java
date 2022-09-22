package web.service;

import web.model.Person;


import java.util.List;



public interface PeopleService {

    List<Person> findAll();

    Person find(int id);

    void save(Person person);

    void update(int id, Person person);

    void delete(int id);




}
