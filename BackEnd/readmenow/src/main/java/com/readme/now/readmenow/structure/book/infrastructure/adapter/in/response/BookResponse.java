package com.readme.now.readmenow.structure.book.infrastructure.adapter.in.response;

import com.readme.now.readmenow.structure.author.infrastructure.adapter.in.response.AuthorResponse;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.LocalTime;

public record BookResponse(
        Integer bookId,
        String about,
        AuthorResponse author,
        String cover,
        String genre,
        String subGenre,
        String name,
        String url,
        Long likes,
        LocalTime readGlobalTime,
        LocalDateTime createdAt,
        LocalDateTime updatedAt,
        Boolean isActive
        )  implements Serializable { }
