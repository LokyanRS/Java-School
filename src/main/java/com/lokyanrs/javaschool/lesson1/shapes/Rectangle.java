package com.lokyanrs.javaschool.lesson1.shapes;

public class Rectangle extends Shape {
    private double x;
    private double y;

    public Rectangle(double x, double y) {
        this(null, x, y);
    }

    public Rectangle(String color, double x, double y) {
        super(color);
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public boolean isSquare() {
        return Double.compare(x, y) == 0;
    }

    @Override
    public double calculateSquare() {
        return x * y;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * x + 2 * y;
    }
}
