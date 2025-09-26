package com.example.indeed;



public class Triangle extends Shape {
    private double base;
    private double height;

    String color = "red";

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (base * height) / 2;
    }

    @Override
    public String toString() {
        return "Triangle with base " + base + " and height " + height;
    }
}

