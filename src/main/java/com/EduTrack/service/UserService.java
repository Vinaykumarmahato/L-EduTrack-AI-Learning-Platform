package com.EduTrack.service;

import java.util.List;
import java.util.Optional;

import com.EduTrack.entity.User; // ✅ Add this import

public interface UserService {
	
	 void saveUser(User user);

    User createUser(User user);

    List<User> getAllUsers();

    Optional<User> getUserDetails(int id);
}
