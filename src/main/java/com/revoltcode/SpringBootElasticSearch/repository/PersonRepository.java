package com.revoltcode.SpringBootElasticSearch.repository;

import com.revoltcode.SpringBootElasticSearch.document.Person;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface PersonRepository extends ElasticsearchRepository<Person, String> {


}
