package com.portfolio.api.controllers;


import com.portfolio.api.models.entity.Post;
import com.portfolio.api.models.service.PosteableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/api")
public class BlogRestController {

    @Autowired
    private PosteableService postService;

    @GetMapping("/post")
    public List<Post> getAllpost(){
        return postService.findAllPost();
    }
}
