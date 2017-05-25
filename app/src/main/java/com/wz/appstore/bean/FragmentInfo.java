package com.wz.appstore.bean;

/**
 * Created by wz on 17-5-26.
 */

public class FragmentInfo {

    private Class clazz;
    private String title;

    public FragmentInfo(Class clazz, String title) {
        this.clazz = clazz;
        this.title = title;
    }

    public Class getClazz() {
        return clazz;
    }

    public void setClazz(Class clazz) {
        this.clazz = clazz;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
