package com.seiha.Book_CRUD.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Home {

    @GetMapping
    public String getHomePage(){
       return "home_page";
    }

}
