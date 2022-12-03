package com.example.testlendo.Service.Impl;
import com.example.testlendo.Service.PostsService;
import com.example.testlendo.dto.PostsDto;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PostsServiceImpl implements PostsService {

    @Override
    public List<PostsDto> getAllPosts() throws Exception{
        List<PostsDto> postsDtos = new ArrayList<>();
        String uri = "https://gorest.co.in/public/v2/posts";
        Gson gson = new Gson();
        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(uri, String.class);

        postsDtos = gson.fromJson(result,new TypeToken<List<PostsDto>>(){}.getType());

        return postsDtos;

    }

    @Override
    public List<PostsDto> getPostByUserId(int userId) throws Exception{
        List<PostsDto> postsDtos = new ArrayList<>();
        List<PostsDto> resultlist = this.getAllPosts();
        if(resultlist != null && resultlist.size()>0){
            postsDtos = resultlist.stream().filter(res-> res.getUser_id() == userId).collect(Collectors.toList());
        }
        return postsDtos;
    }
}
