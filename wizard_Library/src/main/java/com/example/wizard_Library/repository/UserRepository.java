package com.example.wizard_Library.repository;

import com.example.wizard_Library.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
    public User findUserByUsername(String name);
}
