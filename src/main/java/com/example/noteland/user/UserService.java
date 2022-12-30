package com.example.noteland.user;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class UserService {
    public List<User> getUsers(){
        return List.of(
                new User(1L, "Leon", "cty549868165@gmail.com", LocalDate.now(), "+1 6174178969")
        );
    }
}
