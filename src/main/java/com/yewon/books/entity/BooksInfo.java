package com.yewon.books.entity;

import lombok.*;

import javax.persistence.*;

@Getter
@ToString
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "books_info")
public class BooksInfo extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bno;

    private String title;

    private String author;

    private String iso;

    private String publisher;
}
