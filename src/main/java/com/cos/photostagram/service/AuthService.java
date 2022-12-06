package com.cos.photostagram.service;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cos.photostagram.domain.user.User;
import com.cos.photostagram.domain.user.UserRepository;

import lombok.RequiredArgsConstructor;

// now it is registered in IoC container. All authserivce would be same and be using this after di.
@RequiredArgsConstructor
@Service
public class AuthService {
    private final UserRepository userRepository; // DI
    private final BCryptPasswordEncoder bCryptPasswordEncoder; // DI bc of RequiredArgsConstructor

    @Transactional
    public User Singups(User user) {

        String rawpassword = user.getPassword(); // bring password from dto
        String encPassword = bCryptPasswordEncoder.encode(rawpassword);
        user.setPassword(encPassword);
        user.setRole("ROLE_USER");

        User userEntity = userRepository.save(user); // save(s type) here, s type is the type that I set, here is user

        return userEntity;
    }
}
