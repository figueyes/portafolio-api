package com.portfolio.api.models.service;

import com.portfolio.api.models.dao.TageableDao;
import com.portfolio.api.models.entity.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TagService implements TageableService {

    @Autowired
    private TageableDao tagDao;

    @Override
    public List<Tag> findAll() {
        return (List<Tag>) tagDao.findAll();
    }

    @Override
    public Tag save(Tag tag) {
        return tagDao.save(tag);
    }

    @Override
    public void delete(Long id) {
        tagDao.deleteById(id);
    }

    @Override
    public Tag findById(Long id) {
        return tagDao.findById(id).orElse(null);
    }
}
