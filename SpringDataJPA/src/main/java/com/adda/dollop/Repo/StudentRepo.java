package com.adda.dollop.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adda.dollop.Bean.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {
//public List<Student> findBySname(String sname);


public List<Student> findbysidBetween(int sid, int sid1);
}
	