package com.portfolio.api.domain;

public class Tag {

    private Long idTag;
    private String tag;

    public Long getIdTag() {
        return idTag;
    }

    public void setIdTag(Long idTag) {
        this.idTag = idTag;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    @Override
    public String toString() {
        return "Tag{" +
                "idTag=" + idTag +
                ", tag='" + tag + '\'' +
                '}';
    }
}