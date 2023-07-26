package com.qa;

public class Rectangle extends Shape{
    private double height;
    private double width;
    public Rectangle(String name, String color, double x, double y, double height, double width) {
        super(name, color, x, y);
        this.height = height;
        this.width = width;    }


    @Override
    double getArea() {
        return width * height;
    }

    @Override
    Point getCenterPoint() {
        return new Point(getX() + (width * 0.5), getY() + (height * 0.5));
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "height=" + height +
                ", width=" + width +
                ", area=" + getArea() +
                ", centerpoint=" + getCenterPoint() +
                '}';
    }

    public boolean isSquare(){
        return height == width;
    }
}
