package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class topicService {
  @Autowired
    private topicRepository topicrepository ;

   public List<Topic>topics = new ArrayList<>();

   public  List<Topic> getalltopic()
    {
        //return topics;
       /* List<Topic>topics = new ArrayList<>();
        topicrepository.findAll()
        .forEach(topics::add);
        return topics;*/
       return (List<Topic>) topicrepository.findAll();

    }
    public Topic gettopic(String Id)
    {
       // return topics.stream().filter(topic -> topic.getId().equals(Id)).findFirst().get();
        return topicrepository.getOne(Id);

    }
    public void addtopic(Topic topic)
    {
        //topics.add(topic);
        topicrepository.save(topic);
    }

    public void updatetopic(String Id, Topic topic) {

        topicrepository.save(topic);
    }

    public void deletetopic(String Id) {
       //topics.removeIf(topic -> topic.getId().equals(Id));
       topicrepository.deleteById(Id);
    }
}
