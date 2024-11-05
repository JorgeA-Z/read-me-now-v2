package com.readme.now.readmenow.structure.author.infrastructure.adapter.out.mapper;

import com.readme.now.readmenow.structure.author.infrastructure.adapter.in.request.AuthorRequestCreate;
import com.readme.now.readmenow.structure.author.infrastructure.adapter.in.request.AuthorRequestUpdate;
import com.readme.now.readmenow.structure.author.infrastructure.adapter.in.response.AuthorResponse;
import com.readme.now.readmenow.structure.author.infrastructure.adapter.out.entity.Author;
import com.readme.now.readmenow.structure.book.infrastructure.adapter.in.response.BookResponse;
import com.readme.now.readmenow.structure.book.infrastructure.adapter.out.entity.Book;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;

import java.util.List;
import java.util.stream.Collectors;

@Mapper(componentModel = "spring")
public interface AuthorMapper {
    AuthorMapper INSTANCE = Mappers.getMapper(AuthorMapper.class);

    AuthorResponse toResponse(Author author);

    Author toEntity(AuthorRequestCreate authorRequestCreate);

    void updateAuthorFromRequest(AuthorRequestUpdate authorRequestUpdate, @MappingTarget Author author);

    default Page<AuthorResponse> toResponse(Page<Author> page) {
        List<AuthorResponse> response = page.getContent().stream()
                .map(this::toResponse)
                .collect(Collectors.toList());
        return new PageImpl<>(response, page.getPageable(), page.getTotalElements());
    }
}
