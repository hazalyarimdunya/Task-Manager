package com.hazalyarimdunya.taskmanager.controller.interfaces;

import com.hazalyarimdunya.taskmanager.entity.User;

public interface IUserController {
    public User saveUser(User user); //User entityden user parametre ile gidip bir user aliyoruz ve User tipinde donuyoruz metodu.
}
