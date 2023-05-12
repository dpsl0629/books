package com.yewon.books.repository;

import com.yewon.books.entity.BooksInfo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.stream.IntStream;

@SpringBootTest
public class BooksRepositoryTests {

    @Autowired
    private BooksRepository booksRepository;

    @Test
    public void insert() {
        IntStream.rangeClosed(1, 100).forEach(i -> {
            BooksInfo booksInfo = BooksInfo.builder()
                    .bno((long) i)
                    .title("test" + i)
                    .author("author" + i)
                    .iso("iso" + i)
                    .publisher("publisher" + i)
                    .build();

            booksRepository.save(booksInfo);
        });
    }
}
