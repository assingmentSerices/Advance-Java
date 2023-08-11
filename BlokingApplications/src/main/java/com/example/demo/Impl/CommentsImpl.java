package com.example.demo.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Bean.Comments;
import com.example.demo.Bean.Posts;
import com.example.demo.ExcptionHandler.CommentsNotFoundException;
import com.example.demo.ExcptionHandler.PostsNotFoundException;
import com.example.demo.Repo.CommentsRepo;
import com.example.demo.Service.CommentsService;


@Service
public class CommentsImpl<posts>  implements CommentsService{
	Posts p=null;
	@Autowired
	private CommentsRepo commentsrepo;

	@Override
	public List<Comments> getCommentsByPostId(Long id) throws PostsNotFoundException {
		// TODO Auto-generated method stub
		 if(id==0)
		    	throw new PostsNotFoundException("Comments Not Found Form Post Id : "+id);
		    
			 p = new Posts(); 		
		    p.setId(id);
	        List<Comments> comments = this.commentsrepo.findByPost(p);
			return comments;
	

	}

	@Override
	public Comments getCommentById(Long id, Long postId) throws CommentsNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteCommentByIdAndPost(Long postId, Long id) throws CommentsNotFoundException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Comments updateCommentofPostById(Comments comment, Long postId, Long id) throws CommentsNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Comments addComment(Comments comment) {
		// TODO Auto-generated method stub
		return this.commentsrepo.save(null);
	}
	
	

}
