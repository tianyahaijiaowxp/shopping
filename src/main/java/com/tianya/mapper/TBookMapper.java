package com.tianya.mapper;

import com.tianya.eneity.TBook;

import java.util.List;

public interface TBookMapper {

    List<TBook> selectAll();

    TBook selectBookById(Integer id);

    TBook selectBookByPrimaryKey();
}
