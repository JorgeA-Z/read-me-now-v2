package com.readme.now.readmenow.structure.book.infrastructure.adapter.input.controller.output;

import com.readme.now.readmenow.structure.book.application.in.ManagingBooks;
import com.readme.now.readmenow.structure.book.infrastructure.adapter.input.controller.input.ContractBook;
import com.readme.now.readmenow.structure.book.infrastructure.adapter.input.request.BookRequestCreate;
import com.readme.now.readmenow.structure.book.infrastructure.adapter.input.request.BookRequestUpdate;
import com.readme.now.readmenow.structure.book.infrastructure.adapter.input.response.BookResponse;
import com.readme.now.readmenow.util.DataPageResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
@RequestMapping("/api/v2/readmenow/books")
@AllArgsConstructor
public class BookController implements ContractBook {
    private final ManagingBooks managingBooks;

    @GetMapping
    @Override
    public ResponseEntity<DataPageResponse> getAll(@RequestParam(defaultValue = "0") Integer pageNumber, @RequestParam(defaultValue = "25") Integer pageSize, @RequestParam(required = false) Boolean active){
        DataPageResponse dataPageResponse = managingBooks.getAll(pageNumber, pageSize, active);
        return new ResponseEntity<>(dataPageResponse, HttpStatus.OK);
    }

    @GetMapping("/{bookId}")
    @Override
    public ResponseEntity<BookResponse> getById(@PathVariable Integer bookId){
        BookResponse bookResponse = managingBooks.findById(bookId);
        return new ResponseEntity<>(bookResponse, HttpStatus.FOUND);
    }

    @PostMapping
    @Override
    public ResponseEntity<BookResponse> create(@RequestBody BookRequestCreate bookRequestCreate){
        BookResponse bookResponse = managingBooks.create(bookRequestCreate);
        return new ResponseEntity<>(bookResponse, HttpStatus.CREATED);
    }

    @PatchMapping("/{bookId}")
    @Override
    public ResponseEntity<BookResponse> update(@PathVariable Integer bookId, @RequestBody BookRequestUpdate bookRequestUpdate){
        BookResponse bookResponse = managingBooks.update(bookId, bookRequestUpdate);
        return new ResponseEntity<>(bookResponse, HttpStatus.OK);
    }

    @DeleteMapping("/{bookId}")
    @Override
    public ResponseEntity<Void> deleteById(@PathVariable Integer bookId){
        managingBooks.deleteById(bookId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
