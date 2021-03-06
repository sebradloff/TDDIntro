package com.thoughtworks.accountbalance;


/**
 * Created by sebass on 2/25/15.
 */
public class Account {
    private double balance;

    public Account(double startingBalance){
       balance = startingBalance;
    }

    public void depositMoney(double money){
        this.balance += money;
    }

    public void withdrawMoney(double money){
        double tempBalance = this.balance;
        if (!((tempBalance -= money) < 0)){
            this.balance = tempBalance;
        }
    }

    public double getBalance(){
        return this.balance;
    }


}
