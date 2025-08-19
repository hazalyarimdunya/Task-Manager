package com.hazalyarimdunya.taskmanager.services.impl;

import com.hazalyarimdunya.taskmanager.entity.User;
import com.hazalyarimdunya.taskmanager.repository.IUserRepository;
import com.hazalyarimdunya.taskmanager.services.interfaces.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserRepository iUserRepository;


    @Override
    public User saveUser(User user) {
        return iUserRepository.save(user); // user db ye kaydedildi. save() metodu JpaRepository icinden alindi
    }

    @Override
    public List<User> getAllUsers() {
        return iUserRepository.findAll();// DB de kayitli user listesi cagirilir. findAll() metodu JpaRepository icinden alindi
    }
}
