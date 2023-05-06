package com.yewon.books.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/books")
@Log4j2
@Controller
public class MainController {

    @GetMapping("/index")
    public void main() throws Exception {
        log.info("index");
    }
}