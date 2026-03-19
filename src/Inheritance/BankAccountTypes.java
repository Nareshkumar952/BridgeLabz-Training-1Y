package com.gla.Inheritance;
class BankAccount{
    int AccNumber;
    double balance;
    void di(){
        System.out.println(AccNumber+" "+balance);
    }
}
class SavingAcc extends BankAccount{
    double InterestRate;
    void dis(){
        System.out.println(InterestRate);
    }
}
class CheckingAcc extends BankAccount{
    double WithdrawalLimit;
    void display(){
        System.out.println(WithdrawalLimit);
    }
}
public class BankAccountTypes {
    static void main(String[] args) {
    SavingAcc s=new SavingAcc();
    s.dis();
    CheckingAcc h=new CheckingAcc();
    h.display();
}}