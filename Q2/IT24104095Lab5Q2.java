import java.util.Scanner;
	public class IT24104095Lab5Q2{
		public static void main(String[] args){

		//Open a Scanner and define prize variable
			String prize;
			Scanner input=new Scanner(System.in);

		//Prompt the user to enter the number of new members introduced
			System.out.print("Enter the number of new members introduced: ");
			int newMembers=input.nextInt();

		//Add the conditions and the switch statements necessary to calculate the prize and print the prize
			if(newMembers ==0){
				System.out.println("No Prize");
			
			}else if(newMembers >0){

		//Determine the prize using switch statements
				switch(newMembers){
					case 1:
						prize = "Pen";
						break;
					case 2:
						prize = "Umberella";
						break;
					case 3:
						prize = "Bag";
						break;
					case 4:
						prize = "Umberella";
						break;
					default:
						prize = "Headphones";
						break;
				}
				
				System.out.println("Prize is a: "+prize);
			
			}else{
				System.out.println("Input must be a number 0 or greater");
			}
		
			input.close();
		}
	}








