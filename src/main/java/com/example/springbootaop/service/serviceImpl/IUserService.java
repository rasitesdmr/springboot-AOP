package com.example.springbootaop.service.serviceImpl;

import com.example.springbootaop.dto.UserDTO;
import com.example.springbootaop.exception.UserEmailAlreadyExistsException;
import com.example.springbootaop.exception.UserIdAlreadyExistsException;
import com.example.springbootaop.exception.UserNameAlreadyExistsException;
import com.example.springbootaop.exception.UserNotNullException;
import com.example.springbootaop.mapper.UserMapper;
import com.example.springbootaop.model.User;
import com.example.springbootaop.repository.UserRepository;
import com.example.springbootaop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class IUserService implements UserService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    UserMapper userMapper;

    @Override
    public User saveUser(UserDTO userDTO) {

        if (userRepository.getByUserName(userDTO.getUserName()).isPresent()) {
            throw new UserNameAlreadyExistsException();
        }
        if (userRepository.getByEmail(userDTO.getEmail()).isPresent()) {
            throw new UserEmailAlreadyExistsException();
        }
        User userMap = userMapper.userDTOToUser(userDTO);
        return userRepository.save(userMap);
    }

    @Override
    public User updateUser(UserDTO userDTO, Long id) {

        User newUser = userRepository.findById(id).orElseThrow(UserIdAlreadyExistsException::new);
        newUser.setUserName(userDTO.getUserName());
        newUser.setEmail(userDTO.getEmail());

        Optional<User> optionalUser = userRepository.getByEmail(userDTO.getEmail());
        if (newUser.getEmail() != userDTO.getEmail() && optionalUser.isPresent()) {
            throw new UserEmailAlreadyExistsException();
        }

        optionalUser = userRepository.getByUserName(userDTO.getUserName());
        if (newUser.getUserName() != userDTO.getUserName() && optionalUser.isPresent()) {
            throw new UserEmailAlreadyExistsException();
        }

        return userRepository.save(newUser);


    }

    @Override
    public void deleteUser(Long id) {
        User user =userRepository.findById(id).orElseThrow(UserNotNullException::new);
        userRepository.delete(user);
    }

    @Override
    public List<User> getUsers() {
        return userRepository.findAll();
    }


}
