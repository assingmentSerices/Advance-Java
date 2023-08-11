package com.dollop.chetan;

import org.springframework.data.repository.CrudRepository;

import com.dollop.chetan.entity.Student;

public interface IStudentRepo extends CrudRepository<Student, Integer> {

}
