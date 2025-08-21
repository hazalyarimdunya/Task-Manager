package com.hazalyarimdunya.taskmanager.controller.impl;

import com.hazalyarimdunya.taskmanager.controller.interfaces.IUserController;
import com.hazalyarimdunya.taskmanager.entity.User;
import com.hazalyarimdunya.taskmanager.repository.IUserRepository;
import com.hazalyarimdunya.taskmanager.services.interfaces.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/rest/api/user") //root url
public class userControllerImpl implements IUserController { //requesti ilk karsilayan class ve ilgili servise yonlendirir.
    //servisteki metodlar oldugu gibi yazilmaz. once interfaces icinde tanimlanir sonra impl de implemente edilir.

    @Autowired
    private IUserService iUserService; // servis katmani baglandi.Servise inerken impl class ile baglanilabilir.
    @Autowired
    private IUserRepository iUserRepository;

    @PostMapping(path = "/save")
    @Override
    public User saveUser(@RequestBody User user){
        //“HTTP request body’den gelen JSON’u al, otomatik olarak User nesnesine çevir ve bana parametre olarak ver.”
        return iUserService.saveUser(user);
    }

    @GetMapping(path = "/list")
    @Override
    public List<User> getAllUsers() {
        return iUserService.getAllUsers();
    }

    @GetMapping(path = "/list/{id}" )
    @Override
    public User getUserById(@PathVariable(name = "id", required = true) Integer userId) {
        return iUserService.getUserById(userId);
    }
}
