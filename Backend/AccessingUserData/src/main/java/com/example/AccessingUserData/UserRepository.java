package com.example.AccessingUserData;

import java.io.Serializable;
import com.example.AccessingUserData.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Repository
@CrossOrigin(origins="http://localhost:4200")
public interface UserRepository extends CrudRepository<User,Integer>{

    @Query("select ID, firstname, lastname, email from User")
    Iterable<User> findUsers();
}