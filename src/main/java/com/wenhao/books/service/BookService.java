package com.wenhao.books.service;

import com.github.pagehelper.PageHelper;
import com.wenhao.books.domain.Book;
import com.wenhao.books.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.weekend.Weekend;
import tk.mybatis.mapper.weekend.WeekendCriteria;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookMapper bookMapper;

    public List<Book> getAllByWeekend(Book book) {
        if (book.getPage() != null && book.getRows() != null) {
            PageHelper.startPage(book.getPage(), book.getRows());
        }
        Weekend<Book> weekend = Weekend.of(Book.class);
        WeekendCriteria<Book, Object> criteria = weekend.weekendCriteria();
        if (book.getName() != null && book.getName().length() > 0) {
            criteria.andLike(Book::getName, "%" + book.getName() + "%");
        }
        criteria.andEqualTo(Book::getSaveState,0);
//        criteria.andIsNotNull(Book::getDetailUrl);
        return bookMapper.selectByExample(weekend);
    }
}
