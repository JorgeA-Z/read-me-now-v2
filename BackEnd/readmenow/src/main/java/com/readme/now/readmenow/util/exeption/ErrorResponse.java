package com.readme.now.readmenow.util.exeption;

import org.springframework.http.HttpStatus;

import java.io.Serializable;

public record ErrorResponse(
        HttpStatus status,
        String result,
        String code,
        String description
) implements Serializable {
}
