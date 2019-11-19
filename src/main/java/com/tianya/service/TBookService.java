package com.tianya.service;

import com.tianya.eneity.TBook;

import java.util.List;

public interface TBookService {

    List<TBook> findAll();

    TBook findBookById(Integer id);
}
