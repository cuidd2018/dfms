package cn.dc.usercenter.pojo;

import java.io.Serializable;

public class UcenterUserLogWithBLOBs extends UcenterUserLog implements Serializable {
    private byte[] content;

    private byte[] agent;

    public byte[] getContent() {
        return content;
    }

    public void setContent(byte[] content) {
        this.content = content;
    }

    public byte[] getAgent() {
        return agent;
    }

    public void setAgent(byte[] agent) {
        this.agent = agent;
    }
}