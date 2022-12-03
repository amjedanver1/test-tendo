//package com.example.testlendo.Configuration;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.provisioning.InMemoryUserDetailsManager;
//import org.springframework.security.web.SecurityFilterChain;
//
//@Configuration
//@EnableWebSecurity
//public class SpringSecurityAuthentication {
//
//    @Bean
//    public SecurityFilterChain securityFilterChain (HttpSecurity httpSecurity) throws Exception{
//        httpSecurity.authorizeRequests(res-> res.antMatchers("/getAll").permitAll()
//                .anyRequest().authenticated()).formLogin();
//        return httpSecurity.build();
//    }
//
//    @Bean
//    public InMemoryUserDetailsManager userDetailsManager(){
//        User.UserBuilder user = User.withDefaultPasswordEncoder();
//
//        UserDetails userOne = user.username("testuser").password("testUser1").roles("USER").build();
//        UserDetails userTwo = user.username("testuser2").password("testuser2").roles("USER").build();
//        return new InMemoryUserDetailsManager(userOne, userTwo);
//    }
//}
