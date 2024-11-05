package com.readme.now.readmenow.structure.author.infrastructure.adapter.in.response;


import java.io.Serializable;
import java.time.LocalDateTime;

public record AuthorResponse(
        Integer authorId,
        String about,
        String name,
        String lastname,
        LocalDateTime createdAt,
        LocalDateTime updatedAt
) implements Serializable { }
