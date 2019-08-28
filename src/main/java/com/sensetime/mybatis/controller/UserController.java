package com.sensetime.mybatis.controller;

import java.util.List;
import lombok.extern.slf4j.Slf4j;

import com.sensetime.mybatis.entity.User;
import com.sensetime.mybatis.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/api/v1")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public void createUser(@RequestBody User user) {

        log.info("/api/v1/user controller:createUser");

        userService.createUser(user);
    }

    @RequestMapping(value = "/user/{id}", method = RequestMethod.DELETE)
    public void deleteUserById(@PathVariable("id") Integer id) {

        log.info("/api/v1/user controller:deleteUserById");

        userService.deleteUserById(id);
    }

    @RequestMapping(value = "/user", method = RequestMethod.PUT)
    public void updateUser(@RequestBody User user) {

        log.info("/api/v1/user controller:updateUser");

        userService.updateUser(user);
    }


    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    public User getUserById(@PathVariable("id") Integer id) {

        log.info("/api/vi/user controller:getUserById");

        return userService.getUserById(id);
    }

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public List<User> getAllUsers() {

        log.info("/api/v1/user controller:getAllUsers");

        return userService.getAllUsers();
    }

}
