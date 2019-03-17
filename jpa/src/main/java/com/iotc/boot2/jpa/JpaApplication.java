package com.iotc.boot2.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// 使用spring initializer ，勾选 (lombok), web(web), sql(jpa) 实现路由功能,jpa数据查询
// 然后还手动加了一个mysql-connect
// 需要编辑application.properties来增加数据库的配置
@SpringBootApplication
public class JpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaApplication.class, args);
	}

}
