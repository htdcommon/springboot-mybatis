package com.sensetime.mybatis.dao;

import java.util.List;

import com.sensetime.mybatis.entity.User;

import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserDao {

    @Insert("insert into user (name,age,money) values (#{user.name}, #{user.age}, #{user.money})")
    void createUser(@Param("user") User user);


    @Delete("delete from user where id = #{id}")
    void deleteUserById(@Param("id") Integer id);

    @Update("update user set name = #{user.name},age = #{user.age},money = #{user.money} where id = #{user.id}")
    void updateUserById(@Param("user") User user);

    @Select("select * from user where id = #{id}")
    User getUserById(@Param("id") Integer id);

    @Select("select * from user")
    List<User> getAllUsers();

}
