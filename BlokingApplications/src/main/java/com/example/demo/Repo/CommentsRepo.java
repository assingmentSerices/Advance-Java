package com.example.demo.Repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Bean.Comments;
import com.example.demo.Bean.Posts;



public interface CommentsRepo extends JpaRepository<Comments, Long> {

	public	List<Comments> findByPost(Posts p);

	public Optional<Comments> findByIdAndPost(Long id, Posts p);

}
