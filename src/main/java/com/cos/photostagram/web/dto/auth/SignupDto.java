package com.cos.photostagram.web.dto.auth;

import com.cos.photostagram.domain.user.User;

import lombok.Data;

@Data // Getter,Setter,toString
public class SignupDto {
    private String username;
    private String password;
    private String email;
    private String name;

    public User toEntity() {
        return User.builder()
                .username(username)
                .password(password)
                .email(email)
                .name(name)
                .build();
    }
}
