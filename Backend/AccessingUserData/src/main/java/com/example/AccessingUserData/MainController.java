package com.example.AccessingUserData;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;
import com.example.AccessingUserData.MainService;
import com.example.AccessingUserData.EntityNotFoundException;
import com.example.AccessingUserData.User;
import com.example.AccessingUserData.Sample;
import java.util.*;

@RestController
@RequestMapping(path="/Users")
@CrossOrigin(origins="http://localhost:4200")
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
    public String updateUser(@RequestParam Integer id, @RequestParam String firstname, @RequestParam String middlename, @RequestParam String lastname, @RequestParam String email, @RequestParam String phonenos, @RequestParam String location, @RequestParam String address, @RequestParam String linkedin){

        Boolean res=mainservice.saveUser(id,firstname,middlename,lastname,email,phonenos,location,address,linkedin);
        if (res==true){
            return "Information Updated";
            
        }
        else{
            throw new RuntimeException();
            
        }
        
    }


}