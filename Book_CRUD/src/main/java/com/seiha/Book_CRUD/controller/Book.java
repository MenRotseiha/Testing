package com.seiha.Book_CRUD.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/books")
public class Book {
    @GetMapping
    public String getBookPage(@RequestParam(required = false,name = "login")String login,
                              @RequestParam(required = false)String email){
        System.out.println("User Login is: "+login);
        return "book_page";
    }

}
