package com.starter.cassandra.service;

import com.starter.cassandra.profile.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    String save(User user);
    List<User> getAllUsers();
}
