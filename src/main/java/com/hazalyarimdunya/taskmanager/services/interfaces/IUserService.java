package com.hazalyarimdunya.taskmanager.services.interfaces;

import com.hazalyarimdunya.taskmanager.entity.User;

import java.util.List;

public interface IUserService {
    public User saveUser(User user);
    public List<User> getAllUsers();
}
