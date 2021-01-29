package com.ayrossi.booklibrary.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String bookName;

    private String author;

    private String owner;

    @Column(name = "LANG")
    @Enumerated(EnumType.STRING)
    private Language language;


}
