package com.example.testlendo.Service;

import com.example.testlendo.dto.PostsDto;

import java.util.List;

public interface PostsService {
    List<PostsDto> getAllPosts() throws Exception;
    List<PostsDto> getPostByUserId(int userId) throws Exception;
}
