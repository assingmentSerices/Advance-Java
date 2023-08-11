package com.example.demo.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Bean.Posts;
import com.example.demo.ExcptionHandler.PostsNotFoundException;
import com.example.demo.Repo.PostsRepo;
import com.example.demo.Service.PostsService;


@Service
public class PostsImpl implements PostsService{

	@Autowired
	private PostsRepo postsrepo;
@Override
	public Posts addPosts(Posts posts) {
		// TODO Auto-generated method stub
		return  this.postsrepo.save(posts);
	}

	@Override
	public List<Posts> getAllPosts() {
		// TODO Auto-generated method stub
		return this.postsrepo.findAll();
	}

	@Override
	public Boolean deletePosts(Long id) throws PostsNotFoundException {
		// TODO Auto-generated method stub
		 this.postsrepo.deleteById(id);
		 return true;
	}

	@Override
	public Posts updatePosts(Posts posts) {
		// TODO Auto-generated method stub
		return this.postsrepo.save(posts);
	}

	@Override
	public Posts getPostsById(Long id) throws Exception {
		// TODO Auto-generated method stub
		Optional<Posts> posts = this.postsrepo.findById(id);
	       if(posts.isPresent())
	    	   return posts.get();
	       throw new Exception("company  not found" +id);
	
		
	}
	
}
