package com.hazalyarimdunya.taskmanager.services.interfaces;

import com.hazalyarimdunya.taskmanager.entity.User;

import java.util.List;

public interface IUserService {
    public User saveUser(User user);
    public List<User> getAllUsers();
    public User getUserById(Integer userId);
    public void deleteUserById(Integer id);
}
