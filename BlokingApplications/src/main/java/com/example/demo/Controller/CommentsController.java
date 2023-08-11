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

import com.example.demo.Bean.Comments;
import com.example.demo.Bean.Posts;
import com.example.demo.ExcptionHandler.CommentsNotFoundException;
import com.example.demo.ExcptionHandler.PostsNotFoundException;
import com.example.demo.Service.CommentsService;
import com.example.demo.Service.PostsService;

@RestController
@RequestMapping("comments")
public class CommentsController {

	@Autowired
	private CommentsService commentsservice;
	@Autowired
	private PostsService postsservice;
	
	@GetMapping("/{id}/comments")
	public ResponseEntity<List<Comments>> getAllCommentsByPostId(@PathVariable Long id) throws PostsNotFoundException{
		ResponseEntity<List<Comments>> response = new ResponseEntity<List<Comments>>(this.commentsservice.getCommentsByPostId(id),HttpStatus.OK);
		return response;
	}
	@GetMapping("/{postId}/comments/{id}")
	public ResponseEntity<Comments> getCommentByPostId(@PathVariable Long postId,@PathVariable Long id) throws CommentsNotFoundException{
		ResponseEntity<Comments> response = new ResponseEntity<Comments>(this.commentsservice.getCommentById(id, postId),HttpStatus.OK);
		return response;
	}
	@PostMapping("/{postId}/comments")
	public ResponseEntity<Comments> addCommentToPost(@PathVariable Long postId,@RequestBody Comments comment){
		Posts post =new Posts();
		post.setId(postId);
		if(postId!=null || postId!=0)
		comment.setPost(post);
		ResponseEntity<Comments> response = new ResponseEntity<Comments>(this.commentsservice.addComment(comment),HttpStatus.CREATED);
		return response;
	}
	@PutMapping("/{postId}/comments/{id}")
	public ResponseEntity<Comments> updateCommentOfPost(@PathVariable Long postId,@PathVariable Long id, @RequestBody Comments comment) throws CommentsNotFoundException{
		ResponseEntity<Comments> response = new ResponseEntity<Comments>(this.commentsservice.updateCommentofPostById(comment, postId,id),HttpStatus.OK);
		return response;
	}
	@DeleteMapping("/{postId}/comments/{id}")
	public ResponseEntity<String> deleteCommentByIdAndPost(@PathVariable Long postId,@PathVariable Long id) throws CommentsNotFoundException{
		ResponseEntity<String> response = new ResponseEntity<String>(this.commentsservice.deleteCommentByIdAndPost(postId, id)+"Delete comment of Post ID : "+postId+" comment Id : "+id,HttpStatus.ACCEPTED);
		return response;
	}

	
	
}
