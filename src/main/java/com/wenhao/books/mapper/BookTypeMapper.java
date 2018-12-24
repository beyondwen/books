package com.wenhao.books.mapper;

import com.wenhao.books.domain.BookType;
import com.wenhao.books.util.MyMapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface BookTypeMapper extends MyMapper<BookType> {

    @Select("select * from booktype limit 1")
    BookType findOne();
}
