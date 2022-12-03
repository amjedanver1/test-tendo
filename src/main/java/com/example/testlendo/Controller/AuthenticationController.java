package com.example.testlendo.Controller;

import com.example.testlendo.Service.Impl.MyUserDetailsServiceImpl;
import com.example.testlendo.Service.MyUserDetailsService;
import com.example.testlendo.Utills.JwtUtil;
import com.example.testlendo.dto.AuthRequestDto;
import com.example.testlendo.dto.AuthResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/auth")
public class AuthenticationController {

    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    private MyUserDetailsService myUserDetailsService;
    @Autowired
    private JwtUtil jwtUtil;

    @CrossOrigin
    @RequestMapping(method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<AuthResponseDto> createdAuthToken(@RequestBody AuthRequestDto authRequestDto) throws Exception {
        System.out.println("get User Name and Password");
        try {
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(authRequestDto.getUsername(), authRequestDto.getPassword())
            );

        }catch (BadCredentialsException e){
            throw new Exception("Incorrect cradintial",e);
        }

        final UserDetails userDetails = myUserDetailsService.loadUserByUsername(authRequestDto.getUsername());
        final String jwt = jwtUtil.generateToken(userDetails);
        return new ResponseEntity(new AuthResponseDto(jwt), HttpStatus.ACCEPTED);
    }
}
