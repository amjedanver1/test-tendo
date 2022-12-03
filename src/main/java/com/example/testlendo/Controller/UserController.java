package com.example.testlendo.Controller;

import com.example.testlendo.Service.UserService;
import com.example.testlendo.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Service
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;


    @CrossOrigin
    @RequestMapping(path = "/getALL", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<UserDto>> getAllUsers() throws Exception {
        System.out.println("get All User");
        List<UserDto> response = userService.getAllUser();
        return new ResponseEntity(response, HttpStatus.ACCEPTED);
    }

}
