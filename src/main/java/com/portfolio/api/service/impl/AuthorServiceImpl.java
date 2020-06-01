package com.portfolio.api.service.impl;

import com.portfolio.api.domain.Author;
import com.portfolio.api.repository.AuthorRepository;
import com.portfolio.api.service.AuthorService;
import org.springframework.stereotype.Service;

@Service
public class AuthorServiceImpl extends CommonServiceImpl<Author, AuthorRepository> implements AuthorService {
}
