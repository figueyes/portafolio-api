package com.portfolio.api.domain;

import java.util.*;

public class Post {

    private Long idPost;
    private String title;
    private String subtitle;
    private String author;
    private String category;
    private String bodyText;
    private String photos;
    private Date createdAt;
    private Date updatedAt;

    public Long getIdPost() {
        return idPost;
    }

    public void setIdPost(Long id) {
        this.idPost = id;
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getBodyText() {
        return bodyText;
    }

    public void setBodyText(String bodyText) {
        this.bodyText = bodyText;
    }

    public String getPhoto() {
        return photos;
    }

    public void setPhoto(String photo) {
        this.photos = photo;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        return "Post{" +
                "idPost=" + idPost +
                ", title='" + title + '\'' +
                ", subtitle='" + subtitle + '\'' +
                ", author='" + author + '\'' +
                ", category='" + category + '\'' +
                ", bodyText='" + bodyText + '\'' +
                ", photo='" + photos + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
