package com.insta.photostagram.Service;

import com.insta.photostagram.domain.User;
import com.insta.photostagram.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public User login(String userID, String){
        User user = userRepository.findOneByUserId(userID);
        if (user == null) return null;
        String pw = EncryptionUtils.encryptMD5(password);

    }

}
