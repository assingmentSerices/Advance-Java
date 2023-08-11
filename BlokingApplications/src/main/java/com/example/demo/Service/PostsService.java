package com.example.demo.Service;

import java.util.List;

import com.example.demo.Bean.Posts;
import com.example.demo.ExcptionHandler.PostsNotFoundException;


public interface PostsService {
	public Posts addPosts(Posts posts);
	 public List<Posts> getAllPosts();
	 public Boolean deletePosts(Long id) throws PostsNotFoundException;
	 public Posts updatePosts(Posts posts);
	 public Posts getPostsById(Long id) throws Exception;
	
}
