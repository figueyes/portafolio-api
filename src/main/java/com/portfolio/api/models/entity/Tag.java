package com.portfolio.api.models.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="tags")
public class Tag implements Serializable {

    private static final long serialVersionUID = -5370428289734475184L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String tag;

    @JsonIgnore
    @ManyToMany(mappedBy = "tags")
    private Set<Post> posts;

    public Tag() {
        posts = new HashSet<Post>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public Set<Post> getBlogs() {
        return posts;
    }

    public void setBlogs(Set<Post> posts) {
        this.posts = posts;
    }
}
