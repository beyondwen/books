package com.wenhao.books.controller;


import com.github.pagehelper.PageInfo;
import com.wenhao.books.domain.BookType;
import com.wenhao.books.service.BookTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class BookTypeController {

    @Autowired
    private BookTypeService bookTypeService;

    //列表查询
    @GetMapping("/typelist")
    public ModelAndView list(BookType bookType) {
        ModelAndView model = new ModelAndView("typelist");
        System.out.println(bookType.getPage());
        List<BookType> bookTypes = bookTypeService.getAllByWeekend(bookType);
        model.addObject("pageInfo", new PageInfo<>(bookTypes));
        model.addObject("queryParam", bookTypes);
        model.addObject("page", bookType.getPage());
        model.addObject("rows", bookType.getRows());
        return model;
    }

}
