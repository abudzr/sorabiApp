package com.example.sorabi.services;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sorabi.models.Users;
import com.example.sorabi.repositories.UsersRepositories;

@Service
public class UsersServices {
    @Autowired
    UsersRepositories usersRepositories;

    public List<Users> allUsers(){
        List<Users> users = new ArrayList<Users>();
        usersRepositories.findAll().forEach(list -> users.add(list));
        return users;
    }

    public void create(Users users){
        usersRepositories.save(users);
    }

}
