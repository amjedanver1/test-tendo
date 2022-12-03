package com.example.testlendo.Service;

import com.example.testlendo.dto.CommentDto;

import java.util.List;

public interface CommentsService {
    List<CommentDto> getAllPosts() throws Exception;

    List<CommentDto> getCommentsByPostId(int postId) throws Exception;
}
