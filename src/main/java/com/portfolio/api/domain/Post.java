package com.portfolio.api.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.*;

@Getter
@Setter
@Entity
@Table(name = "posts")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_post")
    private Long idPost;

    @NotEmpty
    @Column(length = 200)
    private String title;

    @NotEmpty
    @Column(length = 200)
    private String subtitle;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_author")
    private Author author;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "post_category",
            joinColumns = {@JoinColumn(name = "id_post")},
            inverseJoinColumns = {@JoinColumn(name = "id_category")})
    private List<Category> categories;

    @OneToMany(mappedBy = "post")
    private List<Body> bodies;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "post_tag",
            joinColumns = {@JoinColumn(name = "id_post")},
            inverseJoinColumns = {@JoinColumn(name = "id_tag")})
    private List<Tag> tags;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "post_photo",
            joinColumns = {@JoinColumn(name = "id_post")},
            inverseJoinColumns = {@JoinColumn(name = "id_photo")})
    private List<Photo> photos;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_review")
    private Review review;

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

    public Post() {
        this.categories = new ArrayList<>();
        this.bodies = new ArrayList<>();
        this.tags = new ArrayList<>();
        this.photos = new ArrayList<>();
    }

    public void addCategory(Category category) {
        this.categories.add(category);
    }

    public void removeCategory(Category category) {
        this.categories.remove(category);
    }

    public void addBody(Body body) {
        this.bodies.add(body);
    }

    public void removeBody(Body body) {
        this.bodies.remove(body);
    }

    public void addTag(Tag tag) {
        this.tags.add(tag);
    }

    public void removeTag(Tag tag) {
        this.tags.remove(tag);
    }

    public void addPhoto(Photo photo) {
        this.photos.add(photo);
    }

    public void removePhoto(Photo photo) {
        this.photos.remove(photo);
    }
}
