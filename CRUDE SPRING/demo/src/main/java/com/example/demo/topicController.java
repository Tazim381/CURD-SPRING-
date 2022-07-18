package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class topicController {

@Autowired
    private topicService topicservice;

    @RequestMapping("/topics")
    public List<Topic> topic()
    {
        return topicservice.getalltopic();
    }
    @RequestMapping("/topics/{Id}")
    public Topic gettopic(@PathVariable String Id)
    {
        return topicservice.gettopic(Id);
    }

    @RequestMapping(method = RequestMethod.POST,value="/topics")
    public int addtopic(@RequestBody Topic topic)
    {
        topicservice.addtopic(topic);
        return 222;
    }

    @RequestMapping(method = RequestMethod.PUT,value="/topics/{Id}")
    public void updatetopic(@RequestBody Topic topic, @PathVariable String Id)
    {
        topicservice.updatetopic(Id,topic);
    }
    @RequestMapping(method = RequestMethod.DELETE,value="/topics/{Id}")
    public void deletetopic(@PathVariable String Id)
    {
        topicservice.deletetopic(Id);
        //return "Deleted";
    }


}
