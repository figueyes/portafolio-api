package com.portfolio.api.models.service;

import com.portfolio.api.models.entity.Post;

import java.util.List;

public interface PosteableService {

    List<Post> findAllPost();

    Post save (Post post);

    void updatePost(Post post);

    void deletePostById(Long id);
}
