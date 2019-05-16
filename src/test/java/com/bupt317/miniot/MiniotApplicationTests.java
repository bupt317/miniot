package com.bupt317.miniot;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MiniotApplicationTests {

    @Before
    public void before() {
        System.out.println("--------测试开始---------");
    }
    
	@Test
	public void contextLoads() {
	}

}
