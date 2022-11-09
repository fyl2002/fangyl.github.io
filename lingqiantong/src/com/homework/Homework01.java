package com.homework;
//定义一个Person类，name job age，初始化对象数组，有三个person对象，按照age从大到小排序
//冒泡
public class Homework01 {
    public static void main(String[] args) {
        Person[] person = new Person[3];
        person[0] = new Person(30,"niu","程序员");
        person[1] = new Person(40,"zhu","厨师");
        person[2] = new Person(50,"gou","工程师");
        Person temp = null;
        for (int i = 0; i < person.length - 1; i++) {
            for (int j = 0; j < person.length - i - 1; j++) {
                if(person[j].getAge() < person[j+1].getAge()){//getname也能比较
                    //这里要注意内层循环中if中应该为j，因为j++对应了前后的比较，如果是i，j中的每一次比较都只作用于第一二个
                    temp = person[j];
                    person[j]= person[j+1];
                    person[j+1]=temp;
                }
            }
            
        }
        for (int i = 0; i < person.length; i++) {
            System.out.println(person[i].say());
        }

    }
}

class Person {
    int age;
    String name;
    String job;

    public Person(int age, String name, String job) {
        this.age = age;
        this.name = name;
        this.job = job;
    }
    public String say() {
        return age + " " + name + " " + job;
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

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
