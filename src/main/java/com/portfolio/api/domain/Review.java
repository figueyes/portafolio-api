package com.portfolio.api.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "reviews")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "post"})
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_review")
    private Long idReview;

    @NotEmpty
    @Lob
    private String review;

    @OneToOne(mappedBy = "review",
            cascade = CascadeType.ALL,
            orphanRemoval = true)
    private Post post;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_photo")
    private Photo photo;

    @Column(name = "created_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;

    @Column(name = "updated_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;

    @PrePersist
    private void prePersist() {
        this.createdAt = new Date();
    }

    @PreUpdate
    public void preUpdate() {
        this.updatedAt = new Date();
    }

}
