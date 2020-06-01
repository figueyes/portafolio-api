package com.portfolio.api.controllers;

import com.portfolio.api.domain.Category;
import com.portfolio.api.service.CategoryService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/categories", produces = MediaType.APPLICATION_JSON_VALUE)
public class CategoryController extends CommonController<Category, CategoryService> {
}
