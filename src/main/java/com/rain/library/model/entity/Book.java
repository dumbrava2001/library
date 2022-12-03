package com.rain.library.model.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Year;

@Entity
@Table(name = "books")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_id")
    int id;

    @Column(name = "book_title")
    String title;

    @ManyToOne
    @JoinColumn(name = "author_id", referencedColumnName = "author_id")
    Author author;

    @ManyToOne
    @JoinColumn(name = "type_id",referencedColumnName = "type_id")
    Type type;

    @Column(name = "book_year")
    Year year;
}
