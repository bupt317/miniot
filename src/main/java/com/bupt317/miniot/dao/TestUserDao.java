package com.bupt317.miniot.dao;

import com.bupt317.miniot.pojo.TestUser;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * Create by 菲尼莫斯 on 2019/5/15
 * Email: cyhkkha@gmail.com
 * File name: TestUserDao
 * Program : miniot
 * Description :
 */

@Repository
public class TestUserDao {
    
    @Resource
    private MongoTemplate mongoTemplate;
    
    public TestUser getUserByName(String name) {
        return mongoTemplate.findOne( Query.query(Criteria.where("name").is(name)) , TestUser.class);
    }
}
