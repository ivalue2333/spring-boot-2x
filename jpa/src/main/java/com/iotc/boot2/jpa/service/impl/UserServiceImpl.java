package com.iotc.boot2.jpa.service.impl;


import com.iotc.boot2.jpa.dao.UserRepository;
import com.iotc.boot2.jpa.model.User;
import com.iotc.boot2.jpa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created By Intellij IDEA
 *
 * @Author PercyG
 * @Since 2019/3/9
 * Description:
 * Modified:
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> findAllUser(){
        return userRepository.findAll();
    }

    public User findUserById(Long id) {
        return userRepository.getOne(id);
    }

    @Override
    public Long saveUser(User user) {
        User saveUser = userRepository.save(user);
        return saveUser.getId();
    }

    @Override
    public Long updateUser(User user) {
        User saveUser = userRepository.save(user);
        return saveUser.getId();
    }

    @Override
    public Long deleteUser(Long id) {
        userRepository.deleteById(id);
        return id;
    }
    
}
