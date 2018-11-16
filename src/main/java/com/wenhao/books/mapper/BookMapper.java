package com.wenhao.books.mapper;

import com.wenhao.books.domain.Book;
import com.wenhao.books.util.MyMapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface BookMapper extends MyMapper<Book> {

    @Select("select * from book limit 1")
    Book findOne();
}
