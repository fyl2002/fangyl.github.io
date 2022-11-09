package com.fangwuchuzu.service;

import com.fangwuchuzu.domain.House;

public class HouseService {
    /*
    相应Main类的操作
    完成对房屋的信息各种操作(增删改查)
    crud(create read update delete)
    业务层
     */
    //功能：创建一个数组保存house中的对象

    //定义一个变量记录当前有几条记录
    public int houseNum = 0;//如果没有测试记录，一开始应该为零条

    //定义一个id计数器
    int idCounter = 0;
    private House[] houses;//默认为空，通过构造器赋值

    public HouseService(int size) {
        houses = new House[size];//创建houseservice时指定数组大小
//        houses[0] = new House(1,"方块",13392386,"虎门镇",2000,"未租出");
    }


    //返回数组信息
    public House[] list() {
        return houses;
    }

    //创建一个方法add(House newHouse)把新的house对象加入数组中
    //添加新对象，判断数组是否已满，返回boolean
    public boolean add(House newHouse) {
        if (houseNum == houses.length) {
            System.out.println("已满,不可添加");
            return false;
        }//把新添加的加到最后
        houses[houseNum++] = newHouse;//调用加入数据后没有存到房屋列表的原因：
        //下标没有对应，如houseNum为1时对应的是第二个数据，如果输入的是第一个数据，会进入listview中的for循环当空值处理
        //设计id自增长机制
        newHouse.setId(++idCounter);
        return true;
    }

    //delete方法，删除一个房屋信息，返回布尔值
    public boolean del(int confirm) {
        int index = -1;//index记录删除i
        for (int i = 0; i < houseNum; i++) {
            if (confirm == houses[i].getId()) {
                index = i;
            }
        }
        //如果没找到，返回false
        if (index == -1) {
            return false;
        }
        //如果找到了，index改变
        houses[index] = null;
        for (int i = index; i < houseNum - 1; i++) {
            houses[i] = houses[i + 1];
        }
        houses[--houseNum] = null;
        return true;


        //删除的编号为下标+1

    }

    //查找方法
    public House Find(int findNum) {
        for (int i = 0; i < houses.length; i++) {

        if (findNum == houses[i].getId()){
            return houses[i];
        }
    }return null;
    }

    //修改的方法：用来先返回具体对应的编号
    public House Change(int changeNum) {
        for (int i = 0; i < houses.length; i++) {

            if (changeNum == houses[i].getId()){
                return houses[i];
            }else{//将id不相等的值也返回，否则会异常
                return null;
            }
        }return null;
    }
}


