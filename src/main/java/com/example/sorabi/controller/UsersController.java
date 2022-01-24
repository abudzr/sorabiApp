package com.example.sorabi.controller;

import java.util.List;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import com.example.sorabi.models.Users;
import com.example.sorabi.services.UsersServices;

@Configuration
//Controller
@RestController
@RequestMapping("/api")
@Api(tags = "Users")
public class UsersController {
    @Autowired
    UsersServices usersServices;

    @ApiOperation("View All Users")
    @GetMapping(path="/users")
    public List<Users> allVoters(){
        return usersServices.allUsers();
    }

//    @ApiOperation("View users details by Id")
//    @GetMapping(path="/users/{id}")
//    public Users usersById(@PathVariable("id") Integer id){
//        return usersServices.usersById(id);
//    }
//
    @ApiOperation("Create new users")
    @PostMapping("/users")
    public Users createUsers(@RequestBody Users users){
        usersServices.create(users);
        return users;
    }

}