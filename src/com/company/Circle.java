package com.company;

public class Circle {
    private Point center;
    private double radius;

    /**
     * creating a circle
     * @param center center of a circle
     * @param radius radius of a circle
     */
    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    /**
     * Does the point lie in a circle
     * @param p point
     * @return true if yes
     */
    public boolean containsPoint (Point p){
        return p.distanceTo(center) <= radius;

    }



}
