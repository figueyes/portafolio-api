package com.portfolio.api.domain;

public class Tag {

    private Long idTag;
    private String tag;
    private String categoryTag;

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

    public String getCategoryTag() {
        return categoryTag;
    }

    public void setCategoryTag(String categoryTag) {
        this.categoryTag = categoryTag;
    }

    @Override
    public String toString() {
        return "Tag{" +
                "idTag=" + idTag +
                ", tag='" + tag + '\'' +
                ", categoryTag='" + categoryTag + '\'' +
                '}';
    }
}
