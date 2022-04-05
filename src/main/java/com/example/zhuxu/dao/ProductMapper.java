package com.example.zhuxu.dao;

import com.example.zhuxu.dto.Product;
import org.apache.ibatis.annotations.*;

import java.util.List;
@Mapper
public interface ProductMapper {
    @Select("SELECT ID,PRODUCTNAME,PRODUCTPRICE,COMMENT FROM PRODUCT")
    public List<Product> queryStudentList();

    @Select("SELECT ID,PRODUCTNAME,PRODUCTPRICE,COMMENT FROM PRODUCT WHERE ID = #{ID}")
    public Product selectProductById(Integer id);

    @Insert("INSERT into PRODUCT(ID,productName,productPrice,comment) values(#{id},#{productName},#{productPrice},#{comment})")
    public Integer add(Product product);

    @Update("update PRODUCT set PRODUCTNAME=#{PRODUCTNAME}, PRODUCTPRICE=#{PRODUCTPRICE},COMMENT=#{COMMENT} where id= #{id}")
    public Integer update(Integer id);



    @Delete("delete PRODUCT where id =#{id}")
    public Integer delete(Integer id);
}
