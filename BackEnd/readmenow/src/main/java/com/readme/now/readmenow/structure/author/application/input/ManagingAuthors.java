package com.readme.now.readmenow.structure.author.application.input;

import com.readme.now.readmenow.structure.author.infrastructure.adapter.input.request.AuthorRequestCreate;
import com.readme.now.readmenow.structure.author.infrastructure.adapter.input.request.AuthorRequestUpdate;
import com.readme.now.readmenow.structure.author.infrastructure.adapter.input.response.AuthorResponse;
import com.readme.now.readmenow.util.interfaces.Managing;

public interface ManagingAuthors extends Managing<AuthorResponse, Integer, AuthorRequestCreate, AuthorRequestUpdate> {
}
