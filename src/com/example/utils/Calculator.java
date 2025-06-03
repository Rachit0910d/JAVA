package com.example.utils;

import com.example.geometry.Circle;
import com.example.geometry.Rectangle;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Welcome to Area Calculator of Circle !\n ");

        Circle cir = new Circle(5.5);
        Rectangle rect = new Rectangle(1.1, 2.2);
        System.out.printf("The Area of the Circle is : %f\n", Math.PI * Math.pow(cir.radius, 2));

        System.out.printf("The Area of the Rectangle is : %f", (rect.length * rect.breadth));
    }
}
