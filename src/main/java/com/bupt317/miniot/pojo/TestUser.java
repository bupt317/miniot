package com.bupt317.miniot.pojo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Create by 菲尼莫斯 on 2019/5/15
 * Email: cyhkkha@gmail.com
 * File name: TestUser
 * Program : miniot
 * Description :
 */
@Document(collection = "user")
public class TestUser {
    @Id
    private String id;
    private String name;
    private short sex;
    private String password;
    private String email;
    private int coin;
    private String key;

    @Override
    public String toString() {
        return String.format("%s，%s，%d", id, name, coin );
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public short getSex() {
        return sex;
    }

    public void setSex(short sex) {
        this.sex = sex;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCoin() {
        return coin;
    }

    public void setCoin(int coin) {
        this.coin = coin;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
