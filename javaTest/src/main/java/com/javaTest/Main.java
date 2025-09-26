package com.javaTest;
import com.javaTest.test;

public class Main {
    public static void main(String[] args) {
//        test test = new test();
//        test.test();
        Rectangle rectangle = new Rectangle();

        rectangle.calculateArea(10,20);
        System.out.println("---------------------这是分界线-------------------------");
        double area = rectangle.calculateArea1(3,5);
        System.out.println("面积是:" + area);

//        double width = 2;
//        double height = 5;
        rectangle.getHeight();
        rectangle.getWidth();
        rectangle.setWidth(2);
        rectangle.setHeight(5);
        rectangle.getHeight();
        rectangle.getWidth();
        double area1 = rectangle.calculateArea2();
        System.out.println("面积是:" + area1);

    }
}