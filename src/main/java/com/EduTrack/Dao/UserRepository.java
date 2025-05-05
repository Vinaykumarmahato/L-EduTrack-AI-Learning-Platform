package com.EduTrack.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.EduTrack.entity.User;

public interface UserRepository  extends JpaRepository<User, Integer>{

}
