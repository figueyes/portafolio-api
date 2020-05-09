package com.portfolio.api.service;

import java.util.Optional;
import java.util.UUID;

public interface CommonService<E> {
    Iterable<E> findAll();

    Optional<E> findById(Long id);

    E save(E entity);

    void deleteById(Long id);
}
