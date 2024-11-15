package com.readme.now.readmenow.structure.book.infrastructure.adapter.output;

import com.readme.now.readmenow.structure.book.application.out.Books;
import com.readme.now.readmenow.structure.book.infrastructure.adapter.output.entity.Book;
import com.readme.now.readmenow.structure.book.infrastructure.adapter.output.repository.BookRepository;
import jakarta.persistence.EntityNotFoundException;
import jakarta.validation.ConstraintViolationException;
import lombok.AllArgsConstructor;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import java.util.Optional;


@AllArgsConstructor
public class BooksAdapter implements Books {
    private final BookRepository bookRepository;

    @Override
    public Page<Book> findAll(Integer pageNumber, Integer pageSize, Boolean active) {
        Pageable pageable = PageRequest.of(pageNumber, pageSize);
        if(active == null){
            return bookRepository.findAll(pageable);
        }
        return bookRepository.findAllByIsActive(pageable, active);
    }

    @Override
    public Book findById(Integer bookId) {
        Optional<Book> bookFound = bookRepository.findById(bookId);
        if(bookFound.isEmpty()){
            throw new EntityNotFoundException(bookId.toString());
        }
        return bookFound.get();
    }

    @Override
    public Book create(Book bookCreate) {
        try{
            return bookRepository.save(bookCreate);
        } catch (ConstraintViolationException e) {
            throw new DataIntegrityViolationException("");
        }
    }

    @Override
    public Book update(Book bookUpdate) {
        try{
            return bookRepository.save(bookUpdate);
        } catch (ConstraintViolationException e) {
            throw new DataIntegrityViolationException("");
        }
    }

    @Override
    public Boolean existById(Integer id) {
        return bookRepository.existsById(id);
    }

    @Override
    public void deleteById(Integer bookId) {
        Optional<Book> bookFound = bookRepository.findById(bookId);
        if(bookFound.isEmpty()){
            throw new EntityNotFoundException(bookId.toString());
        }
        Book bookToDelete = bookFound.get();
        bookToDelete.setIsActive(false);
    }

    @Override
    public Long count() {
        return bookRepository.count();
    }


}
