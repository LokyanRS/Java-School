package com.lokyanrs.javaschool.lesson1.shapes;

public class Triangle extends Shape {
    private double sideOne;
    private double sideTwo;
    private double sideThree;

    public Triangle(double sideOne, double sideTwo, double sideThree) {
        this(null, sideOne, sideTwo, sideThree);
    }

    public Triangle(String color, double sideOne, double sideTwo, double sideThree) {
        super(color);
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
        this.sideThree = sideThree;
        if (!isValid())
            throw new IllegalStateException("Некорректные стороны треугольника");
    }

    public double getSideOne() {
        return sideOne;
    }

    public void setSideOne(double sideOne) {
        this.sideOne = sideOne;
    }

    public double getSideTwo() {
        return sideTwo;
    }

    public void setSideTwo(double sideTwo) {
        this.sideTwo = sideTwo;
    }

    public double getSideThree() {
        return sideThree;
    }

    public void setSideThree(double sideThree) {
        this.sideThree = sideThree;
    }

    public boolean isValid() {
        return (sideOne > 0) &&
                (sideTwo > 0) &&
                (sideThree > 0) &&
                (sideOne + sideTwo > sideThree) &&
                (sideOne + sideThree > sideTwo) &&
                (sideThree + sideTwo > sideOne);
    }

    @Override
    public double calculateSquare() {
        double p = calculatePerimeter() / 2;
        return Math.sqrt(p * (p - sideOne) * (p - sideTwo) * (p - sideThree));
    }

    @Override
    public double calculatePerimeter() {
        return sideOne + sideTwo + sideThree;
    }
}
