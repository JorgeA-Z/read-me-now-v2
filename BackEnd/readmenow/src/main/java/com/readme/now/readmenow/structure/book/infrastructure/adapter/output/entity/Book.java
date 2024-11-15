package com.readme.now.readmenow.structure.book.infrastructure.adapter.output.entity;

import com.readme.now.readmenow.structure.author.infrastructure.adapter.output.entity.Author;
import com.readme.now.readmenow.structure.reading.infrastructure.adapter.output.entity.Reading;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Set;

@Getter
@Setter
@Table(name = "book")
@Entity
@EntityListeners(AuditingEntityListener.class)
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_id", nullable = false)
    private Integer bookId;

    @Column(name = "about", nullable = false, length = 1000)
    private String about;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "author_id", nullable = false)
    private Author author;

    @Column(name = "cover", nullable = false, length = 300)
    private String cover;

    @Column(name = "genre", nullable = false, length = 64)
    private String genre;

    @Column(name = "subgenre", nullable = true, length = 64)
    private String subGenre;

    @Column(name = "name", nullable = false, length = 64)
    private String name;

    @Column(name = "url", nullable = false, length = 300)
    private String url;

    @Column(name = "likes", nullable = false)
    private Long likes;

    @Column(name = "read_global_time", nullable = false)
    private LocalTime readGlobalTime;

    @Column(name = "is_active", nullable = false)
    private Boolean isActive;

    @CreatedDate
    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;

    @LastModifiedDate
    @Column(name = "modified_at", nullable = false)
    private LocalDateTime updatedAt;

    @OneToMany(mappedBy = "book")
    private Set<Reading> readings;
}
