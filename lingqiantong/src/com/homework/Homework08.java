package com.homework;

//父类Person类，属性：名称 性别 年龄
//子类 Student类 Teacher类
//stu中有学习的方法
//tea中有教学的方法

public class Homework08 {
    public static void main(String[] args) {
        //定义一个空值接受冒泡中的变量
        Person1 temp = null;
        //变量保存xx的信息
        String infro = "的信息";
        Person1[] person1s = new Person1[4];
        person1s[0] = new Student1("fyl", '男', 20, "2021102402");
        person1s[1] = new Student1("zyy", '女', 18, "2021102403");
        person1s[2] = new Teacher1("zyr", '女', 38, "2021102404");
        person1s[3] = new Teacher1("zwy", '女', 21, "2021102405");
        for (int i = 0; i < person1s.length - 1; i++) {
            for (int j = 0; j < person1s.length - 1 - i; j++) {
                if (person1s[j].getAge() < person1s[j + 1].getAge()) {
                    temp = person1s[j];
                    person1s[j] = person1s[j + 1];
                    person1s[j + 1] = temp;

                }

            }

        }

        //排序结束，输出
        for (int i = 0; i < person1s.length; i++) {

            if (person1s[i] instanceof Teacher1) {
                System.out.println("老师" + infro);
                System.out.println(person1s[i].say());
                System.out.println(person1s[i].play());
                ((Teacher1) person1s[i]).teach();//向下
                System.out.println("----------------------");

            }
            if (person1s[i] instanceof Student1) {
                System.out.println("学生" + infro);
                System.out.println(person1s[i].say());
                System.out.println(person1s[i].play());
                ((Student1) person1s[i]).study();
                System.out.println("----------------------");
            }

        }

//    public void text(Person1 p) {
//        Homework08 homework08 = new Homework08();
//        if (p instanceof Teacher1) {
//            ((Teacher1) p).teach();
//        } else if (p instanceof Student1) {
//            ((Student1) p).study();
//        }
//    }

    }
}

class Person1 {
    private String name;
    private char gender;
    private int age;



    public Person1(String name, char gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String play() {
        return getName() + "爱玩";
    }

    public String say() {
        return name + "\n" + gender + "\n" + age;
    }

}

class Student1 extends Person1 {
    private String studentNum;

    public Student1(String name, char gender, int age, String studentNum) {
        super(name, gender, age);
        this.studentNum = studentNum;
    }

    public String getStudentNum() {
        return studentNum;
    }

    public void setStudentNum(String studentNum) {
        this.studentNum = studentNum;
    }

    public void study() {
        System.out.println("我承诺我好好学");
    }

    @Override
    public String play() {
        return super.play() + "足球";
    }

    @Override
    public String say() {
        return super.say() + studentNum;
    }

    //编写输出的方法
//    public void printInfo() {
//        System.out.println("学生" + super.infro);
//        System.out.println(say());
//        System.out.println(play());



    }

class Teacher1 extends Person1 {
        private String teacherNum;

        public Teacher1(String name, char gender, int age, String teacherNumNum) {
            super(name, gender, age);
            this.teacherNum = teacherNumNum;
        }


        public String getStudentNum() {
            return teacherNum;
        }

        public void setStudentNum(String studentNum) {
            this.teacherNum = teacherNum;
        }

        public void teach() {
            System.out.println("我承诺我好好教书");
        }

        @Override
        public String play() {
            return super.play() + "象棋";
        }

        @Override
        public String say() {
            return super.say() + teacherNum;
        }

    //    public void printInfo() {
    //        System.out.println("老师" + super.infro);
    //        System.out.println(say());
    //        System.out.println(play());
    }


