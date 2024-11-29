import java.util.Scanner;
	public class IT24104095Lab5Q1{
		public static void main(String[] args){

		//Open a scanner
			Scanner input=new Scanner(System.in);

		//Take the keyboard inputs
			System.out.print("Enter the first integer: ");
			int firstDigit =input.nextInt();

			System.out.print("Enter the second integer: ");
			int secondDigit =input.nextInt();

			System.out.print("Enter the third integer: ");
			int thirdDigit = input.nextInt();

		//Print the first output
			System.out.println("User entered numbers are : "+firstDigit+ " "+secondDigit+ " "+thirdDigit+ " ");

		//The comparative analysis
			int smallest;
			if(firstDigit <=secondDigit && firstDigit <=thirdDigit){
				smallest =firstDigit;
			}else if(secondDigit <=firstDigit && secondDigit <=thirdDigit){
				smallest =secondDigit;
			}else{
				smallest =thirdDigit;
			}

			int largest;
			if(firstDigit >=secondDigit && firstDigit >=thirdDigit){
				largest =firstDigit;
			}else if(secondDigit >=firstDigit && secondDigit >=thirdDigit){
				largest =secondDigit;
			}else{
				largest =thirdDigit;
			}

		//Print the result
			System.out.println("The Smallest number is: "+smallest);
			System.out.println("The Largest number is: "+largest);
			
			input.close();
		}
	}
				


							












