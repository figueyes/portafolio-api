package com.portfolio.api.service;

import com.portfolio.api.domain.Post;
import com.portfolio.api.domain.Tag;

import java.util.List;

public interface PostService {

    List<Post> findAllPost();

    Post findPostById(Long id);

    Post getPostByTag(String tag);

    Boolean createPost(Post post, List<String> tags);

    Boolean updatePost(Post post);

    Boolean deletePostById(Long id);
}
