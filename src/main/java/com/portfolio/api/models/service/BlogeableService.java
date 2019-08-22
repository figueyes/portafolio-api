package com.portfolio.api.models.service;

import com.portfolio.api.models.entity.Blog;
import com.portfolio.api.models.entity.Tag;

import java.util.List;

public interface BlogeableService {

    public List<Blog> findAll();

    public Blog save(Blog blog);

    public void delete(Long id);

    public Blog findById(Long id);

}
