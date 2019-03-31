package com.hzm.provider.repository.impl;

import com.hzm.provider.entity.Student;
import com.hzm.provider.repository.StudentRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Huzhimin on 2019/03/21/0021 21:12
 */
@Repository
public class StudentRepositoryImpl implements StudentRepository {

    private Map<Long,Student> studentMap;

    public StudentRepositoryImpl(){
        studentMap = new HashMap<>();
        studentMap.put(1L,new Student(1L,"张三",22));
        studentMap.put(2L,new Student(2L,"李四",23));
        studentMap.put(3L,new Student(3L,"王五",24));
    }

    @Override
    public Collection<Student> findAll() {
        return studentMap.values();
    }

    @Override
    public Student findById(long id) {
        return studentMap.get(id);
    }

    @Override
    public void saveOrUpdate(Student student) {
        studentMap.put(student.getId(),student);
    }

    @Override
    public void delete(long id) {
        studentMap.remove(id);
    }
}
