package com.yewon.books.dto;

import lombok.*;

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
}
