package com.cos.photostagram.service;

import org.springframework.stereotype.Service;

import com.cos.photostagram.domain.user.User;
import com.cos.photostagram.domain.user.UserRepository;

import lombok.RequiredArgsConstructor;

// now it is registered in IoC container. All authserivce would be same and be using this after di.
@RequiredArgsConstructor
@Service
public class AuthService {
    final UserRepository userRepository; // di

    public User Singups(User user) {
        User userEntity = userRepository.save(user); // save(s type) here, s type is the type that I set, here is user

        return userEntity;
    }
}
