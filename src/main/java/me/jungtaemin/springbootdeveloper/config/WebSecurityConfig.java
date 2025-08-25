package me.jungtaemin.springbootdeveloper.config;

import lombok.RequiredArgsConstructor;
import me.jungtaemin.springbootdeveloper.service.UserDetailService;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@Configuration
@EnableWebSecurity
@RequiredArgsConstructor
public class WebSecurityConfig {

    private final UserDetailService userService;
}
