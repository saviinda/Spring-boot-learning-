package com.test1.demo.controller;

import com.test1.demo.dto.UserDTO;
import com.test1.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value="api/v1")
public class UserController {
    @Autowired
    private UserService userService; //inject UserService for business logic

    @GetMapping("/getUser")
    public List<UserDTO> getUser() {
        return userService.getAllUsers(); //fetch all users and return as DTO list
    }
}
