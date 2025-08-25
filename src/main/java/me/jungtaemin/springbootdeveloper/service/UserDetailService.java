package me.jungtaemin.springbootdeveloper.service;

import lombok.RequiredArgsConstructor;
import me.jungtaemin.springbootdeveloper.domain.User;
import me.jungtaemin.springbootdeveloper.repository.UserRepository;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserDetailService {

    private final UserRepository userRepository;

    @Override
    public User loadUserByUsername(String email) {
        return userRepository.findByEmail(email)
                .orElseThrow(() -> new IllegalArgumentException((email)));
    }
}
