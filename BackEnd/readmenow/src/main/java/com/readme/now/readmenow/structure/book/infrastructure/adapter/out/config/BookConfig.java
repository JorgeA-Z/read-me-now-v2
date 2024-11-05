package com.readme.now.readmenow.structure.book.infrastructure.adapter.out.config;

import com.readme.now.readmenow.structure.author.application.out.Authors;
import com.readme.now.readmenow.structure.book.application.out.Books;
import com.readme.now.readmenow.structure.book.domain.usecases.BookUseCase;
import com.readme.now.readmenow.structure.book.infrastructure.adapter.out.BooksAdapter;
import com.readme.now.readmenow.structure.book.infrastructure.adapter.out.mapper.BookMapper;
import com.readme.now.readmenow.structure.book.infrastructure.adapter.out.repository.BookRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(
        basePackages = "com.readme.now.readmenow.structure.book.infrastructure.adapter.out.repository"
)
public class BookConfig {
    @Bean
    public BooksAdapter booksAdapter(BookRepository bookRepository){
        return new BooksAdapter(bookRepository);
    }

    @Bean
    public BookUseCase bookUseCase(Books books, Authors authors, BookMapper bookMapper){
        return new BookUseCase(books, authors, bookMapper);
    }
}
