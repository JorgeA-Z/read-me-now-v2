package com.readme.now.readmenow.structure.book.infrastructure.adapter.output.config;

import com.readme.now.readmenow.structure.author.application.output.Authors;
import com.readme.now.readmenow.structure.book.application.out.Books;
import com.readme.now.readmenow.structure.book.domain.usecases.BookUseCase;
import com.readme.now.readmenow.structure.book.infrastructure.adapter.output.BooksAdapter;
import com.readme.now.readmenow.structure.book.infrastructure.adapter.output.mapper.BookMapper;
import com.readme.now.readmenow.structure.book.infrastructure.adapter.output.repository.BookRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(
        basePackages = "com.readme.now.readmenow.structure.book.infrastructure.adapter.output.repository"
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
