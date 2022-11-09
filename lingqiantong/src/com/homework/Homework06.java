package com.homework;
//在此基础上增加：新类SavingsAccount每个月都有利息产生
//每个月有三次免手续查询，在earthMonthly方法重置交易计数
public class Homework06 {
    public static void main(String[] args) {
        SavingsAccount bankAccount = new SavingsAccount(1000,0,0.01);
        bankAccount.deposit(100);
        bankAccount.withdraw(101);
        bankAccount.withdraw(1);

        bankAccount.withdraw(1);
        bankAccount.earthMonthly();//重置
        System.out.println(bankAccount.getBalance());

    }

}
class BankAccount {
    private double balance;
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;

    }
    //存款
    public void deposit(double amount) {
        balance += amount;
    }

    //取款
    public void withdraw(double amount) {
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

}

class SavingsAccount extends BankAccount {
    private int count = 0;
    private double rate = 0.01;

    public SavingsAccount(double initialBalance, int count, double rate) {
        super(initialBalance);
        this.count = count;
        this.rate = rate;
    }

    //重写两个方法
    @Override
    public void deposit(double amount) {
        count += 1;
        if (count <= 3){
            super.deposit(amount);
        }else {
            super.deposit(amount-1);

        }
    }
    public void withdraw(double amount) {
        count += 1;
        if (count <= 3){
            super.withdraw(amount);
        }else {
            super.withdraw(amount+1);

        }
    }

    public int earthMonthly() {
        count -= 1;//防止格外调用
        super.deposit(getBalance() * rate);//表示把利息通过存款的方式加到balance里面
        return count = 0;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
}