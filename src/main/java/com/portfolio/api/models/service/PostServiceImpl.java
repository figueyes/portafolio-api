package com.portfolio.api.models.service;

import com.portfolio.api.models.dao.PosteableDao;
import com.portfolio.api.models.dao.TageableDao;
import com.portfolio.api.models.entity.Post;
import com.portfolio.api.models.entity.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PostServiceImpl implements PosteableService {

    @Autowired
    private PosteableDao postDao;

    @Override
    @Transactional(readOnly = true)
    public List<Post> findAllPost() {
        return (List<Post>) postDao.findAll();
    }

    @Override
    public Post save(Post post) {
        return postDao.save(post);
    }

    @Override
    public void updatePost(Post post) {
        postDao.save(post);
    }

    @Override
    public void deletePostById(Long id) {
        postDao.deleteById(id);
    }
}
