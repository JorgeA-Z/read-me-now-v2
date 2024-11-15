package com.readme.now.readmenow.structure.author.infrastructure.adapter.output.repository;

import com.readme.now.readmenow.structure.author.infrastructure.adapter.output.entity.Author;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Integer> {
    Page<Author> findAll(Pageable pageable);
    Page<Author> findAllByIsActive(Pageable pageable, Boolean active);

}
