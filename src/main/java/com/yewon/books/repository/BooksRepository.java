package com.yewon.books.repository;

import com.yewon.books.entity.BooksInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BooksRepository extends JpaRepository<BooksInfo, Long> {
}
