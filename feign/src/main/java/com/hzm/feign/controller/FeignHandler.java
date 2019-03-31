package com.hzm.feign.controller;

import com.hzm.feign.entity.Student;
import com.hzm.feign.feign.FeignProviderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * Created by Huzhimin on 2019/03/24/0024 20:16
 */
@RestController
@RequestMapping("/feign")
public class FeignHandler {

    @Autowired
    private FeignProviderClient feignProviderClient;


    @GetMapping("/findAll")
    public Collection<Student> findAll() {
        return feignProviderClient.findAll();
    }

    @GetMapping("/findById/{id}")
    public Student findById(@PathVariable("id") long id) {
        return feignProviderClient.findById(id);
    }


    @PostMapping("/save")
    public void save(@RequestBody Student student) {
        feignProviderClient.save(student);
    }

    @PutMapping("/update")
    public void update(@RequestBody Student student) {
        feignProviderClient.update(student);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") long id) {
        feignProviderClient.delete(id);
    }


    @GetMapping("/index")
    public String index(){
       return feignProviderClient.index();
    }

}
