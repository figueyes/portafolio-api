package com.portfolio.api.service;

import com.portfolio.api.domain.Post;
import com.portfolio.api.request.PostRequest;

import java.util.List;

public interface PostService {

    Boolean createPost(PostRequest postRequest);

    List<Post> listAllPost();

    Post findPostById(Long id);

    Post findPostByTag(String tag);

    Boolean updatePost(Post post);

    Boolean deletePostById(Long id);
}
