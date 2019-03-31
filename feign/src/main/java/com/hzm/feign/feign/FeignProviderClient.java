package com.hzm.feign.feign;

import com.hzm.feign.entity.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * Created by Huzhimin on 2019/03/24/0024 20:07
 */
@FeignClient(value = "provider",fallback = FeignError.class)
public interface FeignProviderClient {

    @GetMapping("/student/index")
    public String index();


    @GetMapping("/student/findAll")
    public Collection<Student> findAll();


    @GetMapping("/student/findById/{id}")
    public Student findById(@PathVariable("id") long id);


    @PostMapping("/student/save")
    public void save(@RequestBody Student student);


    @PutMapping("/student/update")
    public void update(@RequestBody Student student);


    @DeleteMapping("/student/delete/{id}")
    public void delete(@PathVariable("id") long id);


}
