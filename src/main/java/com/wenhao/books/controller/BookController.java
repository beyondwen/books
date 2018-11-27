package com.wenhao.books.controller;


import com.github.pagehelper.PageInfo;
import com.wenhao.books.domain.Book;
import com.wenhao.books.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class BookController {

    @Autowired
    private BookService bookService;

    //列表查询
    @GetMapping("/list")
    public ModelAndView list(Book book) {
        ModelAndView model = new ModelAndView("list");
        System.out.println(book.getPage());
        List<Book> books = bookService.getAllByWeekend(book);
        model.addObject("pageInfo", new PageInfo<Book>(books));
        model.addObject("queryParam", book);
        model.addObject("page", book.getPage());
        model.addObject("rows", book.getRows());
        return model;
    }

    //列表查询
    @GetMapping("/listdata")
    @ResponseBody
    public PageInfo<Book> listdata(Book book) {
        List<Book> books = bookService.getAllByWeekend(book);
        PageInfo<Book> bookPageInfo = new PageInfo<>(books);
        return bookPageInfo;
    }
}
