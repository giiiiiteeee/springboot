package com.itheima.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.itheima.domain.Book;
import com.itheima.domain.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.Executor;

@SpringBootTest
public class IBookServiceTest {
    @Autowired
    private IBookService iBookService;

    @Autowired
    private IPersonService iPersonService;
    @Test
    void save() throws SQLException {
        Book b=new Book();
        b.setId(7);
        b.setType("文学");
        b.setName("白鹿原");
        b.setDescription("好看");
        Person p = new Person();
        p.setId(5);
        p.setName("史玉柱");
        iPersonService.save(p);

//        QueryWrapper<Person> queryWrapper= new QueryWrapper<>();
//        queryWrapper.eq("id", 5);
        iPersonService.removeById(5);    // 删

        iBookService.save(b);
    }
    @Test
    void update(){
        Book b=new Book();
        b.setId(15);
        b.setType("文学");
        b.setName("白鹿原");
        b.setDescription("666");
        iBookService.updateById(b);
    }
    @Test
    void delete(){
        iBookService.removeById(15);
    }
    @Test
    void findById(){
        System.out.println(iBookService.getById(1));

    }
    @Test
    void findAll(){
        iBookService.list();
    }
    @Test
    void page(){
        IPage<Book> page = new Page<Book>(2,5);
        iBookService.page(page);
        System.out.println(page.getCurrent());
        System.out.println(page.getSize());
        System.out.println(page.getTotal());
        System.out.println(page.getPages());
        System.out.println(page.getRecords());

    }
}

