package az.bftelman.LiquibaseDemo.controllers;

import az.bftelman.LiquibaseDemo.entities.User;
import az.bftelman.LiquibaseDemo.repositories.UserRepository;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    private final UserRepository _userRepository;

    @Autowired
    public UserController(UserRepository userRepository) {
        this._userRepository = userRepository;
    }

    @GetMapping("/all")
    public List<User> GetAllUsers() {
        var users = _userRepository.findAll();
        System.out.println(users);
        return users;
    }

}
