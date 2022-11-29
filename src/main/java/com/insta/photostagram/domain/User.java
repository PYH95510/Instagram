package com.insta.photostagram.domain;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data // lombok에 의해 getter setter 생성
@Entity
@org.hibernate.annotations.DynamicUpdate // 나중에 필요해서 미리 설정 / 수정가능하게 해줌
public class User {
    @Id // pk
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto increase
    int id;

    String userId;
    String password;
    String name;
    String introduce;
    String phone;
    String website;
    String userType;
    int enable;
}