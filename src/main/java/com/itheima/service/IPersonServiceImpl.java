package com.itheima.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.itheima.dao.PersonDao;
import com.itheima.domain.Person;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

@Service
public class IPersonServiceImpl extends ServiceImpl<PersonDao, Person> implements IPersonService{
}
