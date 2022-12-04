package com.cos.photogramstart.domain.user;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;

import org.springframework.beans.factory.annotation.Autowired;

import com.cos.photogramstart.web.dto.auth.SignupDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder // using builder pattern
@AllArgsConstructor // make all constructors
@NoArgsConstructor // make all empty constructors automatically
@Data // automatically make getter, setter, toString
@Entity // automatically make table in DB
public class User {

    @GeneratedValue(strategy = GenerationType.IDENTITY) // number incremented strategy.
    @Id // setting primary key
    private Integer id; // it will give number whenever data is inserted

    private String username;

    private String password;

    private String name;

    private String website;

    private String bio;

    private String email;

    private String phone;

    private String gender;

    private String profileImageUrl;

    private String role;

    private LocalDateTime createDate;

    @PrePersist
    public void createDate() {
        this.createDate = LocalDateTime.now();
    }
}
