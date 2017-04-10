package com.blog.pojo;

public class LeaveMsg {
    private Integer msgId;

    private String msgContent;

    private Integer msgUserId;

    private Integer parentMsgId;

    private Integer leaveMsgTime;

    private String leaveMsgIp;

    private Integer fabulous;

    public Integer getMsgId() {
        return msgId;
    }

    public void setMsgId(Integer msgId) {
        this.msgId = msgId;
    }

    public String getMsgContent() {
        return msgContent;
    }

    public void setMsgContent(String msgContent) {
        this.msgContent = msgContent == null ? null : msgContent.trim();
    }

    public Integer getMsgUserId() {
        return msgUserId;
    }

    public void setMsgUserId(Integer msgUserId) {
        this.msgUserId = msgUserId;
    }

    public Integer getParentMsgId() {
        return parentMsgId;
    }

    public void setParentMsgId(Integer parentMsgId) {
        this.parentMsgId = parentMsgId;
    }

    public Integer getLeaveMsgTime() {
        return leaveMsgTime;
    }

    public void setLeaveMsgTime(Integer leaveMsgTime) {
        this.leaveMsgTime = leaveMsgTime;
    }

    public String getLeaveMsgIp() {
        return leaveMsgIp;
    }

    public void setLeaveMsgIp(String leaveMsgIp) {
        this.leaveMsgIp = leaveMsgIp == null ? null : leaveMsgIp.trim();
    }

    public Integer getFabulous() {
        return fabulous;
    }

    public void setFabulous(Integer fabulous) {
        this.fabulous = fabulous;
    }
}