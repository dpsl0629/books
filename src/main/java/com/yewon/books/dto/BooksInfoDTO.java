package com.yewon.books.dto;

import lombok.*;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
@Setter
@Builder
public class BooksInfoDTO {

    private Long bno;

    private String title;

    private String author;

    private String iso;

    private String publisher;

    private String imgPath;

    private LocalDateTime regDate;

    private LocalDateTime modDate;

    private int publishYear;
}
