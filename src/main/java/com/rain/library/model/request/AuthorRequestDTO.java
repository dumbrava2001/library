package com.rain.library.model.request;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AuthorRequestDTO {

    @NotBlank
    String authorName;

    @NotBlank
    String authorLastName;
}
