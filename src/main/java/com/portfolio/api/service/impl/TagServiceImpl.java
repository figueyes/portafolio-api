package com.portfolio.api.service.impl;

import com.portfolio.api.domain.Tag;
import com.portfolio.api.mapper.TagMapper;
import com.portfolio.api.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TagServiceImpl implements TagService {

    @Autowired
    TagMapper tagMapper;

    @Override
    public List<Tag> findAllTags() {
        return tagMapper.getTags();
    }

    @Override
    public Tag findByTag(String tag) {
        return tagMapper.getTagByTag(tag);
    }

    @Override
    public Boolean createTag(Tag tag) {
        return tagMapper.insertTag(tag);
    }

    @Override
    public Boolean addTagToPost(Long idPost, Long idTag) {
        return tagMapper.addTagPost(idPost,idTag);
    }
}
