package com.rain.library.model.entity;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "authors")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "author_id")
    int id;

    @Column(name = "author_name")
    String name;

    @Column(name = "author_lastname")
    String lastName;

    @OneToMany(cascade = {CascadeType.REMOVE, CascadeType.PERSIST}, mappedBy = "author")
    List<Book> bookList;
}
