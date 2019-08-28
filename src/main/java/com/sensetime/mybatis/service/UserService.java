package com.sensetime.mybatis.service;

import java.util.List;

import com.sensetime.mybatis.entity.User;

public interface UserService {

    void createUser(User user);

    void deleteUserById(Integer id);

    void updateUser(User user);

    User getUserById(Integer id);

    List<User> getAllUsers();


}
