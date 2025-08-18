package com.hazalyarimdunya.taskmanager.controller.impl;

import com.hazalyarimdunya.taskmanager.controller.interfaces.IUserController;
import com.hazalyarimdunya.taskmanager.entity.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/rest/api/user")
public class userControllerImpl implements IUserController {
    //servisteki metodlar oldugu gibi yazilmaz. once interfaces icinde tanimlanir sonra impl de implemente edilir.
    @Override
    public User saveUser(User user) {
        return null;
    }

}
