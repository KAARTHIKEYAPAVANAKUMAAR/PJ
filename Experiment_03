/*Create class SavingsAccount. Use a static variable annualInterestRate to store the annual interest rate for all account holders.

Each object of the class contains a private instance variable savingsBalance indicating the amount the saver currently has ondeposit.

Provide method calculateMonthlyInterest to calculate the monthly interest by multiplying the savingsBalance by annualInterestRate divided by 12 this interest should be added to savingsBalance.

Provide a static method modifyInterestRate that sets the annualInterestRate to a new value.

Write a program to test class SavingsAccount. Instantiate two savingsAccount objects, saver1 and saver2, with balances of $2000.00 and $3000.00, respectively. Set annualInterestRate to 4%, then calculate the monthly interest and print the new balances for both savers. Then set the annualInterestRate to 5%, calculate the next month’s interest and print the new balances for both savers.*/


class SavingsAccount {
    static double annualInterestRate = 0;
    private double savingsBalance;
    
    // Constructor
    public SavingsAccount (double savingsBal)
    {
        savingsBalance = savingsBal;
    }
    
    public double calculateMonthlyInterest()
    {
        double montlyInterset = (savingsBalance * annualInterestRate) / 2;
        savingsBalance += montlyInterset;
        return savingsBalance;
    }
    
    public static void modifyInterestRate(double interestRate)
    {
        annualInterestRate = interestRate;
    }
}

public class Experiment_03 {
    public static void main(String[] args) {
        SavingsAccount saver1 = new SavingsAccount(2000.00);
        SavingsAccount saver2 = new SavingsAccount(3000.00);
    
        saver1.modifyInterestRate(0.04);
    
        // new balances
        System.out.println("Balance of saver1: " + saver1.calculateMonthlyInterest());
        System.out.println("Balance of saver2: " + saver2.calculateMonthlyInterest());
    
        saver1.modifyInterestRate(0.05);
    
        // new balances
        System.out.println("Balance of saver1: " + saver1.calculateMonthlyInterest());
        System.out.println("Balance of saver2: " + saver2.calculateMonthlyInterest());
    }
}


