package com.wxz.entity;

public class Shop {
    private Integer sid;
    private int gid;
    private String gname;
    private int price;
    private int userid;

    @Override
    public String toString() {
        return "Shop{" +
                "sid=" + sid +
                ", gid=" + gid +
                ", gname='" + gname + '\'' +
                ", price=" + price +
                ", userid=" + userid +
                '}';
    }

    public Shop(Integer sid, int gid, String gname, int price, int userid) {
        this.sid = sid;
        this.gid = gid;
        this.gname = gname;
        this.price = price;
        this.userid = userid;
    }

    public Shop() {
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public int getGid() {
        return gid;
    }

    public void setGid(int gid) {
        this.gid = gid;
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }
}
