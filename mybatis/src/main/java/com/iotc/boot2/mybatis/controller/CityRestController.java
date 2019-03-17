package com.iotc.boot2.mybatis.controller;

import com.iotc.boot2.mybatis.dao.CityMapper;
import com.iotc.boot2.mybatis.model.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created By Intellij IDEA
 *
 * @Author PercyG
 * @Since 2019/3/9
 * Description:
 * Modified:
 */
@RestController
@RequestMapping(value="/citys")
public class CityRestController {

    @Autowired
    CityMapper cityMapper;

    @RequestMapping(value="/", method= RequestMethod.GET)
    public City getCityList() {
        List<City> cities = new ArrayList<>();
        City city = cityMapper.selectByPrimaryKey(3);
        cities.add(cityMapper.selectByPrimaryKey(3));
        return city;
    }

    public Integer postCity(@ModelAttribute City city) {
        int insert = cityMapper.insert(city);
        return insert;
    }
}
