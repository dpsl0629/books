package com.yewon.books.service;

import com.yewon.books.dto.BooksInfoDTO;
import com.yewon.books.dto.PageRequestDTO;
import com.yewon.books.dto.PageResultDTO;
import com.yewon.books.entity.BooksInfo;
import org.springframework.data.domain.Pageable;

public interface BooksService {

    default BooksInfoDTO entityToDTO(BooksInfo booksInfo) {
        BooksInfoDTO booksInfoDTO = BooksInfoDTO.builder()
                .bno(booksInfo.getBno())
                .title(booksInfo.getTitle())
                .author(booksInfo.getAuthor())
                .imgPath(booksInfo.getImgPath())
                .iso(booksInfo.getIso())
                .publisher(booksInfo.getPublisher())
                .regDate(booksInfo.getRegDate())
                .modDate(booksInfo.getModDate())
                .publishYear(booksInfo.getPublishYear())
                .build();
        return booksInfoDTO;
    }

    default BooksInfo dtoToEntity(BooksInfoDTO booksInfoDTO) {
        BooksInfo booksInfo = BooksInfo.builder()
                .bno(booksInfoDTO.getBno())
                .title(booksInfoDTO.getTitle())
                .author(booksInfoDTO.getAuthor())
                .imgPath(booksInfoDTO.getImgPath())
                .publisher(booksInfoDTO.getPublisher())
                .iso(booksInfoDTO.getIso())
                .build();
        return booksInfo;
    }

    PageResultDTO<BooksInfoDTO, BooksInfo> getList(PageRequestDTO requestDTO);
}
