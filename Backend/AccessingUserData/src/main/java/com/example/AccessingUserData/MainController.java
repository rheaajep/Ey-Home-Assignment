package com.example.AccessingUserData;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;
import com.example.AccessingUserData.MainService;
import com.example.AccessingUserData.EntityNotFoundException;
import com.example.AccessingUserData.User;
import java.util.*;

@RestController
@RequestMapping(path="/Users")
public class MainController{
    @Autowired
    private MainService mainservice;

    @GetMapping
    @ResponseBody
    public User getOneUser(@RequestParam(value="id") Integer id){
        return mainservice.findById(id);
    }

    @GetMapping(path="/all")
    @ResponseBody
    public Iterable<User> getAllUsers(){
        Iterable<User> allUsers=mainservice.findAll();
        if (allUsers==null){
            throw new EntityNotFoundException();
        }
        else{
            return allUsers;
        }
    }


    @PostMapping
    public void updateUser(@RequestBody User user){
        User data=mainservice.saveUser(user);
        if (data==null){
            throw new RuntimeException();
        }
        
    }


}