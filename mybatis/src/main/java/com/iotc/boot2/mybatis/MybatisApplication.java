package com.iotc.boot2.mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// 使用spring initializer ，勾选 (lombok), web(web), sql(mybatis) 实现路由功能,mybatis数据查询
// 然后还手动加了一个mysql-connect
// 需要编辑application.properties来增加数据库的配置
// 使用自动生成插件
@SpringBootApplication

// mapper 接口类扫描包配置, 不加也可以的样子
//@MapperScan("com.iotc.cupid_mybatis.dao")
public class MybatisApplication {

	public static void main(String[] args) {
		SpringApplication.run(MybatisApplication.class, args);
	}

}
