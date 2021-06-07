package com.company;

public class Point {
    private double x;
    private double y;

    /**
     * Сoordinate a point
     * @param x first coordinate of the point
     * @param y second coordinate of the point
     */
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Distance to point
     * @param p source point
     * @return distance to point
     */
    public double distanceTo(Point p){
        double dx = p.x - x;
        double dy = p.y - y;
        return Math.sqrt(dx*dx+dy*dy);
    }

    @Override
    public String toString() {
        return "Point ["  + x +"," + y +']';
    }
}
