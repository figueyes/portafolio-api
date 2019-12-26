package com.portfolio.api.service;

import com.portfolio.api.domain.Post;
import com.portfolio.api.domain.Tag;

import java.util.List;

public interface TagService {

    List<Tag> findAllTags();

    Boolean insertTagInPost(Post post, String tag);
    Tag getTagByTag(String tag);
}
