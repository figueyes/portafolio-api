package com.portfolio.api.models.dao;

import com.portfolio.api.models.entity.Tag;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TageableDao extends CrudRepository<Tag, Long> {

}
