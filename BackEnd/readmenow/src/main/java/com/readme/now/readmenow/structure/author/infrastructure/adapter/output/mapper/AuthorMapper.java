package com.readme.now.readmenow.structure.author.infrastructure.adapter.output.mapper;

import com.readme.now.readmenow.structure.author.infrastructure.adapter.input.request.AuthorRequestCreate;
import com.readme.now.readmenow.structure.author.infrastructure.adapter.input.request.AuthorRequestUpdate;
import com.readme.now.readmenow.structure.author.infrastructure.adapter.input.response.AuthorResponse;
import com.readme.now.readmenow.structure.author.infrastructure.adapter.output.entity.Author;
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
