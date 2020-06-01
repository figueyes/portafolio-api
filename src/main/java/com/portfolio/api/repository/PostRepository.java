package com.portfolio.api.repository;

import com.portfolio.api.domain.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CommonRepository<Post, Long> {
}
