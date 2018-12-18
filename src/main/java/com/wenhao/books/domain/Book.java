package com.wenhao.books.domain;

public class Book extends BaseEntity {
    private String name;

    private String url;

    private String password;

    private Integer saveState = 0;
    private String detailUrl;

    public String getDetailUrl() {
        return detailUrl;
    }

    public void setDetailUrl(String detailUrl) {
        this.detailUrl = detailUrl;
    }

    public Integer getSaveState() {
        return saveState;
    }

    public void setSaveState(Integer saveState) {
        this.saveState = saveState;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
