package com.bupt317.miniot;

import com.bupt317.miniot.dao.TestUserDao;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Create by 菲尼莫斯 on 2019/5/15
 * Email: cyhkkha@gmail.com
 * File name: TestUserDaoTest
 * Program : miniot
 * Description :
 */
public class TestUserDaoTest extends MiniotApplicationTests {
    @Autowired
    TestUserDao testUserDao;
    
    @Test
    public void testGetByName() {
        var user = testUserDao.getUserByName("小明");
        Assert.assertNotNull("未查询到小明", user);
        System.out.println(user);
    }
}
