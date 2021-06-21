package com.example.AccessingUserData;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.AccessingUserData.User;
import com.example.AccessingUserData.EntityNotFoundException;
import com.example.AccessingUserData.UserRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@Service
@CrossOrigin(origins="http://localhost:4200")
public class MainService{
    @Autowired
    private UserRepository repo;

    public User findById(Integer id){
        return repo.findById(id).orElseThrow(EntityNotFoundException::new);
    }

    public Iterable<User> findAll(){
        return repo.findUsers();
        //return repo.findAll();
    }

    public Boolean saveUser(Integer id, String firstname, String middlename, String lastname,String email, String phonenos,String location,String address,String linkedin){
        User updatedUser=repo.findById(id).orElseThrow(EntityNotFoundException::new);
        updatedUser.setFirstName(firstname);
        updatedUser.setMiddleName(middlename);
        updatedUser.setLastName(lastname);
        updatedUser.setEmail(email);
        updatedUser.setPhoneNos(phonenos);
        updatedUser.setLocation(location);
        updatedUser.setAddress(address);
        updatedUser.setLinkedin(linkedin);
        repo.save(updatedUser);
        //if (data==null) return false;
        //else return true;
        return true;
        
    }

}