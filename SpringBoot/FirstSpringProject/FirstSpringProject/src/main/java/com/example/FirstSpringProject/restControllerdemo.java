package com.example.FirstSpringProject;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("Users") // create your base url localhost:8080/tanya/api

public class restControllerdemo {
    @GetMapping("/{id}") // http://locahost:8080/Users/1000 on GET API
    public String getUser(@PathVariable Long id) {
        return "User" + id;
    }

    @PostMapping // http://locahost:8080/Users on POST API
    public String createUser(@RequestBody String user) {
        return "Created: " + user;
    }

    @PutMapping("/{id}") // http://locahost:8080/Users/5 on PUT API
    public String updateUser(@PathVariable Long id, @RequestBody String user) {
        return "Updated: " + user;
    }

    @DeleteMapping("/{id}") // http://locahost:8080/Users/6 on DELETE API
    public String deleteUser(@PathVariable Long id) {
        return "Deleted: " + id;
    }
}
