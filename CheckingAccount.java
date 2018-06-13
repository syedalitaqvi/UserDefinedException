package com.hackercode.utilities;

import com.hackercode.UserDefinedExceptions.InsufficientFundsException;

public class CheckingAccount {

    private double balance;
    private int number;

    public CheckingAccount(int number){
        this.number=number;
    }

    public void deposit(double amount){
        this.balance+=amount;
    }
    public void withdraw(double amount) throws InsufficientFundsException {
        if(amount <= balance){
            balance-=amount;
        } else{
            double needs = amount-balance;
            throw new InsufficientFundsException(needs);
        }
    }

    public double getBalance(){
        return balance;
    }
    public int getNumber(){
        return number;
    }
}
