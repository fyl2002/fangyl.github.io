package com.homework;
//老师类teacher，属性name age post salary
//业务方法 introduce，输出老师信息
//编写老师类的三个子类：教授、副教授、讲师，工资级别为1.3/1.2/1.1 重新编写introduce方法
//初始化一个老师对象，调用业务方法

public class Homework03 {
    public static void main(String[] args) {
//        Professor teacher = new Professor();

    }
}

class Teacher {
    private int age;
    private String name;
    private String post;
    private String salary;

    public Teacher(int age, String name, String post, String salary) {
        this.age = age;
        this.name = name;
        this.post = post;
        this.salary = salary;

    }

    public void introduce() {
        System.out.println("名字是" + name + "年龄为" + age + "职位是" + post + "薪水是" + salary);


    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }
}

class Professor extends Teacher {
    double salary_level;
    public Professor(int age, String name, String post, String salary ,double salary_level) {
        super(age, name, post, salary);

    }

    @Override
    public void introduce() {
        System.out.println("这是教授的信息");
        super.introduce();
    }
}