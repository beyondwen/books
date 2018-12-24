package com.wenhao.books.service;

import com.github.pagehelper.PageHelper;
import com.wenhao.books.domain.BookType;
import com.wenhao.books.mapper.BookTypeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.weekend.Weekend;
import tk.mybatis.mapper.weekend.WeekendCriteria;

import java.util.List;

@Service
public class BookTypeService {

    @Autowired
    private BookTypeMapper bookTypeMapper;

    public List<BookType> getAllByWeekend(BookType bookType) {
        if (bookType.getPage() != null && bookType.getRows() != null) {
            PageHelper.startPage(bookType.getPage(), bookType.getRows());
        }
        Weekend<BookType> weekend = Weekend.of(BookType.class);
        WeekendCriteria<BookType, Object> criteria = weekend.weekendCriteria();
        if (bookType.getbName() != null && bookType.getbName().length() > 0) {
            criteria.andLike("bName", "%" + bookType.getbName() + "%");
        }
        criteria.andEqualTo("bSaveState","4");
        criteria.andEqualTo("bType","201607");
//        criteria.andIsNotNull(Book::getDetailUrl);
        return bookTypeMapper.selectByExample(weekend);
    }
}
