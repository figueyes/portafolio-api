package com.portfolio.api.models.dao;

import com.portfolio.api.models.entity.Blog;
import org.springframework.data.repository.CrudRepository;

public interface BlogeableDao extends CrudRepository<Blog,Long> {
}
