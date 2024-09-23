package com.cyberdude.fullstack_backend.repository;

import com.cyberdude.fullstack_backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
