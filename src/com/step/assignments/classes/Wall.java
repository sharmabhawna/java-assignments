package com.step.assignments.classes;

public class Wall {

    private int height;
    private int width;

    public Wall() {
    }

    public Wall(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
        if(height < 0){
            this.height = 0;
        }
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
        if(width < 0){
            this.width = 0;
        }
    }

    public int getArea(){
        return this.getHeight() * this.getWidth();
    }
}
