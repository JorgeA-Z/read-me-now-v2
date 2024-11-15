package com.readme.now.readmenow.structure.bookshelf.infrastructure.adapter.output.entity;

import com.readme.now.readmenow.structure.reading.infrastructure.adapter.output.entity.Reading;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;
import java.util.Set;

@Getter
@Setter
@Table(name = "shelf")
@Entity
@EntityListeners(AuditingEntityListener.class)
public class Shelf {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "shelf_id", nullable = false)
    private Integer shelfId;

    @CreatedDate
    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;

    @LastModifiedDate
    @Column(name = "modified_at", nullable = false)
    private LocalDateTime updatedAt;

    //TODO: Hacer la relación con el usuario

    @OneToMany(mappedBy = "shelf")
    private Set<Reading> readings;

}
