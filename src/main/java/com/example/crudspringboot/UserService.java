package com.example.crudspringboot;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository repository;

    public UserService(UserRepository repository) {
        super();
        this.repository = repository;
    }

    public List<User> getAllUsers() {
        return repository.findAll();
    }

    public User getUserById(int id) {
        return repository.findById(id).orElse(null);
    }

    public User addUser(User user) {
        return repository.save(user);
    }

    public User removeUser(int id){
        User user = repository.findById(id).orElse(null);
        if(user != null){
            repository.delete(user);
        }
        return user;
    }
}
