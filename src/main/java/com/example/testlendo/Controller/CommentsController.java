package com.example.testlendo.Controller;
import com.example.testlendo.Service.CommentsService;
import com.example.testlendo.dto.CommentDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Service
@RequestMapping("/comment")
public class CommentsController {

    @Autowired
    private CommentsService commentsService;

    @CrossOrigin
    @RequestMapping(path = "/getALL", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<CommentDto>> getAllComments() throws Exception {
        System.out.println("get All Comments");
        List<CommentDto> response = commentsService.getAllPosts();

        return new ResponseEntity(response, HttpStatus.ACCEPTED);
    }

    @CrossOrigin
    @RequestMapping(path = "/getByPostId/{postId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<CommentDto>> getCommentsByPostId(@PathVariable("postId") int postId) throws Exception {
        System.out.println("get Comments By Post Id");
        List<CommentDto> response = commentsService.getCommentsByPostId(postId);

        return new ResponseEntity(response, HttpStatus.ACCEPTED);
    }
}
