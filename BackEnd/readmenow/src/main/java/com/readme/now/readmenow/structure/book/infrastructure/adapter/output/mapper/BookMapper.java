package com.readme.now.readmenow.structure.book.infrastructure.adapter.output.mapper;

import com.readme.now.readmenow.structure.book.infrastructure.adapter.input.request.BookRequestCreate;
import com.readme.now.readmenow.structure.book.infrastructure.adapter.input.request.BookRequestUpdate;
import com.readme.now.readmenow.structure.book.infrastructure.adapter.input.response.BookResponse;
import com.readme.now.readmenow.structure.book.infrastructure.adapter.output.entity.Book;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;

import java.util.List;
import java.util.stream.Collectors;

@Mapper(componentModel = "spring")
public interface BookMapper {
    BookMapper INSTANCE = Mappers.getMapper(BookMapper.class);

    BookResponse toResponse(Book book);

    @Mapping(source = "authorId", target = "author.authorId")
    Book toEntity(BookRequestCreate bookRequestCreate);

    @Mapping(source = "authorId", target = "author.authorId")
    Book toEntity(BookRequestUpdate bookRequestUpdate);

    void updateBookFromRequest(BookRequestUpdate bookRequestUpdate, @MappingTarget Book book);


    default Page<BookResponse> toResponse(Page<Book> page) {
        List<BookResponse> response = page.getContent().stream()
                .map(this::toResponse)
                .collect(Collectors.toList());
        return new PageImpl<>(response, page.getPageable(), page.getTotalElements());
    }
}
