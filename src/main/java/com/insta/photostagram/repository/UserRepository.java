package com.insta.photostagram.repository;

import com.insta.photostagram.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
    User findOneByUserId(String userId); //find by user id use string
    User findById(int id); //find by ID using int
    User findByUserId(String userId);
}
