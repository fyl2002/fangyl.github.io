package com.lingqiantong;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

//1. 先完成显示菜单，可以进行选择
//2. 完成零钱通明细的功能
//3. 完成收益入账
//4. 完成消费入账(消费说明--具体消费的地址等)
//5. 退出项的改进：输入4 ，先询问是否退出y/n，否则循环指令
//6. 判断收益和消费金额是否合理 2 和3 中
public class SmallChanageSys {
    public static void main(String[] args) {
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
        //dowhile至少显示一次
        do {
            System.out.println("============零钱通菜单============");

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
                        System.out.println(detail + "\n");
                    break;
                case "2":
                    System.out.print("收益入账金额: ");

                    money = scanner.nextDouble();
                    //对money判断合理性如小数位数，没有字母
                    //1.判断是否大于0
                    if(money < 0) {
                        System.out.println("金额不对");
                        break;
                    }

                    balance += money;
                    date = new Date();//当前时间
//                    System.out.println(sdf.format(date));//自定义格式方法
                    detail += "\n" + "收益入账金额: " + money
                            + " 日期" + sdf.format(date) + " 余额" + balance;
                    break;

                case "3":
                    //先输入地址后输入消费金额
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
                        break;
                        //判断余额和消费的大小
                    }else if (balance - money <= 0){
                        System.out.println("余额不足,你的最大消费余额不得超过" + balance + "元");
                        break;
                    }
                        balance -= money;
                        detail += "\n" + discribe + "\t" + (-money)
                                + " 日期" + sdf.format(date) + " 余额" + balance;
                        break;

                    //退出项的改进：输入4 ，先询问是否退出y/n，否则循环指令
                    //思路，先判断是否为y/n，用while循环，再判断y n
                case "4":
                    System.out.println("是否确认退出？y/n");

                    //定义外部输入y/n变量
                    String getout;
//
//                    getout = scanner.next();
                    while (true) {
                        System.out.println("请输入");

                        getout = scanner.next();
                        if ("y".equals(getout) || "n".equals(getout)) {
                            break;
                        }
                    }
                    if (getout.equals("y")) {
                        temp = false;
                    }
                    break;
                default:
                    System.out.println("输入数字错误");
            }


        } while (temp);

        System.out.println("选择退出项目");

    }
}
class Person {

}
