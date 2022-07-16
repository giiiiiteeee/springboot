package com.itheima.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.itheima.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BookServiceTest {
    @Autowired(required = true)
    private BookService bookService;

    @Test
    void testGetById(){
        System.out.println(bookService.selectById(1));
    }

    @Test
    void testSave(){
        Book book = new Book();
        book.setId(4);
        book.setType("测试");
        book.setName("测试");
        book.setDescription("测试");
        bookService.save(book);
    }

    @Test
    void testUpdate(){
        Book book = new Book();
        book.setId(11);
        book.setType("测试1");
        book.setName("测试1");
        book.setDescription("测试1");
        bookService.update(book);
    }

    @Test
    void testDelete(){
        bookService.delete(14);
    }

    @Test
    void testGetAll(){
        bookService.SelectAll();
    }

    @Test
    void testGetPage(){
        IPage<Book> page = new Page<Book>(2,5);

        System.out.println(page.getCurrent());
        System.out.println(page.getSize());
        System.out.println(page.getTotal());
        System.out.println(page.getPages());
        System.out.println(page.getRecords());
    }
}

