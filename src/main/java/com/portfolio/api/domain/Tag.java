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
@Table(name = "tags")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "posts"})
public class Tag {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_tag")
    private Long idTag;

    @NotEmpty
    @Column(length = 50)
    private String tag;

    @ManyToMany(mappedBy = "tags")
    private List<Post> posts;

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

    public Tag() {
        this.posts = new ArrayList<>();
    }

    public void addPost(Post post) {
        this.posts.add(post);
    }

    public void removePost(Post post) {
        this.posts.remove(post);
    }
}