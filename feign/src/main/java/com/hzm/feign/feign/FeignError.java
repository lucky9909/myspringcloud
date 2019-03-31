package com.hzm.feign.feign;

import com.hzm.feign.entity.Student;
import org.springframework.stereotype.Component;

import java.util.Collection;

/**
 * Created by Huzhimin on 2019/03/24/0024 23:08
 */
@Component
public class FeignError implements FeignProviderClient{
    @Override
    public String index() {
        return "服务器维护中...";
    }

    @Override
    public Collection<Student> findAll() {
        return null;
    }

    @Override
    public Student findById(long id) {
        return null;
    }

    @Override
    public void save(Student student) {

    }

    @Override
    public void update(Student student) {

    }

    @Override
    public void delete(long id) {

    }
}
