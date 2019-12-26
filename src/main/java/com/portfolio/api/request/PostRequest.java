package com.portfolio.api.request;

import com.portfolio.api.domain.Post;

import java.util.List;

public class PostRequest {
    private Post post;
    private List<String> tags;
    private String category;
    private String author;

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "PostRequest{" +
                "post=" + post +
                ", tags=" + tags +
                ", category='" + category + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
