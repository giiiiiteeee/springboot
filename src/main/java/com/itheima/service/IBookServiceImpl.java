package com.itheima.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.itheima.dao.BookDao;
import com.itheima.domain.Book;
import com.itheima.service.IBookService;
import org.springframework.stereotype.Service;
@Service
public class IBookServiceImpl extends ServiceImpl<BookDao, Book> implements IBookService {
}

