package com.readme.now.readmenow.structure.book.infrastructure.adapter.input.request;

import java.io.Serializable;

public record BookRequestCreate(
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
