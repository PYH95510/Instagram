package com.cos.photostagram.domain.user;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    // technically we should use @Repository, but JpaRepository is already
    // @Repository and we are extending it, so
    // we do not need to do so and this is automatically registerd to IoC container.
    User findByUsername(String username);

}
