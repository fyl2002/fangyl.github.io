package com.fangwuchuzu.domain;

public class House {
    /*
    存储房屋的信息
    domain实体类
    一个对象表示一个房屋信息
    house类的属性可以通过页面来分析
    至少需要编号、房主、电话、地址、月租、目前出租状态的属性
     */
    private int id;
    private String name;
    private int phoneNum;
    private String address;
    private int rent;
    private String state;

    //构造器

    public House(int id, String name, int phoneNum, String address, int rent, String state) {
        this.id = id;
        this.name = name;
        this.phoneNum = phoneNum;
        this.address = address;
        this.rent = rent;
        this.state = state;
    }

    //setter and getter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(int phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getRent() {
        return rent;
    }

    public void setRent(int rent) {
        this.rent = rent;
    }

    public String  getState() {
        return state;
    }

    public void setState(String  state) {
        this.state = state;
    }

    //为了方便输出对象信息，重写tostring方法

    @Override
    public String toString() {
        return   id +
                "\t" + name +
                "\t" + phoneNum +
                "\t" + address +
                "\t" + rent +
                "\t" + state;
    }
}
