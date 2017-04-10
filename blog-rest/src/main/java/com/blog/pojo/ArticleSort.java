package com.blog.pojo;

public class ArticleSort {
    private Integer sortArticleId;

    private String sortArticleName;

    public Integer getSortArticleId() {
        return sortArticleId;
    }

    public void setSortArticleId(Integer sortArticleId) {
        this.sortArticleId = sortArticleId;
    }

    public String getSortArticleName() {
        return sortArticleName;
    }

    public void setSortArticleName(String sortArticleName) {
        this.sortArticleName = sortArticleName == null ? null : sortArticleName.trim();
    }
}