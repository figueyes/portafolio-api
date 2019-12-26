package com.portfolio.api.request;

import com.portfolio.api.domain.Post;

import java.util.List;

public class PostRequest {
    private Post post;
    private List<String> tags;

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

    @Override
    public String toString() {
        return "PostRequest{" +
                "post=" + post +
                ", tags=" + tags +
                '}';
    }
}
