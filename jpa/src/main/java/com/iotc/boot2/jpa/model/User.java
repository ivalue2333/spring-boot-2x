package com.iotc.boot2.jpa.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created By Intellij IDEA
 *
 * @Author PercyG
 * @Since 2019/3/7
 * Description:
 * Modified:
 */
@Data
@Entity

// The problem is that entities are loaded lazily and serialization happens before they get loaded fully.
// 不加这句无法返回单个对象，因为对象是懒加载的，加了这句话就是在让java在通过反射将对象
// 转换为json的过程中，忽略这两个特性，其中一个特性就是懒加载
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class User implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    private Long id;
    @Column(nullable = false, unique = true)
    private String userName;
    @Column(nullable = false)
    private String passWord;
    @Column(nullable = true, unique = true)
    private String email;
    @Column(nullable = true, unique = true)
    private String nickName;
    @Column(nullable = true)
    private String regTime;
    @Column(nullable = true)
    private int age;
}
