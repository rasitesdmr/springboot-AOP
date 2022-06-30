package com.example.springbootaop.service;
import com.example.springbootaop.dto.UserDTO;
import com.example.springbootaop.model.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface UserService {

    User saveUser(UserDTO userDTO);

    User updateUser(UserDTO userDTO , Long id);

    void deleteUser(Long id);

    List<User> getUsers();




}
