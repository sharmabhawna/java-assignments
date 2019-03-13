package com.step.assignments.classes;

public class Point {

    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double Distance(int x, int y){
        return Math.sqrt(((this.x - x)*(this.x - x) + (this.y - y)*(this.y - y)));
    }

    public double Distance(){
        return this.Distance(0,0);
    }

    public double Distance(Point point){
        return this.Distance(point.x, point.y);
    }
}
