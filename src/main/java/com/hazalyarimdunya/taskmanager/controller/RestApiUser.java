package com.hazalyarimdunya.taskmanager.controller;

import com.hazalyarimdunya.taskmanager.entity.User;
import com.hazalyarimdunya.taskmanager.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController //Servis katmani olstugunu belirtir ve Contexte Bean olarak ekler
@RequestMapping("/rest/api") // Root url for api
public class RestApiUser {


    @Autowired //UserServis classinin nesnesini almak icin Context icinden bu anotasyonla Bean i cekiyorum.
    private UserService userService;

    @GetMapping(path = "/user-list") //gelen istegin nerden geldigi belirtilmeli.
    public List<User> getAllUserList(){  //Gelen istekleri karsilayacak api(tum user listesini dondur).User:My Entity class
        userService.getAllUserList(); //Servis katmanina git
        return null;
    }

}
