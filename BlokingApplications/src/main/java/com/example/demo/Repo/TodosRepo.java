package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Bean.Todos;

public interface TodosRepo extends JpaRepository<Todos, Long> {

}
