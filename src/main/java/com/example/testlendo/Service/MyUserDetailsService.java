package com.example.testlendo.Service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public interface MyUserDetailsService {
    UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException;
}
