package com.portfolio.api.controllers;

import com.portfolio.api.domain.Author;
import com.portfolio.api.service.AuthorService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/authors", produces = MediaType.APPLICATION_JSON_VALUE)
public class AuthorController extends CommonController<Author, AuthorService> {
}
