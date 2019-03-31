package com.hzm.resttemplate.controller;

import com.hzm.resttemplate.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Collection;

/**
 * Created by Huzhimin on 2019/03/23/0023 21:10
 */
@RestController
@RequestMapping("/rest")
public class RestHandler {

    @Autowired
    private RestTemplate restTemplate;

    // getForEntity方法
    @GetMapping("/findAll")
    public Collection<Student> findAll(){
        return restTemplate.getForEntity("http://localhost:8081/student/findAll",Collection.class).getBody();
    }

    @GetMapping("/findAll2")
    public Collection<Student> findAll2(){
        return restTemplate.getForObject("http://localhost:8081/student/findAll",Collection.class);
    }

    @GetMapping("/findById/{id}")
    public Student findById(@PathVariable("id") long id){
        return restTemplate.getForObject("http://localhost:8081/student/findById{id}",Student.class,id);
    }

    @PostMapping("/save")
    public void save(@RequestBody Student student){
        restTemplate.postForObject("http://localhost:8081/student/save",student,Collection.class);
    }

    @PutMapping("/update")
    public void update(@RequestBody Student student){
        restTemplate.put("http://localhost:8081/student/update",student);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") long id){
        restTemplate.delete("http://localhost:8081/student/delete/{id}",id);
    }
}
