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


    }
}
