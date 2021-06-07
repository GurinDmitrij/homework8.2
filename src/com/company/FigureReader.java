package com.company;

import java.util.Scanner;

public class FigureReader {
    private Scanner sc;

    public FigureReader(Scanner sc) {
        this.sc = sc;
    }

    /**
     * Create new point
     * @return point with coordinates entered by the user
     */
    public Point readPoint(){
        System.out.println("Enter the x: ");
        double x = sc.nextDouble();
        System.out.println("Enter the y: ");
        double y = sc.nextDouble();
        return new Point(x,y);
    }

    /**
     *  Creat Circle
     * @return circle with coordinates center and radius entered by the user
     */
    public Circle readCircle (){
        System.out.println("Enter the radius: ");
        double radius = sc.nextDouble();
        System.out.println("Enter the centre ");
        Point centre = readPoint();
        return new Circle(centre,radius);
    }
}
