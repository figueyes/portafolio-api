package com.portfolio.api.controllers;


import com.portfolio.api.domain.Post;
import com.portfolio.api.request.PostRequest;
import com.portfolio.api.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/api")
public class BlogRestController {

    @Autowired
    private PostService postService;

    @PostMapping("/posts")
    public List<Post> getAllpost(){
        return postService.findAllPost();
    }

    @PostMapping("/post/{id}")
    public Post showPost(@PathVariable Long id){
        return postService.findPostById(id);
    }

    @PostMapping("/post/showbytag/{tag}")
    public Post showPostByTag(@PathVariable String tag){
        return postService.getPostByTag(tag);
    }

    @PostMapping("/post/create")
    public Boolean createPost(@RequestBody PostRequest postRequest){
        return postService.createPost(postRequest.getPost(), postRequest.getTags());
    }
}
