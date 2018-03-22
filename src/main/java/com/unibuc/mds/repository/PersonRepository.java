package com.unibuc.mds.repository;

import com.unibuc.mds.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface PersonRepository extends JpaRepository<Person,Long> {

    @Query("select p from Person p " +
            "where p.email = :email")
    Person getPersonByEmail(@Param("email") String email);
}

