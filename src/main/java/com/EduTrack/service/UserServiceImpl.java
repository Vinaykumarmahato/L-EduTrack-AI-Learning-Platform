package com.EduTrack.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.EduTrack.entity.User;

@Service  // 🔥 This is crucial!
public class UserServiceImpl implements UserService {

    @Override
    public User createUser(User user) {
        return null;
    }

    @Override
    public List<User> getAllUsers() {
        return null;
    }

    @Override
    public Optional<User> getUserDetails(int id) {
        return Optional.empty();
    }

    @Override
    public void saveUser(User user) {
        // Actual saving logic goes here
    }
}
