package com.example.AccessingUserData;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;
//import com.example.AccessingUserData.MainService;
import com.example.AccessingUserData.User;
import java.util.*;

@RestController
@RequestMapping(path="/Users")
public class MainController{
    @Autowired
    private MainService mainservice;

    @GetMapping
    public User getOneUser(@RequestParam(value="id") Integer id){
        return mainservice.findById(id);
    }

    @GetMapping(path="/all")
    public String getAllUsers(){
        //return mainservice.findAll();
        return "found";
    }

    @GetMapping(path="/hello")
    public String hello(){
        return "hello world!";
    }

    /*@PostMapping
    public User updateUser(@RequestBody User user){
        return mainservice.saveUser(user);
    }*/


}