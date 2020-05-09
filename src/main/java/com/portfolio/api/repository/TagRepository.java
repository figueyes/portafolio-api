package com.portfolio.api.repository;

import com.portfolio.api.domain.Tag;
import org.springframework.data.repository.CrudRepository;

public interface TagRepository extends CrudRepository<Tag,Long> {
}
