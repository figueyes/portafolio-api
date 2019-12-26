package com.portfolio.api.service;

import com.portfolio.api.dao.PosteableDao;
import com.portfolio.api.dao.TageableDao;
import com.portfolio.api.domain.Post;
import com.portfolio.api.mapper.PostMapper;
import com.portfolio.api.mapper.TagMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PostServiceImpl implements PosteableService {

    @Autowired
    private PostMapper postMapper;

    @Autowired
    private TagMapper tagMapper;

    @Override
    public List<Post> findAllPost() {
        return postMapper.getAllPost();
    }


    @Override
    public Post save(Post post) {
        return postMapper.save(post);
    }

    @Override
    public void updatePost(Post post) {
        postMapper.save(post);
    }

    @Override
    public void deletePostById(Long id) {
        postMapper.deleteById(id);
    }
}
