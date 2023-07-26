package com.qa;

public class Main {
    public static void main(String[] args) {
        Rectangle firstRectangle = new Rectangle("Recty", "blue", 1.1, 2, 2, 1);
        Rectangle secondRectangle = new Rectangle("Anglo", "red", 1.1, 2, 7, 1);
        System.out.println(firstRectangle);
        System.out.println(secondRectangle);
        System.out.println(firstRectangle.getArea());
        System.out.println(secondRectangle.getArea());
        System.out.println(firstRectangle.getCenterPoint());
        System.out.println(secondRectangle.getCenterPoint());

        //circles
        Circle firstCircle = new Circle("Circle", "blue", 1.1, 2, 5.1);
        Circle secondCircle = new Circle("Circley", "red", 1.1, 2, 6.8);
        System.out.println(firstCircle);
        System.out.println(secondCircle);
        System.out.println(firstCircle.getArea());
        System.out.println(secondCircle.getArea());
        System.out.println(firstCircle.getCenterPoint());
        System.out.println(secondCircle.getCenterPoint());


    }
}
