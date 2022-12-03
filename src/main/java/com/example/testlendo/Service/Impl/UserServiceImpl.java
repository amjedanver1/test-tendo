package com.example.testlendo.Service.Impl;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.example.testlendo.Service.UserService;
import com.example.testlendo.dto.UserDto;
import com.google.gson.reflect.TypeToken;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
@Service
public class UserServiceImpl implements UserService {

    @Override
    public List<UserDto> getAllUser() throws Exception{
        List<UserDto> userDtos = new ArrayList<>();
        String uri = "https://gorest.co.in/public/v2/users";
        Gson gson = new Gson();
        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(uri, String.class);

        userDtos = gson.fromJson(result,new TypeToken<List<UserDto>>() {}.getType());

        return userDtos;

    }
}
