package com.blog.pojo;

public class Article {
    private Short articleId;

    private String articleName;

    private String articleIntro;

    private Integer articleTime;

    private String articleIp;

    private Integer articleClick;

    private Integer sortArticleId;

    private Integer sortTagId;

    private Integer sortTypeId;

    private Integer articleType;

    private Byte articleUp;

    private Byte articleSupport;

    private Integer fabulous;

    private String articleContent;

    public Short getArticleId() {
        return articleId;
    }

    public void setArticleId(Short articleId) {
        this.articleId = articleId;
    }

    public String getArticleName() {
        return articleName;
    }

    public void setArticleName(String articleName) {
        this.articleName = articleName == null ? null : articleName.trim();
    }

    public String getArticleIntro() {
        return articleIntro;
    }

    public void setArticleIntro(String articleIntro) {
        this.articleIntro = articleIntro == null ? null : articleIntro.trim();
    }

    public Integer getArticleTime() {
        return articleTime;
    }

    public void setArticleTime(Integer articleTime) {
        this.articleTime = articleTime;
    }

    public String getArticleIp() {
        return articleIp;
    }

    public void setArticleIp(String articleIp) {
        this.articleIp = articleIp == null ? null : articleIp.trim();
    }

    public Integer getArticleClick() {
        return articleClick;
    }

    public void setArticleClick(Integer articleClick) {
        this.articleClick = articleClick;
    }

    public Integer getSortArticleId() {
        return sortArticleId;
    }

    public void setSortArticleId(Integer sortArticleId) {
        this.sortArticleId = sortArticleId;
    }

    public Integer getSortTagId() {
        return sortTagId;
    }

    public void setSortTagId(Integer sortTagId) {
        this.sortTagId = sortTagId;
    }

    public Integer getSortTypeId() {
        return sortTypeId;
    }

    public void setSortTypeId(Integer sortTypeId) {
        this.sortTypeId = sortTypeId;
    }

    public Integer getArticleType() {
        return articleType;
    }

    public void setArticleType(Integer articleType) {
        this.articleType = articleType;
    }

    public Byte getArticleUp() {
        return articleUp;
    }

    public void setArticleUp(Byte articleUp) {
        this.articleUp = articleUp;
    }

    public Byte getArticleSupport() {
        return articleSupport;
    }

    public void setArticleSupport(Byte articleSupport) {
        this.articleSupport = articleSupport;
    }

    public Integer getFabulous() {
        return fabulous;
    }

    public void setFabulous(Integer fabulous) {
        this.fabulous = fabulous;
    }

    public String getArticleContent() {
        return articleContent;
    }

    public void setArticleContent(String articleContent) {
        this.articleContent = articleContent == null ? null : articleContent.trim();
    }
}