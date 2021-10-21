package com.App;
public abstract class Triangle {
    protected double side1, side2, angle_rad;

    public Triangle(double side1, double side2, double angle_rad) {
        this.side1 = side1;
        this.side2 = side2;
        this.angle_rad = angle_rad;
    }
    double calcPerimeter(){
        double side3 = Math.sqrt(side1*side1+side2*side2-2*side1*side2*Math.cos(angle_rad));
        return side1+side2+side3;
    }
    double calcSquare() {
        return 0.5 * side1 * side2 * Math.sin(angle_rad);
    }
}
