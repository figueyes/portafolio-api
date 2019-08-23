package com.portfolio.api.models.dao;

import com.portfolio.api.models.entity.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface PosteableDao extends CrudRepository<Post,Long>, PagingAndSortingRepository<Post,Long> {



}
