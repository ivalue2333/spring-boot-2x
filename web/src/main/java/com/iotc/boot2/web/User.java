package com.iotc.boot2.web;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created By Intellij IDEA
 *
 * @Author PercyG
 * @Since 2019/3/17
 * Description:
 * Modified:
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class User {
    private Long id;
    private String userName;
    private String passWord;
    private String email;
    private String nickName;
    private String regTime;
    private int age;
}
