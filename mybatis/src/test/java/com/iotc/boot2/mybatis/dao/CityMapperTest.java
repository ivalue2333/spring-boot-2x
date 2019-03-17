package com.iotc.boot2.mybatis.dao;
import com.iotc.boot2.mybatis.model.City;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created By Intellij IDEA
 *
 * @Author PercyG
 * @Since 2019/3/17
 * Description:
 * Modified:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class CityMapperTest {

    @Autowired
    CityMapper cityMapper;

    @Test
    public void deleteByPrimaryKey() {
    }

    @Test
    public void insert() {
    }

    @Test
    public void insertSelective() {
    }

    @Test
    public void selectByPrimaryKey() {
        City city = cityMapper.selectByPrimaryKey(3);
        System.out.println(city);

    }

    @Test
    public void updateByPrimaryKeySelective() {
    }

    @Test
    public void updateByPrimaryKey() {
    }

    @Test
    public void findByName() {
        System.out.println(cityMapper.findByName("hangzhou"));
    }

    @Test
    public void selectAll() {
        for (City city: cityMapper.selectAll()) {
            System.out.println(city.getName());
        }
    }
}