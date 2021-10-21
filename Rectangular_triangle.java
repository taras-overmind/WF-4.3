package com.App;

public class Rectangular_triangle extends Triangle{

    public Rectangular_triangle(double side1, double side2) {
        super(side1, side2, Math.PI/2);
    }

    @Override
    double calcPerimeter() {
        double side3=Math.sqrt(side1*side1+side2*side2);
        return side1+side2+side3;
    }
    double calcSquare() {
        return 0.5*side1*side2;
    }
}
