package com.iotc.boot2.jpa.controller;

import com.iotc.boot2.jpa.model.User;
import com.iotc.boot2.jpa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created By Intellij IDEA
 *
 * @Author PercyG
 * @Since 2019/3/8
 * Description:
 * Modified:
 */
@RestController
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<User> getUserList() {
        return userService.findAllUser();
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public Long postUser(@ModelAttribute User user) {
        // 处理"/users/"的POST请求，用来创建User
        // 除了@ModelAttribute绑定参数之外，还可以通过@RequestParam从页面中传递参数
        System.out.println(user);
        Long aLong = userService.saveUser(user);
        return aLong;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public User getUser(@PathVariable Long id) {
        // 处理"/users/{id}"的GET请求，用来获取url中id值的User信息
        // url中的id可通过@PathVariable绑定到函数的参数中
        User userById = userService.findUserById(id);
        System.out.println(userById.getUserName());
        return userById;
    }


    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Long putUser(@PathVariable Long id, @ModelAttribute User user) {
        // 处理"/users/{id}"的PUT请求，用来更新User信息
        Long aLong = userService.saveUser(user);
        return aLong;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Long deleteUser(@PathVariable Long id) {
        // 处理"/users/{id}"的DELETE请求，用来删除User
        Long aLong = userService.deleteUser(id);
        return aLong;
    }

}
