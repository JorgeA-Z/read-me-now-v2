package com.readme.now.readmenow.structure.book.infrastructure.adapter.in.controller.in;

import com.readme.now.readmenow.structure.book.infrastructure.adapter.in.request.BookRequestCreate;
import com.readme.now.readmenow.structure.book.infrastructure.adapter.in.request.BookRequestUpdate;
import com.readme.now.readmenow.structure.book.infrastructure.adapter.in.response.BookResponse;
import com.readme.now.readmenow.util.interfaces.Controller;

public interface ContractBook extends Controller <BookResponse, Integer, BookRequestCreate, BookRequestUpdate>{
}
