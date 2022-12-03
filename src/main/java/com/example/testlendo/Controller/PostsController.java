package com.example.testlendo.Controller;

import com.example.testlendo.Service.PostsService;
import com.example.testlendo.dto.PostsDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Service
//@EnableAuthorizationServer
@RequestMapping("/post")
public class PostsController {
    @Autowired
    private PostsService postsService;

    @CrossOrigin
    @RequestMapping(path = "/getALL", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<PostsDto>> getAllPostes() throws Exception {
        System.out.println("get All Postes");
        List<PostsDto> response = postsService.getAllPosts();

        return new ResponseEntity(response, HttpStatus.ACCEPTED);
    }

    @CrossOrigin
    @RequestMapping(path = "/getByUserId/{userId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<PostsDto>> getPostByUserId(@PathVariable("userId") int userId) throws Exception {
        System.out.println("get Comments By User Id");
        List<PostsDto> response = postsService.getPostByUserId(userId);

        return new ResponseEntity(response, HttpStatus.ACCEPTED);
    }

}
