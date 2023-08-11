package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Bean.Posts;

public interface PostsRepo extends JpaRepository<Posts, Long>{

	
}
