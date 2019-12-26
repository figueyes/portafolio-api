package com.portfolio.api.domain;

public class PostTag {

    private Long idPost;
    private Long idtag;
    private String tag;

    public Long getIdPost() {
        return idPost;
    }

    public void setIdPost(Long idPost) {
        this.idPost = idPost;
    }

    public Long getIdtag() {
        return idtag;
    }

    public void setIdtag(Long idtag) {
        this.idtag = idtag;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
}
