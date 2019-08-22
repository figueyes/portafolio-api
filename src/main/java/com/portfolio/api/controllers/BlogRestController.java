package com.portfolio.api.controllers;

import com.portfolio.api.models.entity.Blog;
import com.portfolio.api.models.entity.Tag;
import com.portfolio.api.models.service.BlogeableService;

import com.portfolio.api.models.service.TageableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/apiblog")
public class BlogRestController {


    @Autowired
    private BlogeableService blogService;

    @Autowired
    private TageableService tagService;

    @GetMapping("/blog")
    public List<Blog> indexBlog() {

        return blogService.findAll();
    }

    @GetMapping("/tags")
    public List<Tag> indexTag() {
        return tagService.findAll();
    }


}
