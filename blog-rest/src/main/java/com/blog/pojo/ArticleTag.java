package com.blog.pojo;

public class ArticleTag {
    private Integer sortTagId;

    private String sortTagName;

    public Integer getSortTagId() {
        return sortTagId;
    }

    public void setSortTagId(Integer sortTagId) {
        this.sortTagId = sortTagId;
    }

    public String getSortTagName() {
        return sortTagName;
    }

    public void setSortTagName(String sortTagName) {
        this.sortTagName = sortTagName == null ? null : sortTagName.trim();
    }
}