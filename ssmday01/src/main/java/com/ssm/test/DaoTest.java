package com.ssm.test;

import com.ssm.dao.UserDao;
import com.ssm.po.User;
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
}
