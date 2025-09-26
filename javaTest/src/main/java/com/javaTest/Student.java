package com.javaTest;

/***
题目描述
编写一个Java程序，要求：
创建一个名为 Student 的类
在类中定义以下属性：
name（学生姓名）
studentId（学号）
score（成绩）
创建以下方法：
setInfo() 方法用于设置学生信息
getInfo() 方法用于获取并显示学生信息
isPass() 方法判断学生是否及格（及格分数为60分）
在 main 方法中创建 Student 对象，设置学生信息并测试各方法
***/
public class Student {
    private String name;
    private String studentId;
    private double score;

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public void getInfo() {
        System.out.println("姓名：" + name + "，学号：" + studentId + "，成绩：" + score);
    }

    public void setInfo(String name, String studentId,double score){
        this.name = name;
        this.studentId = studentId;
        this.score = score;
    }

//    public boolean isPass(){
    public void isPass(){
        if(score >= 60){
            System.out.println("通过");
        }else {
            System.out.println("未通过");
        }
    }
}
