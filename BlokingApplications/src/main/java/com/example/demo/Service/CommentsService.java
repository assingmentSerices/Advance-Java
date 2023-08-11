package com.example.demo.Service;

import java.util.List;

import com.example.demo.Bean.Comments;
import com.example.demo.ExcptionHandler.CommentsNotFoundException;
import com.example.demo.ExcptionHandler.PostsNotFoundException;


public interface CommentsService {

	List<Comments> getCommentsByPostId(Long id) throws PostsNotFoundException;

	Comments getCommentById(Long id, Long postId) throws CommentsNotFoundException;

	boolean deleteCommentByIdAndPost(Long postId, Long id) throws CommentsNotFoundException;

	Comments updateCommentofPostById(Comments comment, Long postId, Long id) throws CommentsNotFoundException;

	Comments addComment(Comments comment);
	
}
