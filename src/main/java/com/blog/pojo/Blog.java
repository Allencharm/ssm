package com.blog.pojo;

import java.util.Date;

public class Blog {
    private Integer bid;

    private String btitle;

    private Integer typeFk;

    private Integer uFk;

    private Date date;

    private String bcontent;

    private Btype btype;

    private User user;

    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public String getBtitle() {
        return btitle;
    }

    public void setBtitle(String btitle) {
        this.btitle = btitle;
    }

    public Integer getTypeFk() {
        return typeFk;
    }

    public void setTypeFk(Integer typeFk) {
        this.typeFk = typeFk;
    }

    public Integer getuFk() {
        return uFk;
    }

    public void setuFk(Integer uFk) {
        this.uFk = uFk;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getBcontent() {
        return bcontent;
    }

    public void setBcontent(String bcontent) {
        this.bcontent = bcontent;
    }

    public Btype getBtype() {
        return btype;
    }

    public void setBtype(Btype btype) {
        this.btype = btype;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}