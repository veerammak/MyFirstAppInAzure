package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

	@Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception
    {
        // @formatter:off
        http.authorizeHttpRequests().antMatchers("/").permitAll();
        http.csrf().disable();
        
        return http.build();
    }
}
