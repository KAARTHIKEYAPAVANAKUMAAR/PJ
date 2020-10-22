/*Create a class called Invoice that a hardware store might use to represent an invoice for an item sold at the store.

An Invoice should include four pieces of information as instance variables-a part number (type String), a part description (type String),a quantity of the item being purchased (type int) and a price per item (double).

Your class should have a constructor that initializes the four instance variables.

Provide a set and a get method for each instance variable.

In addition, provide a method named getInvoiceAmount() that calculates the invoice amount (i.e., multiplies the quantity by the price per item), then returns the amount as a double value. If the quantity is not positive, it should be set to 0. If the price per item is not positive, it should be set to 0.0.

Write a test application named InvoiceTest that demonstrates class Invoice’s capabilities.*/



class Invoice{
        //Define instance variables here
        String number;
        String description;
        int quantity;
        double price;
        public Invoice(){ }
        //Define parameterized constructor here
        public Invoice(String num, String desc, int quant, double pr) {
            number = num;
            description = desc;
            quantity = quant;
            price = pr;
        }
       // Setters
        void setNumber(String num) {
            number = num;
        }
        void setDescription(String desc) {
            description = desc;
        }
        void setQunatity(int quant) {
            quantity = quant;
        }
        void setPrice(double pr) {
            price = pr;
        }
       // Getters
        String getNumber() {
            return number;
        }
        String getDescription() {
            return description;
        }
        int getQunatity() {
            return quantity;
        }
        double getPrice() {
            return price;
        }

       public double getInvoiceAmount(){
                 double invoiceAmount = 0.0;
                // Write your logic here
                if (quantity < 0) {
                    invoiceAmount = 0;
                }
                else if (price < 0.0) {
                    invoiceAmount = 0.0;
                }
                else {
                    invoiceAmount = price * quantity;
                }
                return invoiceAmount;
       }
}
public class Experiment_01{
         public static void main(String []args){
                   Invoice myInvoice;
                   myInvoice = new Invoice("19BQ1A05L5", "My First Invoice :)", 5, 2.0);
                   myInvoice.setPrice(5.0);
                   System.out.println("Number: " + myInvoice.getNumber());
                   System.out.println("Descriptio: " + myInvoice.getDescription());
                   System.out.println("Quantity: " + myInvoice.getQunatity());
                   System.out.println("Price:" + myInvoice.getPrice());
                   System.out.println("invoiceAmount: " + myInvoice.getInvoiceAmount());
         }
}

