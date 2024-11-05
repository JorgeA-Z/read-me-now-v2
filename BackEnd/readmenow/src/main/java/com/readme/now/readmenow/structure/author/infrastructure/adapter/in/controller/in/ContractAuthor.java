package com.readme.now.readmenow.structure.author.infrastructure.adapter.in.controller.in;

import com.readme.now.readmenow.structure.author.infrastructure.adapter.in.request.AuthorRequestCreate;
import com.readme.now.readmenow.structure.author.infrastructure.adapter.in.request.AuthorRequestUpdate;
import com.readme.now.readmenow.structure.author.infrastructure.adapter.in.response.AuthorResponse;
import com.readme.now.readmenow.util.interfaces.Controller;

public interface ContractAuthor extends Controller <AuthorResponse, Integer, AuthorRequestCreate, AuthorRequestUpdate>{
}
