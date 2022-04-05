package com.example.zhuxu.controller;

import com.example.zhuxu.dao.ProductMapper;
import com.example.zhuxu.dto.Product;
import com.example.zhuxu.web.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {
    @Autowired
    private ProductMapper productMapper;

    @PostMapping("/soa/product/add")
    public Object add(Product product) {
        Integer re = productMapper.add(product);
        if (re == null) {
            return new Response("200", "Ok", null);

        }
        return new Response("500", "fail", null);
    }

    @GetMapping("/soa/product/{id}")
    public Object get(@PathVariable("id")Integer id) {
        Product product = productMapper.selectProductById(id);
        return product == null ?new Response("500", "fail"):new Response("200", "ok", product);

    }

    @GetMapping("/soa/products")
    public Object list() {
        return new Response("200", "ok", productMapper.queryStudentList());

    }

    @PutMapping("/soa/product/{id}")
    public Object update(@PathVariable("id") Integer id){
        Integer re = productMapper.update(id);
        return 1 == re ? new Response("200", "ok") : new Response("500", "fail");
    }

    @DeleteMapping("/soa/delete/{id}")
    public Object delete(@PathVariable("id") Integer id) {
        Integer re = productMapper.delete(id);
        return 1 == re ? new Response("200", "ok") : new Response("500", "fail");

    }

}
