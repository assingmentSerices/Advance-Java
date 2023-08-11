package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Bean.Tag;

public interface TagRepo extends JpaRepository<Tag, Long>{

}
