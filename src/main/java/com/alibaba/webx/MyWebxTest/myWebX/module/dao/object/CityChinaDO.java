package com.alibaba.webx.MyWebxTest.myWebX.module.dao.object;

/**
 * Created by zkn on 2016/4/18.
 */
public class CityChinaDO {
    /**
     * 主键ID
     */
    private Integer id;
    /**
     * 省的拼音
     */
    private String ename;
    /**
     * 省的名称
     */
    private String cname;
    /**
     * 城市拼音
     */
    private String ecityName;
    /**
     * 城市名称
     */
    private String ccityName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getEcityName() {
        return ecityName;
    }

    public void setEcityName(String ecityName) {
        this.ecityName = ecityName;
    }

    public String getCcityName() {
        return ccityName;
    }

    public void setCcityName(String ccityName) {
        this.ccityName = ccityName;
    }
}
