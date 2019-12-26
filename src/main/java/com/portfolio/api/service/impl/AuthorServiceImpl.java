package com.portfolio.api.service.impl;

import com.portfolio.api.domain.Author;
import com.portfolio.api.mapper.AuthorMapper;
import com.portfolio.api.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorServiceImpl implements AuthorService {

    @Autowired
    AuthorMapper authorMapper;

    @Override
    public List<Author> findAllAuthors() {
        return authorMapper.getAuthors();
    }

    @Override
    public Author findbyAuthor(String author) {
        return authorMapper.getAuthor(author);
    }

    @Override
    public Boolean createAuthor(Author author) {
        return authorMapper.createAuthor(author);
    }

    @Override
    public Boolean addAuthorToPost(Long idPost, Long idAuthor) {
        return authorMapper.addAuthorPost(idPost, idAuthor);
    }
}
