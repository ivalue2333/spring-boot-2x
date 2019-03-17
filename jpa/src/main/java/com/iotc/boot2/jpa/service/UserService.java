package com.iotc.boot2.jpa.service;


import com.iotc.boot2.jpa.model.User;

import java.util.List;

/**
 * Created By Intellij IDEA
 *
 * @Author PercyG
 * @Since 2019/3/9
 * Description:
 * Modified:
 */
public interface UserService {
    List<User> findAllUser();

    User findUserById(Long id);

    Long saveUser(User user);

    Long updateUser(User user);

    Long deleteUser(Long id);
}
