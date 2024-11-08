package com.example.demo.ServiceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.User;
import com.example.demo.Entity.User.Role;
import com.example.demo.Repository.UserRepository;

@Service
public class UserService {
	@Autowired
    private UserRepository userRepository;

    public User registerUser(User user) {
        user.setRole(Role.EMPLOYEE);
        return userRepository.save(user);
    }

    public Optional<User> findUserByUsername(String username) {
        return userRepository.findByUsername(username);
    }
}
