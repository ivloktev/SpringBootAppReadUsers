package ru.springBootFirst.springcource.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.springBootFirst.springcource.model.Users;
import ru.springBootFirst.springcource.service.UserService;

import java.util.List;

@RestController
@AllArgsConstructor
public class UsersController {
    private final UserService userService;
    @GetMapping("/users")
    public ResponseEntity<List<Users>> readAll(){
        return new ResponseEntity<>(userService.readAll(), HttpStatus.OK);
    }
}
