package com.hazalyarimdunya.taskmanager.controller.impl;

import com.hazalyarimdunya.taskmanager.controller.interfaces.IUserController;
import com.hazalyarimdunya.taskmanager.entity.User;
import com.hazalyarimdunya.taskmanager.services.interfaces.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/rest/api/user")
public class userControllerImpl implements IUserController {
    //servisteki metodlar oldugu gibi yazilmaz. once interfaces icinde tanimlanir sonra impl de implemente edilir.

    @Autowired
    private IUserService iUserService; // servis katmani baglandi.Servise inerken impl clasiylada baglanilabilir.

    @PostMapping(path = "/save")
    @Override
    public User saveUser(@RequestBody User user){
        return iUserService.saveUser(user);
    }

}
