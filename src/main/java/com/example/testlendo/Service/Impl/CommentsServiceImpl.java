package com.example.testlendo.Service.Impl;

import com.example.testlendo.Service.CommentsService;
import com.example.testlendo.dto.CommentDto;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CommentsServiceImpl implements CommentsService {

    @Override
    public List<CommentDto> getAllPosts() throws Exception{
        List<CommentDto> postsDtos = new ArrayList<>();
        String uri = "https://gorest.co.in/public/v2/comments";
        Gson gson = new Gson();
        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(uri, String.class);

        postsDtos = gson.fromJson(result,new TypeToken<List<CommentDto>>() {}.getType());

        return postsDtos;

    }

    @Override
    public List<CommentDto> getCommentsByPostId(int postId) throws Exception{
        List<CommentDto> postsDtos = new ArrayList<>();
        List<CommentDto> resultlist = this.getAllPosts();
        if(resultlist != null && resultlist.size()>0){
            postsDtos = resultlist.stream().filter(res-> res.getPost_id() == postId).collect(Collectors.toList());
        }
        return postsDtos;
    }
}
