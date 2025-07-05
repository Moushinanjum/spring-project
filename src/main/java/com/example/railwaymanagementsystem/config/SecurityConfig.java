package com.example.railwaymanagementsystem.config;

import org.apache.catalina.filters.HttpHeaderSecurityFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public UserDetailsService userDetailsService() {
        UserDetails employee = User.withDefaultPasswordEncoder()
                .username("employee")
                .password("pass1")
                .roles("EMPLOYEE")
                .build();

        UserDetails passenger = User.withDefaultPasswordEncoder()
                .username("passenger")
                .password("pass2")
                .roles("PASSENGER")
                .build();

        return new InMemoryUserDetailsManager(employee, passenger);
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/public/", "/swagger-ui/", "/v3/api-docs/").permitAll()
                        .requestMatchers("/employee/").hasRole("EMPLOYEE")
                        .requestMatchers("/passenger/").hasAnyRole("PASSENGER", "EMPLOYEE")
                        .anyRequest().authenticated()
                )
                .formLogin(Customizer.withDefaults())
                .httpBasic(Customizer.withDefaults());

        return http.build();
    }
}