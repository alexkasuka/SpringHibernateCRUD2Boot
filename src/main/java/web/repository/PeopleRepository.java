package web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import web.model.Person;

@Repository
public interface PeopleRepository extends JpaRepository<Person, Integer> {


}

