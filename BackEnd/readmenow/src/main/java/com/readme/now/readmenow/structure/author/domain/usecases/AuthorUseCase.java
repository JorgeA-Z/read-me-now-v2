package com.readme.now.readmenow.structure.author.domain.usecases;

import com.readme.now.readmenow.structure.author.application.input.ManagingAuthors;
import com.readme.now.readmenow.structure.author.application.output.Authors;
import com.readme.now.readmenow.structure.author.infrastructure.adapter.input.request.AuthorRequestCreate;
import com.readme.now.readmenow.structure.author.infrastructure.adapter.input.request.AuthorRequestUpdate;
import com.readme.now.readmenow.structure.author.infrastructure.adapter.input.response.AuthorResponse;
import com.readme.now.readmenow.structure.author.infrastructure.adapter.output.entity.Author;
import com.readme.now.readmenow.structure.author.infrastructure.adapter.output.mapper.AuthorMapper;
import com.readme.now.readmenow.util.DataPageResponse;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;

@AllArgsConstructor
public class AuthorUseCase implements ManagingAuthors {
    private final Authors authors;
    private final AuthorMapper authorMapper;
    @Override
    public DataPageResponse getAll(Integer pageNumber, Integer pageSize, Boolean active) {
        Page<Author> authorList = authors.findAll(pageNumber, pageSize, active);
        Page<AuthorResponse> authorResponsePage = authorMapper.toResponse(authorList);
        return DataPageResponse.createDataPaging(authorResponsePage);
    }

    @Override
    public AuthorResponse create(AuthorRequestCreate requestCreate) {
        return null;
    }

    @Override
    public AuthorResponse findById(Integer integer) {
        return null;
    }

    @Override
    public AuthorResponse update(Integer integer, AuthorRequestUpdate requestUpdate) {
        return null;
    }

    @Override
    public void deleteById(Integer integer) {

    }
}
