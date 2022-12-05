package com.blog.pojo;

import java.io.Serializable;

public class Role implements Serializable {
    private Integer roleid;

    private String rolename;

    private String roledes;

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    public String getRoledes() {
        return roledes;
    }

    public void setRoledes(String roledes) {
        this.roledes = roledes;
    }
}