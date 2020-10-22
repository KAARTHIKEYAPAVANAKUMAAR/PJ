/*Develop a Java application to generate Electricity bill. Create a class with the following members: Consumer no., consumer name, previous month reading, current month reading, and type of EB connection (i.e. domestic or commercial). Compute the bill amount using the following tariff.

If the type of the EB connection is domestic, calculate the amount to be paid as follows:

First 100 units - Rs. 1per unit, 101-200units - Rs. 2.50per unit

201 -500 units - Rs. 4per unit, >501 units - Rs. 6per unit.

If the type of the EB connection is commercial, calculate the amount to be paid as follows:

First 100 units - Rs. 2per unit, 101-200units - Rs. 4.50per unit

201 -500 units - Rs. 6per unit, >501 units - Rs. 7per unit*/

import java.lang.String;

public class Experiment_02 {
    
    // Instance varaibles
    private String consumerNo;
    private String consumerName;
    private int prevMonthReading;
    private int currMonthReading;
    private String typeConnection;
    
    // Constructor
    public Experiment_02 (String cNo, String cName, String typeCon, int prvMonthReading, int curMonthReading) {
        consumerNo = cNo;
        consumerName = cName;
        typeConnection = typeCon;
        prevMonthReading = prvMonthReading;
        currMonthReading = curMonthReading;
    }
    
    // Setters
    public void setConsumerNo(String cNo) {
        consumerNo = cNo;
    }
    
    public void setConsumerName(String cName) {
        consumerName = cName;
    }
    
    public void setTypeConnection(String typeCon) {
        typeConnection = typeCon;
    }
    
    public void setPrevMonthReading(int prvMonthReading) {
        prevMonthReading = prvMonthReading;
    }
    
    public void setCurrMonthReading(int curMonthReading) {
        currMonthReading = curMonthReading;
    }
    
    // Getters
    public String getConsumerNo() {
        return consumerNo;
    }
    
    public String getConsumerName() {
        return consumerName;
    }
    
    public String getTypeConnection() {
        return typeConnection;
    }
    
    public int getPrevMonthReading() {
        return prevMonthReading;
    }
    
    public int getCurrMonthReading() {
        return currMonthReading;
    }
    
    // Calculating Electricity bill based on type of EB typeConnection
    public double billAmount() {
        int units = currMonthReading - prevMonthReading;
        double amount = 0;
        if (typeConnection.toLowerCase().equals("domestic")) {
            if (units <= 100) {
                amount = units; 
            }
            else if (units <= 200) {
                amount = 100 + (units - 100) * 2.50;
            }
            else if (units <= 500) {
                amount = 100 + 100 * 2.50 + (units - 200) * 4;
            }
            else {
                amount = 100 + 100 * 2.50 + 300 * 4 + (units - 500) * 6;
            }
        }
        else {
            if (units <= 100) {
                amount = units * 2; 
            }
            else if (units <= 200) {
                amount = 100 + (units - 100) * 2.50;
            }
            else if (units <= 500) {
                amount = 100 * 2 + 100 * 4.50 + (units - 200) * 6;
            }
            else {
                amount = 100 * 2 + 100 * 4.50 + 300 * 4 + (units - 500) * 7;
            }
        }
        
        return amount;
    }
    
    // Driver Code 
    public static void main (String[] args) {
        Main m = new Main("19BQ1A05L5","KAARTHIKEYA", "Commercial", 5000, 5600);
        
        // Printing Details
        System.out.println("Customer ID: " + m.getConsumerNo());
        System.out.println("Customer Name: " + m.getConsumerName());
        System.out.println("Type of EB Connection: " + m.getTypeConnection());
        System.out.println("Previous Month Reading: " + m.getPrevMonthReading());
        System.out.println("Current Month Reading " + m.getCurrMonthReading());
        
        // Calculating bill
        double bill = m.billAmount();
        System.out.println("Your Bill: " + bill);
        
        // Chaging the type of account
        System.out.println("\nChaging the type of EB account...\n");
        m.setTypeConnection("Domestic");
        
        bill = m.billAmount();
        System.out.println("Your Bill: " + bill);
        
    }
    
}


