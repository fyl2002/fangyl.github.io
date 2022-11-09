package com.fangwuchuzu;

import com.fangwuchuzu.service.HouseService;
import com.fangwuchuzu.view.HouseView;

/*
房屋出租系统
功能：新建房源、查找房屋、删除房屋、修改房屋信息、房屋列表、退出
分层模式

程序框架图：系统有哪些类、类与类之间的调用关系
 */
public class HouseRentApp {
    /*
    调用main对象
    显示主菜单，程序入口

    顺序：先完成house的实体类，并重写tostring方法用来输出属性
    再实现打开软件，看到主菜单，可以退出软件----view类
    再实现输出房屋列表list，通过定义House数组并对数组长度赋值得出
    再实现接收外部输入，通过addlist接收service中的boolean值判断数组是否已满
    再完成删除房源部分
    再完善退出机制
    再完成房屋查找功能
    最后完成修改功能
     */

    //调用houseservice类的方法
    public static void main(String[] args) {
        new HouseView().mainMenu();
        System.out.println("------------你退出了房屋系统------------");



    }

}
