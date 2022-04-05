package com.example.zhuxu.dao;


import com.example.zhuxu.dto.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@Component
public class UserDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Autowired
    Student student;
    public List<Student> selectStudentList(){
        String sql = "SELECT ID,NAME,SEX,AGE FROM STUDENT";
        List rows = jdbcTemplate.queryForList(sql);
        List<Student> students = new ArrayList<>();
        Iterator it = rows.iterator();
        while (it.hasNext()){
            Map stuMap = (Map) it.next();
            student.setId((Integer) stuMap.get("id"));
            student.setName((String) stuMap.get("name"));
            student.setSex((String) stuMap.get("sex"));
            student.setAge((Integer) stuMap.get("age"));
            students.add(student);
        }
        return students;
    }
}
