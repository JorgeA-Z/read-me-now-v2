package com.readme.now.readmenow.structure.author.infrastructure.adapter.output;

import com.readme.now.readmenow.structure.author.application.output.Authors;
import com.readme.now.readmenow.structure.author.infrastructure.adapter.output.entity.Author;
import com.readme.now.readmenow.structure.author.infrastructure.adapter.output.repository.AuthorRepository;
import jakarta.persistence.EntityNotFoundException;
import jakarta.validation.ConstraintViolationException;
import lombok.AllArgsConstructor;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

@AllArgsConstructor
public class AuthorAdapter implements Authors {
    private final AuthorRepository authorRepository;
    @Override
    public Page<Author> findAll(Integer pageNumber, Integer pageSize, Boolean active) {
        Pageable pageable = PageRequest.of(pageNumber, pageSize);
        if(active == null){
            return authorRepository.findAll(pageable);
        }
        return authorRepository.findAllByIsActive(pageable, active);
    }

    @Override
    public Author findById(Integer authorId) {
        Optional<Author> authorFound = authorRepository.findById(authorId);
        if(authorFound.isEmpty()){
            throw new EntityNotFoundException(authorId.toString());
        }
        return authorFound.get();
    }

    @Override
    public Author create(Author authorCreate) {
        try{
            return authorRepository.save(authorCreate);
        } catch (ConstraintViolationException e) {
            throw new DataIntegrityViolationException("");
        }
    }

    @Override
    public Author update(Author authorUpdate) {
        try{
            return authorRepository.save(authorUpdate);
        } catch (ConstraintViolationException e) {
            throw new DataIntegrityViolationException("");
        }
    }

    @Override
    public Boolean existById(Integer id) {
        return authorRepository.existsById(id);
    }

    @Override
    public void deleteById(Integer authorId) {
        Optional<Author> authorFound = authorRepository.findById(authorId);
        if(authorFound.isEmpty()){
            throw new EntityNotFoundException(authorId.toString());
        }
        Author authorToDelete = authorFound.get();
        authorToDelete.setIsActive(false);
    }

    @Override
    public Long count() {
        return authorRepository.count();
    }
}
