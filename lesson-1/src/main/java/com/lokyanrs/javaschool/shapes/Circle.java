package com.lokyanrs.javaschool.shapes;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this(null, radius);
    }

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateSquare() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}
