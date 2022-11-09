package com.lingqiantong;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
主方法，完成各个功能的类
功能表，将各个功能对应方法
//1. 先完成显示菜单，可以进行选择
//2. 完成零钱通明细的功能
//3. 完成收益入账
//4. 完成消费入账(消费说明--具体消费的地址等)
//5. 退出项的改进：输入4 ，先询问是否退出y/n，否则循环指令
//6. 判断收益和消费金额是否合理 2 和3 中
 */
public class SmallChangeOop {
    //属性

        //是否还要循环的值
        //第一步
        Scanner scanner = new Scanner(System.in);
        //n为接受用户输入数字的变量
        String n;
        //对应的1
        String detail = "\n============零钱通明细============";
        //对应的3
        double money = 0;
        double balance = 0;
        //调用date库
        Date date = null;
        //日期格式化
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        boolean temp = true;

        public void mainMenu() {
        //显示菜单功能
        do {
            System.out.println("============选择零钱通菜单============");

            System.out.println("\t\t" + 1 + " " + "零钱通明细" + "\t\t\t");
            System.out.println("\t\t" + 2 + " " + "收益入账" + "\t\t\t");
            System.out.println("\t\t" + 3 + " " + "消费" + "\t\t\t");
            System.out.println("\t\t" + 4 + " " + "退出" + "\t\t\t");
            System.out.println("请输入1-4：");
            n = scanner.next();
            System.out.println();
            //System.out.println("============零钱通明细============");
            //用Switch结构来分支n输入对应功能
            switch (n) {
                case "1":
                    //this.方法名访问成员方法
                    this.detail();
                    break;
                case "2":
                    this.income();
                    break;
                case "3":
                    this.pay();
                    break;
                case "4":
                    this.out();
                    break;
                default:
                    System.out.println("输入数字错误");
            }


        } while (temp);


    }

    public void detail() {
        System.out.println(detail + "\n");
    }

    public void income() {//收益
        System.out.print("收益入账金额: ");

        money = scanner.nextDouble();
        //对money判断合理性如小数位数，没有字母
        //1.判断是否大于0
        if(money < 0) {
            System.out.println("金额不对");
            //break; break 用在循环中
            return;
        }

        balance += money;
        date = new Date();//当前时间
//                    System.out.println(sdf.format(date));//自定义格式方法
        detail += "\n" + "收益入账金额: " + money
                + " 日期" + sdf.format(date) + " 余额" + balance;

    }


    public void pay() {//消费
        System.out.print("请输入消费地址：");
        //describe指的是在哪里消费
        String discribe;
        discribe = scanner.next();
        System.out.print("支出金额：");
        money = scanner.nextDouble();
        date = new Date();//当前时间
        //对money判断
        if(money < 0) {
            System.out.println("金额不对");
            return;
            //判断余额和消费的大小
        }else if (balance - money <= 0){
            System.out.println("余额不足,你的最大消费余额不得超过" + balance + "元");
            return;
        }
        balance -= money;
        detail += "\n" + discribe + "\t" + (-money)
                + " 日期" + sdf.format(date) + " 余额" + balance;

    }

    public void out(){//退出
        System.out.println("是否确认退出？y/n");

        //定义外部输入y/n变量
        String getout;
//
//                    getout = scanner.next();
        while (true) {
            System.out.println("请输入正确的字母"); 
            getout = scanner.next();
            if ("y".equals(getout) || "n".equals(getout)) {
                break;
            }
        }
        if (getout.equals("y")) {
            temp = false;
        }

    }

}
