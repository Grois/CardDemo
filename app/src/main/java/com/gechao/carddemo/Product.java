package com.gechao.carddemo;

/**
 * Created by Gechao on 2017/3/3.
 * ToDo
 */

public class Product {
    private int id;

    public Product(int id,String title) {
        this.title = title;
        this.id = id;
    }

    private String title;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
