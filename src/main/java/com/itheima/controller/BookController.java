package com.itheima.controller;

import com.itheima.domain.Book;
import com.itheima.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    private BookService bookService;
    @GetMapping
    public List<Book> selectAll(){
        return bookService.SelectAll();
    }
    @PostMapping
    public Boolean save(@RequestBody Book book){
        return bookService.save(book);
    }
    @PutMapping
    public Boolean update(@RequestBody Book book){
        return bookService.update(book);
    }
    @DeleteMapping("{id}")
    public Boolean delete(@PathVariable Integer id){
        return bookService.delete(id);
    }
    @GetMapping("{id}")
    public Book selectById(@PathVariable Integer id){
        return bookService.selectById(id);
    }
}

