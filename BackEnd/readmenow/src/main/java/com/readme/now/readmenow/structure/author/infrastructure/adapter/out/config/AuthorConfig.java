package com.readme.now.readmenow.structure.author.infrastructure.adapter.out.config;

import com.readme.now.readmenow.structure.author.application.out.Authors;
import com.readme.now.readmenow.structure.author.domain.usecases.AuthorUseCase;
import com.readme.now.readmenow.structure.author.infrastructure.adapter.out.AuthorAdapter;
import com.readme.now.readmenow.structure.author.infrastructure.adapter.out.mapper.AuthorMapper;
import com.readme.now.readmenow.structure.author.infrastructure.adapter.out.repository.AuthorRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(
        basePackages = "com.readme.now.readmenow.structure.author.infrastructure.adapter.out.repository"
)
public class AuthorConfig {
    @Bean
    public AuthorAdapter authorAdapter(AuthorRepository authorRepository){
        return new AuthorAdapter(authorRepository);
    }

    @Bean
    public AuthorUseCase authorUseCase(Authors authors, AuthorMapper authorMapper){
        return new AuthorUseCase(authors, authorMapper);
    }
}
