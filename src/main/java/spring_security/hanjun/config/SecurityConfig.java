package spring_security.hanjun.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

import java.util.ArrayList;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    //두 개ㅏ

    @Bean
    public SecurityFilterChain FilterChain(HttpSecurity http) throws Exception {

        http
                .securityMatchers((auth) -> auth.requestMatchers("/user"));


        http
                .authorizeHttpRequests((auth) -> auth
                        .requestMatchers("/user").permitAll());

        return http.build();
    }

    @Bean
    public SecurityFilterChain FilterChain1(HttpSecurity http) throws Exception {

        http
                .securityMatchers((auth) -> auth.requestMatchers("/admin"));

        http
                .authorizeHttpRequests((auth) -> auth
                        .requestMatchers("/admin").permitAll());


        return http.build();

    }
}
