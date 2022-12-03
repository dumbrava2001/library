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
@Table(name = "types")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Type {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "type_id")
    int type_id;

    @Column(name = "type")
    String type;

    @OneToMany(cascade = {CascadeType.REMOVE, CascadeType.PERSIST}, mappedBy = "type")
    List<Book> bookList;
}
