package com.blog.pojo;

public class UserOauth {
    private Integer oid;

    private Integer userid;

    private String oauthName;

    private String oauthId;

    private String oauthAccessToken;

    private String oauthExpires;

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getOauthName() {
        return oauthName;
    }

    public void setOauthName(String oauthName) {
        this.oauthName = oauthName == null ? null : oauthName.trim();
    }

    public String getOauthId() {
        return oauthId;
    }

    public void setOauthId(String oauthId) {
        this.oauthId = oauthId == null ? null : oauthId.trim();
    }

    public String getOauthAccessToken() {
        return oauthAccessToken;
    }

    public void setOauthAccessToken(String oauthAccessToken) {
        this.oauthAccessToken = oauthAccessToken == null ? null : oauthAccessToken.trim();
    }

    public String getOauthExpires() {
        return oauthExpires;
    }

    public void setOauthExpires(String oauthExpires) {
        this.oauthExpires = oauthExpires == null ? null : oauthExpires.trim();
    }
}