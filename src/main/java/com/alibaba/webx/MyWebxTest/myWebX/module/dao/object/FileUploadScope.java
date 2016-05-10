package com.alibaba.webx.MyWebxTest.myWebX.module.dao.object;

/**
 * Created by wb-zhangkenan on 2016/4/7.
 */
public class FileUploadScope {
    /**
     * 姓名
     */
    private String userName;
    /**
     * 密码
     */
    private String passWord;
    /**
     * 文件名
     */
    private String fileUploadName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getFileUploadName() {
        return fileUploadName;
    }

    public void setFileUploadName(String fileUploadName) {
        this.fileUploadName = fileUploadName;
    }
}

