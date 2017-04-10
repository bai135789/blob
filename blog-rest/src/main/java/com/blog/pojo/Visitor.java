package com.blog.pojo;

public class Visitor {
    private Integer vId;

    private Integer visitorTime;

    private String visitorIp;

    public Integer getvId() {
        return vId;
    }

    public void setvId(Integer vId) {
        this.vId = vId;
    }

    public Integer getVisitorTime() {
        return visitorTime;
    }

    public void setVisitorTime(Integer visitorTime) {
        this.visitorTime = visitorTime;
    }

    public String getVisitorIp() {
        return visitorIp;
    }

    public void setVisitorIp(String visitorIp) {
        this.visitorIp = visitorIp == null ? null : visitorIp.trim();
    }
}