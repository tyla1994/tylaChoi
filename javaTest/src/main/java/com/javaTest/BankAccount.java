package com.javaTest;

/****
 题目描述
 编写一个Java程序，要求：
 功能需求
 创建一个名为 BankAccount 的类
 在类中定义以下属性：
 accountNumber（账户号码）
 accountHolder（账户持有人姓名）
 balance（账户余额）
 创建以下方法：
 deposit(double amount) 方法用于存款操作
 withdraw(double amount) 方法用于取款操作（需检查余额是否充足）
 getBalance() 方法用于查询当前余额
 displayAccountInfo() 方法用于显示账户详细信息
 测试要求
 在 main 方法中创建 BankAccount 对象，测试存款、取款和查询余额等功能。
 **/
public class BankAccount {
    private long accountNumber;
    private String accountHolder;
    private double balance;

    public long setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
        return accountNumber;
    }

    public String setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
        return accountHolder;
    }

    public double setBalance(double balance) {
        this.balance = balance;
        return balance;
    }


    public double getBalance() {
        return balance;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setInfo(String accountHolder, long accountNumber,double  balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void displayAccountInfo() {
        System.out.println("账户信息：" + accountHolder + "，账户号码：" + accountNumber + "，账户余额：" + balance);
    }

    //用于存款操作
    public void deposit(String accountHolder, long accountNumber,double amount){
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance += amount;
//        return balance += amount;
        System.out.println("存款成功,账号：" + accountNumber + ", 姓名：" + accountHolder + "余额为：" + balance);
    }

    public double withdraw(double amount){
        if(balance >= amount){
             return balance -= amount;
        }

        System.out.println("余额不足");
        return balance;
    }
}
