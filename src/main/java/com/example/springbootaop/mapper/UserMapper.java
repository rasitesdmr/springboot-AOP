package com.example.springbootaop.mapper;

import com.example.springbootaop.dto.UserDTO;
import com.example.springbootaop.model.User;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserDTO userToUserDTO (User user);

    User userDTOToUser(UserDTO userDTO);

    List<UserDTO> userToUserDTOList(List<User> users);
}
