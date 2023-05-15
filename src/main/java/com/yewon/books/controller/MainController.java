package com.yewon.books.controller;

import com.yewon.books.dto.BooksInfoDTO;
import com.yewon.books.dto.PageRequestDTO;
import com.yewon.books.service.BooksService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/books")
@Log4j2
@Controller
@RequiredArgsConstructor
public class MainController {

    private final BooksService booksService;

    @GetMapping("/index")
    public void main(PageRequestDTO pageRequestDTO, Model model) throws Exception {
        log.info("index" + pageRequestDTO);
        model.addAttribute("result", booksService.getList(pageRequestDTO));
    }
}