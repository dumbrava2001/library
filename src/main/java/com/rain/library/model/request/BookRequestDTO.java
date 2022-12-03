package com.rain.library.model.request;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookRequestDTO {

    @NotBlank
    private String title;

    @NotBlank
    private String authorName;

    @NotBlank
    private String authorLast;

    @NotBlank
    private String type;

    @NotBlank
    private int year;
}
