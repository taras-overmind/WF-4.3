package com.App;
public class Isosceles_triangle extends Triangle{

    public Isosceles_triangle(double side1, double angle_rad) {
        super(side1, side1, angle_rad);
    }

    @Override
    double calcPerimeter() {
        double side3= Math.sqrt(2*side1*side2*(1-Math.cos(angle_rad)));
        return side1+side2+side3;
    }

    @Override
    double calcSquare() {
        return 0.5*side1*side1*Math.sin(angle_rad);
    }
}
