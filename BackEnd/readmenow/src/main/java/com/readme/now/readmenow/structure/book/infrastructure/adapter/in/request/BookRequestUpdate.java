package com.readme.now.readmenow.structure.book.infrastructure.adapter.in.request;

import java.io.Serializable;

public record BookRequestUpdate(
        String about,
        Integer authorId,
        String cover,
        String genre,
        String subGenre,
        String name,
        String url,
        Long likes,
        Boolean isActive
) implements Serializable { }
