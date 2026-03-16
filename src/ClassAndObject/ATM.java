package com.gla.ClassAndObject;

import java.util.Scanner;

class BankAccount{
    String AccountHolder;
    int AccountNumber;
    double Balance;
    public void Input(){
        Scanner sc=new Scanner(System.in);
        AccountHolder=sc.next();
        AccountNumber=sc.nextInt();
        Balance=sc.nextDouble();
    }
    public void Deposit(){
        Scanner s=new Scanner(System.in);
        double amount =s.nextDouble();
        Balance=Balance+amount;
    }
    public void Withdraw(){
        Scanner s=new Scanner(System.in);
        double with=s.nextDouble();
        if(with<=Balance){
            Balance=Balance-with;
            System.out.println("Withdraw Successful");
        }
        else{
            System.out.println("Insufficient Balance");
        }
    }
    public void Display(){
        System.out.println(AccountHolder);
        System.out.println(AccountNumber);
        System.out.println(Balance);
    }
}
public class ATM {
    static void main(String[] args) {
        BankAccount b=new BankAccount();
        b.Input();
        b.Deposit();
        b.Withdraw();
        b.Display();
    }
}
