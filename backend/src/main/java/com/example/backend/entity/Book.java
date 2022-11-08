package com.example.backend.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bookId;
    private Long userId;
    private String bookName;
    private Long quantityOfBooks;
    private Double cost;
    private String author;
    private String bookDesc;
    private String image;

}
