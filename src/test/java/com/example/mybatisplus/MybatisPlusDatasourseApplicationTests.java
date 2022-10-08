package com.example.mybatisplus;

import com.example.mybatisplus.mapper.UserMapper;
import com.example.mybatisplus.service.ProductService;
import com.example.mybatisplus.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MybatisPlusDatasourseApplicationTests {

    @Test
    void contextLoads() {
    }

    @Autowired
    UserService userService;

    @Autowired
    ProductService productService;

    @Test
    public void test(){
        System.out.println(userService.getById(1));
        System.out.println(productService.getById(1));
    }

}
