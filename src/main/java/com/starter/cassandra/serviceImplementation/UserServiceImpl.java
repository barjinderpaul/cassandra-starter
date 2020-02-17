package com.starter.cassandra.serviceImplementation;

import com.starter.cassandra.profile.User;
import com.starter.cassandra.repository.UserRepository;
import com.starter.cassandra.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;

    @Override
    public String save(User user) {
        return userRepository.save(user).getUsername();
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
