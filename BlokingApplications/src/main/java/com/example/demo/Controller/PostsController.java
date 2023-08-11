package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Bean.Album;
import com.example.demo.Bean.Posts;
import com.example.demo.ExcptionHandler.PostsNotFoundException;
import com.example.demo.Service.PostsService;






@RequestMapping("/Posts")
@RestController
public class PostsController {

	@Autowired
	private PostsService postsservice;
	
	@PostMapping("/save")
	public ResponseEntity<Posts> addPost(@RequestBody Posts posts) {
	ResponseEntity<Posts> responce= new ResponseEntity<Posts>(this.postsservice.addPosts(posts),HttpStatus.CREATED);
     return responce;
	}
	@GetMapping("/{id}")
	public ResponseEntity<Posts> getPosts(@PathVariable Long id) throws Exception {
		ResponseEntity<Posts> response = new ResponseEntity<Posts>(this.postsservice.getPostsById(id),
				HttpStatus.CREATED);
		return response;
	}
	@PutMapping("/update")
	public ResponseEntity<Posts> updatePosts(@RequestBody Posts posts) {
		ResponseEntity<Posts> response = new ResponseEntity<Posts>(this.postsservice.updatePosts(posts), HttpStatus.OK);
		return response;
	}
	@DeleteMapping("{id}")
	public ResponseEntity<String> addPosts(@PathVariable Long id) throws PostsNotFoundException {
		ResponseEntity<String> response = new ResponseEntity<String>(
				this.postsservice.deletePosts(id) + " posts Deleted Id : " + id, HttpStatus.CREATED);
		return response;
	}
	
	@GetMapping("")
	public ResponseEntity<List<Posts>> getAllPosts(Album album) {
		ResponseEntity<List<Posts>> response = new ResponseEntity<List<Posts>>(this.postsservice.getAllPosts(),
				HttpStatus.OK);
		return response;
	}
}
