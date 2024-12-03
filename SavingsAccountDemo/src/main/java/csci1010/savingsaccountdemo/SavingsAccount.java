/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package csci1010.savingsaccountdemo;

/**
 *
 * @author Matt Hammond
 */
public class SavingsAccount {
    private double balance; //instance variable
    private static double interestRate = 0;
    private static int numberOfAccounts = 0;
    
    // constructor
    public SavingsAccount(){
        balance = 0;
        numberOfAccounts++;
    }
    
    public void deposit(double amount){
        balance = balance + amount; 
    }
    
    public double withdraw (double amount){
        if (balance >= amount)
            balance = balance - amount;
        else {
            amount = 0;
        }
        return amount;
    }
    
    public void addInterest(){
        double interest = balance * interestRate;
        balance = balance + interest;
    }
    // reference SavingsAccount allowes static to access info
    public static void showBalance(SavingsAccount account) {
        System.out.printf("%.2f", account.getBalance());
    }
    
    public double getBalance() {
        return balance;
    }

    public static double getInterestRate() {
        return interestRate;
    }

    public static int getNumberOfAccounts() {
        return numberOfAccounts;
    }
    
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static void setInterestRate(double interestRate) {
        SavingsAccount.interestRate = interestRate;
    }

    public static void setNumberOfAccounts(int numberOfAccounts) {
        SavingsAccount.numberOfAccounts = numberOfAccounts;
    }
    
    
    
}
