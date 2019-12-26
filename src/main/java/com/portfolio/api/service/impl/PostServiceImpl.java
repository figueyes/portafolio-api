package com.portfolio.api.service.impl;

import com.portfolio.api.domain.Author;
import com.portfolio.api.domain.Post;
import com.portfolio.api.mapper.PostMapper;
import com.portfolio.api.request.PostRequest;
import com.portfolio.api.service.AuthorService;
import com.portfolio.api.service.PostService;
import com.portfolio.api.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {

    @Autowired
    private PostMapper postMapper;

    @Autowired
    private TagService tagService;

    @Autowired
    private AuthorService authorService;

    @Override
    public Boolean createPost(PostRequest postRequest) {

        boolean postCreated = postMapper.insertPost(postRequest.getPost());
        Post post = postRequest.getPost();
        List<String> tags = postRequest.getTags();
        Author author = authorService.findbyAuthor(postRequest.getAuthor());

        if(postCreated){
            authorService.addAuthorToPost(post.getIdPost(),author.getIdAuthor());
            tags.stream()
                    .map(tag -> tagService.findByTag(tag))
                    .forEach(tag-> tagService.addTagToPost(post.getIdPost(),tag.getIdTag()));
            return true;
        }
        return false;
    }

    @Override
    public List<Post> listAllPost() {
        return postMapper.getAllPost();
    }

    @Override
    public Post findPostById(Long id) {
        return postMapper.getPostById(id);
    }

    @Override
    public Post findPostByTag(String tag) {
        return postMapper.getPostByTag(tag);
    }

    @Override
    public Boolean updatePost(Post post) {
        return postMapper.updatePost(post);
    }

    @Override
    public Boolean deletePostById(Long id) {
        return postMapper.deletePostById(id);
    }

}
