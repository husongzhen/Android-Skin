package com.meiyou.androidskin.recycleview;

/**
 * Author: ice
 * Date: 1/30/18 09:23.
 */

public class Book {
    private String name;
    private int image;

    public Book(String name,int image){
        this.name = name;
        this.image = image;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
