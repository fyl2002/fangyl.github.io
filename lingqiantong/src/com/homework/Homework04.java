package com.homework;

import com.sun.org.apache.bcel.internal.generic.NEW;

//继承实现员工工资核算打印
//父类：员工类
//员工类属性：name 天数 单日工资
//员工方法：打印工资
//子类：部门经理类，普通员工类，重写打印工资
//部门经理：1000+单日工资*天*等级(1.2)
//普通员工：单日工资*天*等级(1.0)
public class Homework04 {
    public static void main(String[] args) {
        CommonWorker worker = new CommonWorker(5,200,"fang",1.0);
        Manner manner = new Manner(5,2000,"kuai",1.2);
        worker.printSal();
        manner.printSal();

    }
}

class Worker {
    int day;
    double salary;
    String name;

    public Worker(int day, double salary, String name) {
        this.day = day;
        this.salary = salary;
        this.name = name;

    }

    //方法
    public void printSal() {
        System.out.println("工资为： " + day * salary);
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class CommonWorker extends Worker {
    double grade;

    public CommonWorker(int day, double salary, String name, double grade) {
        super(day, salary, name);
        this.grade = grade;
    }

    @Override
    public void printSal() {
        System.out.println("工资为： " + day * salary * grade);
    }
}

class Manner extends Worker {
    double grade;

    public Manner(int day, double salary, String name, double grade) {
        super(day, salary, name);
        this.grade = grade;
    }

    @Override
    public void printSal() {
        int a = 1000;
        System.out.println("工资为： " + (day * salary * grade + a));
    }
}