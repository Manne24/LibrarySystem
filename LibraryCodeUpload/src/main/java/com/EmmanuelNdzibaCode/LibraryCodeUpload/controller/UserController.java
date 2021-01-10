package com.EmmanuelNdzibaCode.LibraryCodeUpload.controller;

import com.EmmanuelNdzibaCode.LibraryCodeUpload.entity.User;
import com.EmmanuelNdzibaCode.LibraryCodeUpload.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class UserController {

    @Autowired
    private UserRepo userRepo;

    // Get All Books


    @GetMapping("/users")
    public List<User> getAllUsers(){
        return userRepo.findAll();
    }

}
