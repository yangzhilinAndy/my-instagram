package com.andy.project.myinstagram;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<User> findAll() {
        return userService.findAll();
    }

    @GetMapping("/users/{id}")
    public User findById(@PathVariable("id") String id) {
        return userService.findById(id);
    }

    @PostMapping("/users")
    public User create(@RequestParam("username") String username,
                             @RequestParam("email") String email,
                       @RequestParam("password") String password) {
        return userService.create(username, email, password);
    }

    @DeleteMapping("/users/{id}")
    public void deleteById(@PathVariable("id") String id) {
        userService.deleteById(id);
    }
}
