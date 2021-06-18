package com.example.AccessingUserData;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.AccessingUserData.User;
import com.example.AccessingUserData.EntityNotFoundException;
import java.util.List;


@Service
public class MainService{
    @Autowired
    private UserRepository repo;

    public User findById(Integer id){
        return repo.findById(id).orElseThrow(EntityNotFoundException::new);
    }

    public Iterable<User> findAll(){
        return repo.findAll();
    }

    /*public User saveUser(User user){
        return repo.save(user);
    }*/

}