package com.ssm.test;

import com.ssm.dao.UserDao;
import com.ssm.mapper.UserMapper;
import com.ssm.po.User;
import com.ssm.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DaoTest {
    @Test
    public void findUserByIdDaoTest(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");

        UserDao userDao = (UserDao) ac.getBean("userDao");
        User user = userDao.findUserById(1);
        System.out.println(user);
    }

    @Test
    public void findUserByIdMapperTest(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");

        UserMapper userMapper = ac.getBean(UserMapper.class);
        User user = userMapper.findUserById(1);
        System.out.println(user);
    }

    @Test
    public void addUserTest(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");

        UserService userService = ac.getBean(UserService.class);
        User user = new User();
        user.setUsername("了不起");
        user.setAge("10");
        userService.addUser(user);
    }
}
