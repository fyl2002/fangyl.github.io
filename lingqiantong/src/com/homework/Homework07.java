package com.homework;

import javax.print.Doc;

public class Homework07 {
    public static void main(String[] args) {
        Doctor doctor1 = new Doctor(11,"w","e",'男',25000);
        Doctor doctor2 = new Doctor(11,"w","e",'男',25000);
        Doctor doctor3 = new Doctor(111,"w","e",'男',25000);
        System.out.println(doctor1.equals(doctor2));
        System.out.println(doctor1.equals(doctor3));
    }
}

class Doctor {
    private int age;
    private String name;
    private String job;
    private char gender;
    private double salary;

    public Doctor(int age, String name, String job, char gender, double salary) {
        this.age = age;
        this.name = name;
        this.job = job;
        this.gender = gender;
        this.salary = salary;
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

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    //重写equals
    public boolean equals(Object obj) {//obj是传入的参数
        if (this == obj){
            return true;
        }if(!(obj instanceof Doctor)){
            return false;
        }
        Doctor doctor = (Doctor) obj;
        return this.name.equals(doctor.name) && this.age == doctor.age &&
                this.gender == doctor.gender && this.salary == doctor.salary &&
                this.job.equals(doctor.job);


    }
}
