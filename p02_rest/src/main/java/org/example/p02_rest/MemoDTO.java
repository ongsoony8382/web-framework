package org.example.p02_rest;

import jakarta.validation.constraints.Size;

public record MemoDTO(
        @Size(max=45)
        String writer,
        @Size(max=500)
        String body) {}
