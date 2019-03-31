package com.hzm.resttemplate.repository;

import com.hzm.provider.entity.Student;
import java.util.Collection;

/**
 * Created by Huzhimin on 2019/03/21/0021 21:09
 */
public interface StudentRepository {
    public Collection<Student> findAll();

    public Student findById(long id);

    public void saveOrUpdate(Student student);

    public void delete(long id);
}
