package com.test1.demo.controller;

import com.test1.demo.dto.UserDTO;
import com.test1.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value="api/v1")
public class UserController {
    @Autowired
    private UserService userService; //inject UserService for business logic

    @GetMapping("/getusers") //  can get table data when this called
    public List<UserDTO> getUsers() {
        return userService.getAllUsers(); //fetch all users and return as DTO list
    }
    @PostMapping("/adduser")                                            //endpoint to add new user
    public UserDTO saveUser(@RequestBody UserDTO userDTO){              //save new user from request body
        return userService.saveUser(userDTO);                           //save user and return saved DTO
    }

}
