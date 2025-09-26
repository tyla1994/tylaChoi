package com.javaTest;

//编写一个Java程序，要求：
//创建一个名为 Rectangle 的类
//在类中定义两个属性：width（宽度）和 height（高度）
//创建一个方法 calculateArea() 来计算并返回矩形的面积
//在 main 方法中创建 Rectangle 对象，设置宽度和高度，然后调用方法计算面积

public class Rectangle {
    private double width;
    private double height;

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void getWidth() {
        System.out.println("宽度是：" + width);
    }

    public void getHeight() {
        System.out.println("高度是：" + height);
    }

    public void calculateArea(double width, double height){
        System.out.println("面积是：" + width * height);
    }

    public double calculateArea1(double width,double height){
        return width * height;
    }

    public double calculateArea2() {
        return this.width * this.height;
    }
}
