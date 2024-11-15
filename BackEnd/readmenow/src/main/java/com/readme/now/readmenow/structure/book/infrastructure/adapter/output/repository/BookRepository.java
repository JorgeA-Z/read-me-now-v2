package com.readme.now.readmenow.structure.book.infrastructure.adapter.output.repository;

import com.readme.now.readmenow.structure.book.infrastructure.adapter.output.entity.Book;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.data.domain.Page;
@Repository
public interface BookRepository  extends JpaRepository<Book, Integer> {

    @Query("SELECT b FROM Book b JOIN FETCH b.author")
    Page<Book> findAll(Pageable pageable);

    @Query("SELECT b FROM Book b JOIN FETCH b.author a WHERE b.isActive = :isActive")
    Page<Book> findAllByIsActive(Pageable pageable, @Param("isActive") Boolean active);

}
