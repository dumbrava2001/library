package com.rain.library.model.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BookResponseDTO {

    private String title;

    private String author;

    private String type;

    private int year;
}
