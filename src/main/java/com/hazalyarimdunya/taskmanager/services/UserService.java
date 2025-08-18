package com.hazalyarimdunya.taskmanager.services;

import com.hazalyarimdunya.taskmanager.entity.User;
import com.hazalyarimdunya.taskmanager.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service //Servis katmani olstugunu belirtir ve Contexte Bean olarak ekler.
public class UserService {

    @Autowired //UserRepository classinin nesnesini almak icin Context icinden bu anotasyonla Bean i cekiyorum.
    private UserRepository userRepository;

    public List<User> getAllUserList(){
        userRepository.getAllUserList();//Repository katmanina git
        return null;
    }
}

