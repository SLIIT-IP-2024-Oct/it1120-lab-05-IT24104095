import java.util.Scanner; 

public class IT24104095Lab5Q3 {
    public static void main(String[] args) {
       
       //Declare variables
       		int startDate, endDate, noOfDays;
       		double totalAmount, finalTotalAmount, discountAmount;

       //Declare and initialize variables
       		final double pricePerDay = 48000;
       		double discountRate = 0.0;

       //Create a scanner object to read inputs
       		Scanner input = new Scanner(System.in);

       //Take start day and end day as inputs
       			System.out.print("Enter start day (1-31):");
       		startDate = input.nextInt();
      			System.out.print("Enter End day (1-31):");
       		endDate = input.nextInt();

       //Validate the conditions
       		if ((startDate < 1 || startDate > 31) || (endDate < 1 || endDate > 31)) {
        		System.out.println("Error: Days must be between 1 and 31"); 
        	return;
      		 }
       		if (startDate >= endDate) {
        		System.out.println("Error: Start Date must be less than End date");
        	return;
      		 }

       //Calculate the No of Days and the total amount
       		noOfDays = endDate - startDate;

       //Determine the discount amount
      		 if (noOfDays < 3) {
       		 	discountRate = 0.0;
      		 } else if ((noOfDays>=3) && (noOfDays <= 4)) {
       			discountRate = 0.10; //discount = 10%
       		} else if (noOfDays >= 5) {
        		discountRate = 0.20; //discount = 20%
       		}
        
       //Calculate the total amounts
       		totalAmount = noOfDays * pricePerDay;
       		discountAmount = totalAmount * discountRate;
       		finalTotalAmount = totalAmount - discountAmount;  
  
       //Output the results
       			System.out.println("Room charge per day:" + pricePerDay);
       		System.out.println("No of days reserved:" + noOfDays);
       		System.out.println("Total amount to be paid:" + finalTotalAmount);
     		}
	}

       
      