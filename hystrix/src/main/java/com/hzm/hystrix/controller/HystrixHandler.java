package com.hzm.hystrix.controller;

import com.hzm.hystrix.entity.Student;
import com.hzm.hystrix.feign.HystrixProviderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * Created by Huzhimin on 2019/03/25/0025 21:08
 */
@RestController
@RequestMapping("/hystrix")
public class HystrixHandler {

    @Autowired
    private HystrixProviderClient hystrixProviderClient;


    @GetMapping("/findAll")
    public Collection<com.hzm.hystrix.entity.Student> findAll() {
        return hystrixProviderClient.findAll();
    }

    @GetMapping("/findById/{id}")
    public com.hzm.hystrix.entity.Student findById(@PathVariable("id") long id) {
        return hystrixProviderClient.findById(id);
    }


    @PostMapping("/save")
    public void save(@RequestBody com.hzm.hystrix.entity.Student student) {
        hystrixProviderClient.save(student);
    }

    @PutMapping("/update")
    public void update(@RequestBody Student student) {
        hystrixProviderClient.update(student);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") long id) {
        hystrixProviderClient.delete(id);
    }


    @GetMapping("/index")
    public String index(){
        return hystrixProviderClient.index();
    }
}
