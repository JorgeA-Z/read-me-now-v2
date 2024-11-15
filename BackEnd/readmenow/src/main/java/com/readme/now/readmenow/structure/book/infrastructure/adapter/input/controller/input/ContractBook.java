package com.readme.now.readmenow.structure.book.infrastructure.adapter.input.controller.input;

import com.readme.now.readmenow.structure.book.infrastructure.adapter.input.request.BookRequestCreate;
import com.readme.now.readmenow.structure.book.infrastructure.adapter.input.request.BookRequestUpdate;
import com.readme.now.readmenow.structure.book.infrastructure.adapter.input.response.BookResponse;
import com.readme.now.readmenow.util.interfaces.Controller;

public interface ContractBook extends Controller <BookResponse, Integer, BookRequestCreate, BookRequestUpdate>{
}
