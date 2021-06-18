package com.example.AccessingUserData;

import java.io.Serializable;
import com.example.AccessingUserData.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;

public interface UserRepository extends CrudRepository<User,Serializable>{

    @Query("select u from User u where u.firstname=?1")
    List<User> findUsers();
}