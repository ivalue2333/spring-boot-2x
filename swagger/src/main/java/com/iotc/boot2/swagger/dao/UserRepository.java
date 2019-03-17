package com.iotc.boot2.swagger.dao;

import com.iotc.boot2.swagger.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created By Intellij IDEA
 *
 * @Author PercyG
 * @Since 2019/3/7
 * Description:
 * Modified:
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
