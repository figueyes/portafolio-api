package com.portfolio.api.controllers;

import com.portfolio.api.domain.Post;
import com.portfolio.api.service.PostService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/posts", produces = MediaType.APPLICATION_JSON_VALUE)
public class PostController extends CommonController<Post,PostService> {


}
