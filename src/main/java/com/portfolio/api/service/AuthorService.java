package com.portfolio.api.service;

import com.portfolio.api.domain.Author;

import java.util.List;

public interface AuthorService {

    List<Author> findAllAuthors();
    Author findbyAuthor(String author);
    Boolean createAuthor(Author author);
    Boolean addAuthorToPost(Long idPost, Long idAuthor);

}
