package com.example.springbootaop.repository;

import com.example.springbootaop.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    Optional<User> getByEmail(String email);

    Optional<User> getByUserName(String userName);

}
