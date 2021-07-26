package com.revoltcode.SpringBootElasticSearch.service;

import com.revoltcode.SpringBootElasticSearch.document.Person;
import com.revoltcode.SpringBootElasticSearch.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class PersonService {

    private final PersonRepository personRepository;

    public void save(final Person person){
        personRepository.save(person);
    }

    public Person findById(final String id){
        return personRepository.findById(id).orElse(null);
    }
}
