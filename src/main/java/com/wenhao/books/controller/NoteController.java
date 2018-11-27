package com.wenhao.books.controller;


import com.github.pagehelper.PageInfo;
import com.wenhao.books.domain.Book;
import com.wenhao.books.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("note")
public class NoteController {

    //列表查询
    @GetMapping("/add")
    public String list() {
        return "note/add";
    }
}
