/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.question1;

/**
 *
 * @author chm
 */
public class SavingsAccount extends BankAccount{
    public SavingsAccount(int accountNumber, double balance){
        super(accountNumber,balance);
    }
    
    @Override
    public double calculateInterest(){
        double interestValue = getBalance()*(0.12);
        return interestValue;
    }
}
