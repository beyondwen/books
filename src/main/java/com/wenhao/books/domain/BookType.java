package com.wenhao.books.domain;

public class BookType extends BaseEntity{

    private String bName;

    private String bUrl;

    private String bPassword;

    private String bSaveState = "0";

    private String bDetailUrl;
    private String bType;

    public String getbType() {
        return bType;
    }

    public void setbType(String bType) {
        this.bType = bType;
    }

    public String getbName() {
        return bName;
    }

    public void setbName(String bName) {
        this.bName = bName;
    }

    public String getbUrl() {
        return bUrl;
    }

    public void setbUrl(String bUrl) {
        this.bUrl = bUrl;
    }

    public String getbPassword() {
        return bPassword;
    }

    public void setbPassword(String bPassword) {
        this.bPassword = bPassword;
    }

    public String getbSaveState() {
        return bSaveState;
    }

    public void setbSaveState(String bSaveState) {
        this.bSaveState = bSaveState;
    }

    public String getbDetailUrl() {
        return bDetailUrl;
    }

    public void setbDetailUrl(String bDetailUrl) {
        this.bDetailUrl = bDetailUrl;
    }
}
