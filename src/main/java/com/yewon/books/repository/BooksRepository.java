package com.yewon.books.repository;

import com.yewon.books.entity.BooksInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BooksRepository extends JpaRepository<BooksInfo, Long> {

    @Query("select b from BooksInfo b")
    List<BooksInfo> getList();
}
