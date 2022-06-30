package com.example.springbootaop.controller;

import com.example.springbootaop.dto.UserDTO;
import com.example.springbootaop.mapper.UserMapper;
import com.example.springbootaop.model.User;
import com.example.springbootaop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService userService;

    @Autowired
    UserMapper userMapper;

    @GetMapping("/list")
    public ResponseEntity<List<UserDTO>> findAll() {
        List<UserDTO> userDTOList = userMapper.userToUserDTOList(userService.getUsers());
        return ResponseEntity.ok(userDTOList);
    }

    @PostMapping("/save")
    public User createUser(@RequestBody UserDTO userDTO) {
        return userService.saveUser(userDTO);
    }

    @PutMapping("/update/{id}")
    public User updateUser(@PathVariable("id") Long id, @RequestBody UserDTO userDTO) {
        return userService.updateUser(userDTO, id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteUser(@PathVariable("id") Long id) {
        userService.deleteUser(id);
    }



}

