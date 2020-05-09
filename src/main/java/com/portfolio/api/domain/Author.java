package com.portfolio.api.domain;

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
@Table(name = "authors")
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_author")
    private Long idAuthor;

    @NotEmpty
    @Column(length = 50)
    private String author;

    @NotEmpty
    @Column(length = 50)
    private String name;

    @NotEmpty
    @Column(length = 50)
    private String surname;

    @NotEmpty
    @Column(length = 100)
    private String description;

    @OneToMany(mappedBy = "author",
            cascade = CascadeType.ALL,
            orphanRemoval = true)
    List<Post> posts;

    @OneToOne(mappedBy = "author",
            cascade = CascadeType.ALL,
            orphanRemoval = true)
    private User user;

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

    public Author() {
        this.posts = new ArrayList<>();
    }

    public void addPost(Post post) {
        this.posts.add(post);
    }

    public void removePost(Post post) {
        this.posts.remove(post);
    }
}
