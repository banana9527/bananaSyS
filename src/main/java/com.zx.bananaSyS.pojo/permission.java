package com.zx.bananaSyS.pojo;

/**
 * @auther mike
 * @create 2019-07-24 16:41
 */
public class permission {
    private int permId;
    private String permDesc;
    private int docPerm;
    private int ComPerm;

    public int getPermId() {
        return permId;
    }

    public void setPermId(int permId) {
        this.permId = permId;
    }

    public String getPermDesc() {
        return permDesc;
    }

    public void setPermDesc(String permDesc) {
        this.permDesc = permDesc;
    }

    public int getDocPerm() {
        return docPerm;
    }

    public void setDocPerm(int docPerm) {
        this.docPerm = docPerm;
    }

    public int getComPerm() {
        return ComPerm;
    }

    public void setComPerm(int comPerm) {
        ComPerm = comPerm;
    }
}
