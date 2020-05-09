package com.portfolio.api.service.impl;

import com.portfolio.api.domain.Post;
import com.portfolio.api.repository.PostRepository;
import com.portfolio.api.service.PostService;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl extends CommonServiceImpl<Post,PostRepository> implements PostService {
}
