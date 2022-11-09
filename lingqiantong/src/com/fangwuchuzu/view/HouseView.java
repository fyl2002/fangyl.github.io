package com.fangwuchuzu.view;

import com.fangwuchuzu.domain.House;
import com.fangwuchuzu.service.HouseService;
import com.fangwuchuzu.util.Utility;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class HouseView {
    /*
    显示界面,mainmenu方法
    接受用户输入
    接收其它类的各种操作，调用houseservice完成
    主要是界面层
     */
    //功能：打开软件，看到主菜单，可以退出软件

    //对于退出时要终止循环，因此需要变量接收boolean
    private boolean loop = true;
    //接受外部输入，控制Switch分支的变量
    //Scanner scanner = new Scanner(System.in);旧方法
    private int input;

    //删除编号的变量
    private int delNum;
    //确认删除的变量
    private char confirm;
    //确认退出的变量
    private char out;
    //查找的变量
    private int findNum;
    //修改编号的变量
    private int changeNum;

    HouseService houseService = new HouseService(5);//调用构造器


    //ListView方法接收service中的房屋信息 5
    public void ListView() {
        System.out.println("---------------房屋列表---------------");
        System.out.println("编号\t房主\t电话\t\t\t地址\t\t月租\t\t目前出租状态");
        House[] houses = houseService.list();//调用list方法，用一个数组接收
        for (int i = 0; i < houses.length; i++) {//可能加入的数组没有达到数组长度，因此后面的内容为null，需要处理
            if (houses[i] == null){
                break;//因为在House类中重写了tostring方法 可以直接默认调用
            }
            System.out.println(houses[i].toString());
        }
    }


    //AddView接收用户输入 1
    public void AddView() {
        System.out.println("---------------添加房屋---------------");
        System.out.print("姓名：");
        String name = Utility.readString(6);
        System.out.print("电话：");
        int phoneNum = Utility.readInt(8);
        System.out.print("地址：");
        String address = Utility.readString(6);
        System.out.print("月租: ");
        int rest = Utility.readInt(8);
        System.out.println("目前出租状态: (默认未出租)");
        String state = Utility.readString(3,"未出租");
        House newHouse = new House(0, name, phoneNum, address, rest, state);//调用构造器,
        //传参后House类通过HouseSer接收，通过list方法返回给ListView中
        if (houseService.add(newHouse)) {
            System.out.println("---------------添加成功---------------");
        }else{
            System.out.println("---------------添加失败---------------");
        }
    }

    //DelView接收用户删除 2
    public void DelView() {
        System.out.println("---------------删除房屋---------------");
        System.out.println("请选择待删除的房屋编号，退出请输入-1");
        delNum = Utility.readInt(-1);
        if (delNum == -1) {
            System.out.println("取消删除记录");
            return;
        }
//        System.out.println("请确认是否删除，y/n？");
        confirm = Utility.readConfirmSelection();//方法必须输入y/n
        if (confirm == 'N') {
            System.out.println("放弃删除信息");
        }
            //两次都确认要删除，调用homeservice的删除的方法
            if(houseService.del(delNum)){
                System.out.println("---------------删除房屋成功---------------");
            }else{
                System.out.println("---------------删除房屋失败---------------");
            }

    }

    //房屋查找的功能FindView 4
    public void FindView() {
        System.out.println("---------------查找房屋---------------");
        System.out.println("请输入你要查找的编号：");
        findNum = Utility.readInt(1);
        House house = houseService.Find(findNum);//Find方法返回一个数组中的一个元素，house是他的对象名，编译类型为House
        //带有属性
        if(house != null){
            System.out.println("---------------查找成功---------------");
            System.out.println(house);
        }else{
            System.out.println("---------------查找失败，无结果---------------");
        }
    }

    //房屋修改功能ChangeView 3
    public void ChangeView() {
        System.out.println("---------------修改房屋---------------");
        System.out.println("请选择需要修改的编号 -1退出");//如果没有编号就要退出方法
        changeNum = Utility.readInt();
        if (changeNum == -1) {
            System.out.println("---------------退出修改---------------");
            return;
        }
        House change = houseService.Change(changeNum);
//        System.out.println(change);
        //此时change是数组的一个元素，由于编译类型为Home，可以通过get方法获取属性
        if (change != null){
            System.out.print("姓名(" + change.getName() + ")");
            String name = Utility.readString(5,"");
            //如果不是和原来的name变量一致
            if (!"".equals(name)){
                change.setName(name);
            }

            System.out.print("电话(" + change.getPhoneNum() + ")");
            int num = Utility.readInt(change.getPhoneNum());
            if (change.getPhoneNum() != num) {
                change.setPhoneNum(num);
            }

            System.out.print("地址(" + change.getAddress() + ")");
            String add = Utility.readString(5,"");
            if (!"".equals(add)) {
                change.setAddress(add);
            }
            System.out.print("租金(" + change.getRent() + ")");
            int rent = Utility.readInt(change.getRent());
            if (change.getRent() != rent) {
                change.setRent(rent);
            }

            System.out.print("状态(" + change.getState() + ")");
            String state = Utility.readString(3,"未租出");
            if (!"".equals(state)) {
                change.setState(state);
            }
//        House house1 = new House(changeNum,name,num,add,rent,state);
//        //想法：house1为更改后的数据，
//        System.out.println(house1);
            System.out.println("---------------修改完成---------------");
        }else {
            System.out.println("找不到相关编号");
        }

    }



//    public static void main(String[] args) {
//
//    }

    public void mainMenu() {
        //主菜单界面
        //因为不退出就要一直显示，所以用dowhile

        do {
            System.out.println("---------------房屋系统---------------");
            System.out.println("\t\t\t" + "1 新 增 房 源");
            System.out.println("\t\t\t" + "2 查 找 房 屋");
            System.out.println("\t\t\t" + "3 删 除 房 屋");
            System.out.println("\t\t\t" + "4 修 改 房 屋 信 息");
            System.out.println("\t\t\t" + "5 房 屋 列 表");
            System.out.println("\t\t\t" + "6 退 出");
            System.out.println("请输入你要查询的数字：1-6");
//            int input = scanner.nextInt();
            input = Utility.readInt();
            //switch分支控制

            switch (input) {
                case 1 :
                    AddView();
                    break;
                case 2 :
                    FindView();
                    break;
                case 3 :
                    DelView();
                    break;
                case 4 :
                    ChangeView();
                    break;
                case 5 :
                    System.out.println("房屋列表");
                    ListView();
                    break;
                case 6 :
                    System.out.println("是否确定退出");
                    out = Utility.readConfirmSelection();
                    if (out == 'Y') {
                        loop = false;
                    }
                    break;
                default:
                    System.out.println("输入错误，请输入1-6");


            }
        }while(loop);


    }


}


