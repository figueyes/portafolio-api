package com.portfolio.api.models.entity;


import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.util.*;

@Entity
@Table(name="posts")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Post implements Serializable {


    private static final long serialVersionUID = 479799998135563720L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty(message="no puede estar vacío")
    @Column(nullable = false)
    private String title;

    @NotEmpty(message="no puede estar vacío")
    @Column(nullable = false)
    private String subtitle;

    @NotEmpty(message="no puede estar vacío")
    @Column(nullable = false)
    private String author;

    @Lob
    @NotEmpty(message="no puede estar vacío")
    @Column(name = "text_body", nullable = false)
    private String textBody;

    private String photo;

    @NotEmpty(message="no puede estar vacío")
    @Column(nullable = false, name = "create_at")
    @Temporal(TemporalType.DATE)
    private Date createAt;

    @NotEmpty(message="no puede estar vacío")
    @Column(nullable = false, name = "update_at")
    @Temporal(TemporalType.DATE)
    private Date updateAt;

    @Column(nullable = false)
    private String categoria;

    @JsonIgnore
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "tags_post",
    joinColumns = {@JoinColumn (name = "id_post")},
    inverseJoinColumns = {@JoinColumn (name = "id_tag")})
    private Set<Tag> tags;

    public Post() {
        tags = new HashSet<Tag>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTextBody() {
        return textBody;
    }

    public void setTextBody(String textBody) {
        this.textBody = textBody;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Set<Tag> getTags() {
        return tags;
    }

    public void setTags(Set<Tag> tags) {
        this.tags = tags;
    }
}
