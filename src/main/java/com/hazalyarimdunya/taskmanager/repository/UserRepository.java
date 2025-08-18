package com.hazalyarimdunya.taskmanager.repository;

import com.hazalyarimdunya.taskmanager.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository//Repository katmani olstugunu belirtir ve Contexte Bean olarak ekler.
public class UserRepository {

    public List<User> getAllUserList(){
        return null;
    }
}
