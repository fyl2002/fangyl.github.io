package com.homework;

public class Homework05 {
    public static void main(String[] args) {
        Grand1 grand1 = new Grand1();
        System.out.println(grand1.name);
        grand1.fangWen();
    }
}
class Grand {
    String name = "AA";

}
class Grand1 extends Grand {
    String name = "BB";
    public void fangWen() {
        System.out.println(super.name);
    }
}