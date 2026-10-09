
package com.kiet.student.controller;

import java.util.List;
import java.util.ArrayList;

import com.kiet.student.model.Student;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/Students")
public class StudentController {

    List<Student> users = new ArrayList<>(); // in memory list

    @PostMapping
    public String AddUser(@RequestBody Student u) {
        users.add(u);
        return "Added " + u.getName();
    }

    @GetMapping
    public List<Student> getAllUsers() {
        return users;
    }

    @GetMapping("/{id}")
    public Student getUser(@PathVariable Long id) {
        for (Student u : users) {
            if (u.getId().equals(id)) {
                return u;
            }
        }

        return null;
    }

    @DeleteMapping("/{id}")
    public String DeleteUser(@PathVariable Long id) {
        for (Student user : users) {
            if (user.getId().equals(id)) {
                users.remove(user);
                return "Student deleted successfully" + id;
            }
        }

        return "Student not found";
    }
}
