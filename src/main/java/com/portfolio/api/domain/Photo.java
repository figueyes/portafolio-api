package com.portfolio.api.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "photos")
public class Photo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_photo")
    private Long idPhoto;

    @Column(name = "url_photo")
    private String urlPhoto;

    private Boolean isAvatar;

    @ManyToMany(mappedBy = "photos",
            cascade = CascadeType.ALL)
    private List<Post> posts;

    @OneToOne(mappedBy = "photo",
            cascade = CascadeType.ALL,
            orphanRemoval = true)
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

    public Photo() {
        this.posts = new ArrayList<>();
    }

    public void addPost(Post post) {
        this.posts.add(post);
    }

    public void removePost(Post post) {
        this.posts.remove(post);
    }
}
