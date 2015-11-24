package com.verdicchio.model;

/**
 * Created by verdian on 19/11/2015.
 */
public class Wall extends Item {


    private int width;

    private int height;


    public Wall(String name, String description, int width, int height) {
        super(name, description);
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
