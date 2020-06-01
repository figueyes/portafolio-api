package com.portfolio.api.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface CommonRepository<E,ID> extends CrudRepository<E,ID> {
}
