package com.readme.now.readmenow.structure.book.domain.usecases;

import com.readme.now.readmenow.structure.author.application.output.Authors;
import com.readme.now.readmenow.structure.author.infrastructure.adapter.output.entity.Author;
import com.readme.now.readmenow.structure.book.application.in.ManagingBooks;
import com.readme.now.readmenow.structure.book.application.out.Books;
import com.readme.now.readmenow.structure.book.infrastructure.adapter.input.request.BookRequestCreate;
import com.readme.now.readmenow.structure.book.infrastructure.adapter.input.request.BookRequestUpdate;
import com.readme.now.readmenow.structure.book.infrastructure.adapter.input.response.BookResponse;
import com.readme.now.readmenow.structure.book.infrastructure.adapter.output.entity.Book;
import com.readme.now.readmenow.structure.book.infrastructure.adapter.output.mapper.BookMapper;
import com.readme.now.readmenow.util.DataPageResponse;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;

@AllArgsConstructor
public class BookUseCase implements ManagingBooks {
    private final Books books;
    private final Authors authors;
    private final BookMapper bookMapper;
    @Override
    public DataPageResponse getAll(Integer pageNumber, Integer pageSize, Boolean active) {
        Page<Book> bookList = books.findAll(pageNumber, pageSize, active);
        Page<BookResponse> bookResponsePage = bookMapper.toResponse(bookList);
        return DataPageResponse.createDataPaging(bookResponsePage);
    }

    @Override
    public BookResponse create(BookRequestCreate bookRequestCreate) {
        Book bookCreate = bookMapper.toEntity(bookRequestCreate);
        Book bookCreated = books.create(bookCreate);
        return bookMapper.toResponse(bookCreated);
    }

    @Override
    public BookResponse findById(Integer bookId) {
        Book bookFound = books.findById(bookId);
        return bookMapper.toResponse(bookFound);
    }

    @Override
    public BookResponse update(Integer bookId, BookRequestUpdate bookRequestUpdate) {
        Book existingBook = books.findById(bookId);
        Author existAuthor = authors.findById(bookRequestUpdate.authorId());
        bookMapper.updateBookFromRequest(bookRequestUpdate, existingBook);
        existingBook.setAuthor(existAuthor);
        Book bookUpdated = books.update(existingBook);
        return bookMapper.toResponse(bookUpdated);
    }

    @Override
    public void deleteById(Integer bookId) {
        books.deleteById(bookId);
    }
}
