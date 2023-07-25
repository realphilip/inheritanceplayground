package com.qa;

abstract class Shape {
    private String name;
    private String color;
    private double x;
    private double y;

    public Shape(String name, String color, double x, double y) {
        this.name = name;
        this.color = color;
        this.x = x;
        this.y = y;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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

    @Override
    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", x=" + x +
                ", y=" + y +
                '}';
    }

    abstract double getArea();

    abstract Point getCenterPoint();
}
