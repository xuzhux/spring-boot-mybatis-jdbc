package com.example.test;

import com.example.zhuxu.service.ProductService;
import com.example.zhuxu.dao.ProductMapper;
import com.example.zhuxu.dto.Product;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
@SpringBootConfiguration
@SpringBootApplication(scanBasePackages = "com.example")
@ComponentScan("com.example.zhuxu")
@MapperScan("com.example.zhuxu")
public class JdbcTest {
//     @Autowired
//     private UserDao userDao;
//    @Autowired
//    private Student student;
    @Autowired
    private ProductMapper productMapper;
    @Autowired
    private Product product;
    @Autowired
    private ProductService productService;
    @Test
    public void printStudent(){
       // List<Student> students = userDao.selectStudentList();
        List<Product> products = productMapper.queryStudentList();
//        for (Student s:
//                students ) {
//            System.out.println(s.toString());
//        }
        for (Product p:
                products) {
            System.out.println(p.toString());
        }

    }
}
