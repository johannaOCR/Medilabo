package com.medilabo.backend.service;

import com.medilabo.backend.model.User;
import com.medilabo.backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    private BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    // Fetch all users
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    // Fetch user by ID
    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }

    // Fetch user by username
    public User getUserByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    // Create or update a user
    public User saveUser(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));  // Encrypt the password
        return userRepository.save(user);
    }

    // Delete user
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
