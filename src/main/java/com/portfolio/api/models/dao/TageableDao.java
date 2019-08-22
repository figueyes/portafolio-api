package com.portfolio.api.models.dao;

import com.portfolio.api.models.entity.Tag;

import org.springframework.data.repository.CrudRepository;

public interface TageableDao extends CrudRepository<Tag, Long> {


}
