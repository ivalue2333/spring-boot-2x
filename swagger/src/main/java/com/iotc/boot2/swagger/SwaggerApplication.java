package com.iotc.boot2.swagger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// 使用spring initializer ，勾选 (lombok), web(web), sql(jpa) 实现路由功能,jpa数据查询
// 然后还手动加了一个mysql-connect
// 需要编辑application.properties来增加数据库的配置

// 手动增加swagger然后，新建配置文件 /config/Swagger2Config
// 访问这个路径 http://localhost:8080/swagger-ui.html
@SpringBootApplication
public class SwaggerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwaggerApplication.class, args);
	}

}
