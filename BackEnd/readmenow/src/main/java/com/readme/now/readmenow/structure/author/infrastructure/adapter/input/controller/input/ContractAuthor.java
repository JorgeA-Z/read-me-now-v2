package com.readme.now.readmenow.structure.author.infrastructure.adapter.input.controller.input;

import com.readme.now.readmenow.structure.author.infrastructure.adapter.input.request.AuthorRequestCreate;
import com.readme.now.readmenow.structure.author.infrastructure.adapter.input.request.AuthorRequestUpdate;
import com.readme.now.readmenow.structure.author.infrastructure.adapter.input.response.AuthorResponse;
import com.readme.now.readmenow.util.interfaces.Controller;

public interface ContractAuthor extends Controller <AuthorResponse, Integer, AuthorRequestCreate, AuthorRequestUpdate>{
}
