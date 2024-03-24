package com.practice.Assignments.lld1.day_129_collections_generics.hw;

public class Point {
    private int x;
    private int y;
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        // complete the code here
        if(obj instanceof Point){
            Point old = (Point) obj;
            return x== old.x && y==old.y;
        }
        return false;
    }

    @Override
    public int hashCode() {
        // complete the code here
        return 23*x+29*y;
    }
}
