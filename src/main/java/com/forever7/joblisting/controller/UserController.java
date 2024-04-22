package com.forever7.joblisting.controller;

import com.forever7.joblisting.repository.UserRepository; // Assuming you have a UserRepository for managing users
import com.forever7.joblisting.model.User;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserRepository userRepository;

    @PostMapping("/createUser")
    public void createUser(@RequestBody User user, HttpServletResponse response) throws IOException {
        try {
            System.out.println("User" + user);
            userRepository.save(user);
            response.getWriter().println("User created successfully!");
        } catch (Exception e) {
            response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
            response.getWriter().println("Error creating user: " + e.getMessage());
        }
    }


    @GetMapping("/getAllUsers")
    public void getAllUsers(HttpServletResponse response) throws IOException {
        try {
            List<User> users = userRepository.findAll(); // Assuming findAll() returns all users from the database
            response.getWriter().println(users.toString()+"get All users");
        } catch (Exception err){
            response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
            response.getWriter().println("Error in the fetching Dat"+ err.getMessage());
        }

    }
}
