package com.example.zksdkdemo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ZksdkDemoApplicationTests {

    @Test
    public void contextLoads() {
        String property = System.getProperty("java.library.path");
        System.out.println("property = " + property);
    }

}
