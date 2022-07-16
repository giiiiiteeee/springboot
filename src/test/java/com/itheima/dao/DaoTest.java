package com.itheima.dao;

import com.baomidou.mybatisplus.core.assist.ISqlRunner;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.conditions.query.LambdaQueryChainWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.itheima.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class DaoTest {
    @Autowired
    private BookDao bookDao;

    @Test
    void insert(){
        Book book = new Book();
        book.setId(2);
        book.setDescription("fdjsfgeg");
        book.setName("java");
        book.setType("fdjsdg");
        bookDao.insert(book);
    }

    @Test
    void get(){
        System.out.println(bookDao.selectById(1));
    }

    @Test
    void findAll(){
        bookDao.selectList(null);
    }
    @Test
    void page(){
        IPage page = new Page(1,2);
        bookDao.selectPage(page,null);

    }

    @Test
    void ByCondition1(){
        String name = "j";
        LambdaQueryWrapper<Book> lqw = new LambdaQueryWrapper<>();
        lqw.like(name != null, Book::getName,name);
        bookDao.selectList(lqw);
    }

}
