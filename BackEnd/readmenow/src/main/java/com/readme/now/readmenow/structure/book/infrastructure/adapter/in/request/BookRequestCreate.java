package com.readme.now.readmenow.structure.book.infrastructure.adapter.in.request;
import com.readme.now.readmenow.structure.author.infrastructure.adapter.out.entity.Author;

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
