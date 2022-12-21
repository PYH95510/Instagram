package com.cos.photostagram.config.auth;

import java.security.Principal;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.cos.photostagram.domain.user.User;
import com.cos.photostagram.domain.user.UserRepository;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class PrincipalDetailsService implements UserDetailsService {
    private final UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        User userEntity = userRepository.findByUsername(username);
        // we need to compare username. To check if there is username, we need to check
        // DB which means, we need UserRepository.

        if (userEntity == null) {
            return null;
        } else {
            return new PrincipalDetails(userEntity); // we made principalDetails.java file to implment userDetials to
                                                     // return the
            // userEntity
            // it will save principalDetails to new session.
        }

    } // overrides UserDetailsSevice so it will gives us Principal Details Servie.

}
