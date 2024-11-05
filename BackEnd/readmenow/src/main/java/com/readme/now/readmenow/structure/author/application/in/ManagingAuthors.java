package com.readme.now.readmenow.structure.author.application.in;

import com.readme.now.readmenow.structure.author.infrastructure.adapter.in.request.AuthorRequestCreate;
import com.readme.now.readmenow.structure.author.infrastructure.adapter.in.request.AuthorRequestUpdate;
import com.readme.now.readmenow.structure.author.infrastructure.adapter.in.response.AuthorResponse;
import com.readme.now.readmenow.util.interfaces.Managing;

public interface ManagingAuthors extends Managing<AuthorResponse, Integer, AuthorRequestCreate, AuthorRequestUpdate> {
}
