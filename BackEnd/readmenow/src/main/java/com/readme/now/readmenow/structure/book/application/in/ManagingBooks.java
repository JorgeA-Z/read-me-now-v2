package com.readme.now.readmenow.structure.book.application.in;

import com.readme.now.readmenow.structure.book.infrastructure.adapter.in.request.BookRequestCreate;
import com.readme.now.readmenow.structure.book.infrastructure.adapter.in.request.BookRequestUpdate;
import com.readme.now.readmenow.structure.book.infrastructure.adapter.in.response.BookResponse;
import com.readme.now.readmenow.util.interfaces.Managing;

public interface ManagingBooks extends Managing<BookResponse, Integer, BookRequestCreate, BookRequestUpdate> {
}
