package com.readme.now.readmenow.structure.reading.infrastructure.adapter.output.entity;

import com.readme.now.readmenow.structure.book.infrastructure.adapter.output.entity.Book;
import com.readme.now.readmenow.structure.bookshelf.infrastructure.adapter.output.entity.Shelf;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;
import java.time.LocalTime;

@Getter
@Setter
@Table(name = "reading")
@Entity
@EntityListeners(AuditingEntityListener.class)
public class Reading {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "reading_id", nullable = false)
    private Integer readingId;

    @Column(name = "is_favorite")
    private Boolean isFavorite;

    @Column(name = "read_Individual_time", nullable = false)
    private LocalTime readIndividualTime;

    @CreatedDate
    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;

    @LastModifiedDate
    @Column(name = "modified_at", nullable = false)
    private LocalDateTime updatedAt;

    @ManyToOne
    @JoinColumn(name = "shelf_id")
    private Shelf shelf;

    @ManyToOne
    @JoinColumn(name = "book_id")
    private Book book;
}
