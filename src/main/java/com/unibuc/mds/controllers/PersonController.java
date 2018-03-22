package com.unibuc.mds.controllers;

import com.unibuc.mds.domain.Person;
import com.unibuc.mds.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/persons")
public class PersonController {

    @Autowired
    private PersonRepository personRepository;

    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    public List<Person> persons() {
        return personRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public Person getPersonById(@PathVariable("id") Long id) {
        return personRepository.findOne(id);
    }

    @CrossOrigin
    @RequestMapping(method = RequestMethod.POST)
    public void savePerson(@RequestBody @Valid Person person) {
        person.setId(null);
        personRepository.save(person);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/{id}")
    public void editPerson(@RequestBody @Valid Person editPerson, @PathVariable("id") Long id) {
        editPerson.setId(id);
        personRepository.saveAndFlush(editPerson);
    }
}
