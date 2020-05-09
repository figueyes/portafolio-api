package com.portfolio.api.repository;

import com.portfolio.api.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Long> {
}
