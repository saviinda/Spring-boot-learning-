package com.test1.demo.service;

import com.test1.demo.dto.UserDTO;
import com.test1.demo.repo.UserRepo;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
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
        List<User>userList = userRepo.findAll();  //fetch all users from database
        return modelMapper.map(userList,new TypeToken<List<UserDTO>>(){}.getType()); //map entity list to DTO list

    }
}











