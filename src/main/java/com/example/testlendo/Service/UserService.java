package com.example.testlendo.Service;

import com.example.testlendo.dto.UserDto;

import java.util.List;

public interface UserService {

    List<UserDto> getAllUser() throws Exception;
}
