package com.example.demo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface topicRepository extends CrudRepository<Topic, String> {


    Topic getOne(String id);

}
