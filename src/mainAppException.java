import java.util.Scanner;

public class mainAppException {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		//Variable to allow user to continue the program
		boolean cont = true; //Variable to control "while" loop
		int number; //Holds user input of a number
		int number2;
		String userContinue;
		while(cont){
			//Ask user for a number
			System.out.println("Enter a number human!: ");
			number = userInput.nextInt();
			System.out.println("enter another number!:");
			number2 = userInput.nextInt();
			
			while (number2 <= 0){
				System.out.println("That is an invalid number, please re-enter another!");
				number2 = userInput.nextInt();
			}
			userInput.nextLine();
			try {
				System.out.println( number/number2);	
			}
			catch (ArithmeticException e){
				//cannot divide by zero
				System.out.println("you cannot divide by zero!");
			
			//Display that number divided by 10
			}
			//Ask if they want to continue
			System.out.println("Would you like to keep going? Y/N");
			userContinue = userInput.nextLine();
			//if user says yes, continue should be true
			
			if( userContinue.equalsIgnoreCase("y")){
			cont = true;
			}
			// else continue should be false
			
			else {
				cont = false;
			}
			
			
		}
		System.out.println("See you later");
	}
}