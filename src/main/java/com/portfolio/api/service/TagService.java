package com.portfolio.api.service;

import com.portfolio.api.domain.Post;
import com.portfolio.api.domain.Tag;

import java.util.List;

public interface TagService {

    List<Tag> findAllTags();
    Tag findByTag(String tag);
    Boolean createTag(Tag tag);
    Boolean addTagToPost(Long idPost, Long idTag);
}
