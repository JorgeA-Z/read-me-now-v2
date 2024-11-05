package com.readme.now.readmenow.structure.author.domain.usecases;

import com.readme.now.readmenow.structure.author.application.in.ManagingAuthors;
import com.readme.now.readmenow.structure.author.application.out.Authors;
import com.readme.now.readmenow.structure.author.infrastructure.adapter.in.request.AuthorRequestCreate;
import com.readme.now.readmenow.structure.author.infrastructure.adapter.in.request.AuthorRequestUpdate;
import com.readme.now.readmenow.structure.author.infrastructure.adapter.in.response.AuthorResponse;
import com.readme.now.readmenow.structure.author.infrastructure.adapter.out.entity.Author;
import com.readme.now.readmenow.structure.author.infrastructure.adapter.out.mapper.AuthorMapper;
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
