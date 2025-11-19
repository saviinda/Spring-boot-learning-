package com.test1.demo.service;

import com.test1.demo.dto.UserDTO;
import com.test1.demo.model.User;
import com.test1.demo.repo.UserRepo;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional                           //data transaction management

public class UserService {
    @Autowired
    private UserRepo userRepo;           //data transfer between objects through interface

    @Autowired
    private ModelMapper modelMapper;     //object mapping between DTO and entity

    public List<UserDTO> getAllUsers(){

        List<User> userList = userRepo.findAll(); // Fetch all users from the database

        return modelMapper.map(
                userList,
                new TypeToken<List<UserDTO>>() {}.getType()); // Map entity list to DTO list

    }
    public UserDTO saveUser(UserDTO userDTO){                   // Save a new user
        userRepo.save(modelMapper.map(userDTO, User.class));    // Map DTO to entity and save to database
        return userDTO;                                         // Return the saved DTO
    }
}











