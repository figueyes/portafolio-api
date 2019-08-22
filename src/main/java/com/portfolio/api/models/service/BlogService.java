package com.portfolio.api.models.service;

import com.portfolio.api.models.dao.BlogeableDao;
import com.portfolio.api.models.dao.TageableDao;
import com.portfolio.api.models.entity.Blog;
import com.portfolio.api.models.entity.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BlogService implements BlogeableService {

    @Autowired
    private BlogeableDao blogDao;

    @Override
    @Transactional(readOnly = true)
    public List<Blog> findAll() {
        return (List<Blog>) blogDao.findAll();
    }

    @Override
    @Transactional
    public Blog save(Blog blog) {
        return (Blog) blogDao.save(blog);
    }

     @Override
     @Transactional
     public void delete(Long id) {
        blogDao.deleteById(id);
    }

    @Override
    @Transactional
    public Blog findById(Long id) {
        return blogDao.findById(id).orElse(null);
    }

}
