package com.example.zhuxu.service;

import com.example.zhuxu.controller.ProductController;
import com.example.zhuxu.dao.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductController productController;

    public void selectProductInfo(){
        productController.list();
    }


}
