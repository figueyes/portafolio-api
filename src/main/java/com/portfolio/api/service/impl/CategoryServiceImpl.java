package com.portfolio.api.service.impl;

import com.portfolio.api.domain.Category;
import com.portfolio.api.repository.CategoryRepository;
import com.portfolio.api.service.CategoryService;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl extends CommonServiceImpl<Category, CategoryRepository> implements CategoryService {
}
