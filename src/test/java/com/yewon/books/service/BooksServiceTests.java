package com.yewon.books.service;

import com.yewon.books.dto.BooksInfoDTO;
import com.yewon.books.dto.PageRequestDTO;
import com.yewon.books.dto.PageResultDTO;
import com.yewon.books.entity.BooksInfo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Sort;

@SpringBootTest
public class BooksServiceTests {

    @Autowired
    private BooksService booksService;

    @Test
    public void testList() {
        PageRequestDTO pageRequestDTO = PageRequestDTO.builder().page(1).size(10).build();

        PageResultDTO<BooksInfoDTO, BooksInfo> result = booksService.getList(pageRequestDTO);

        System.out.println("prev" + result.isPrev());
        System.out.println("next" + result.isNext());
        System.out.println("totalPage " + result.getTotalPage());

        System.out.println("-------------------------");
        for (BooksInfoDTO booksInfoDTO : result.getDtoList()) {
            System.out.println(booksInfoDTO);
        }

        System.out.println("--------------------------");
        result.getPageList().forEach(i -> System.out.println(i));
    }
}
