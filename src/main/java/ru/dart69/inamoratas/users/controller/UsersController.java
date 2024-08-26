package ru.dart69.inamoratas.users.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpClientErrorException;
import ru.dart69.inamoratas.users.data.User;
import ru.dart69.inamoratas.users.data.UsersRepository;

@RestController
@AllArgsConstructor
@RequestMapping(value = "users")
public class UsersController {
    private final UsersRepository repository;

    @GetMapping
    public Iterable<User> getAllUsers() {
        return repository.findAll();
    }

    @GetMapping(value = "{id}")
    public User findUserById(@PathVariable long id) {
        return repository.findById(id).orElseThrow(() ->
                new HttpClientErrorException(HttpStatus.NOT_FOUND, "Can't find any user with given id. Id = " + id)
        );
    }
}
