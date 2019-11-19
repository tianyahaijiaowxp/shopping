package com.tianya.service.impl;

import com.tianya.eneity.TBook;
import com.tianya.mapper.TBookMapper;
import com.tianya.service.TBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TBookServiceImpl implements TBookService {

    @Autowired
    private TBookMapper bookMapper;
    @Override
    public List<TBook> findAll() {

        return bookMapper.selectAll();
    }

    public TBook findBookById(Integer id){

        return bookMapper.selectBookById(id);
    }
}
