package com.portfolio.api.models.service;

import com.portfolio.api.models.entity.Tag;

import java.util.List;

public interface TageableService {

    public List<Tag> findAll();

    public Tag save(Tag tag);

    public void delete(Long id);

    public Tag findById(Long id);
}
