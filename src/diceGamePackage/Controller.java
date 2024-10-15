package diceGamePackage;

public class Controller {
	
	// Constructor.
	public Controller() throws AngryDiceException {
		
		boolean playStatus = true;	//Boolean value to determine if the application should continue to run
		String input;				//Input for holding the String value entered by the user 
		int choice;					//Choice is for holding any numeric values that are converted from string input, for using in switches etc.
		
		welcomeMessage();	//Runs the welcome message method, which prints a welcome message upon the creation of the class from main.
		
		while (playStatus == true) {	// while loop that repeats until the user chooses to exit the application
		System.out.println("------ Please pick an option: ------");
		menuOptions();							// prints menu options in the console by running the menuOptions() method
		input = IO.getScanner().nextLine();		//calls the scanner and sets the value of input as whatever the user enters.
		
		try {
			choice = Integer.parseInt(input);		// Tries to parse the entered string into an integer and assign it to the choice variable.
			}
			catch (NumberFormatException e) {
				System.out.println("Invalid Selection");		//Displays a custom exception if the user does not enter an integer.
				throw(new AngryDiceException("your foolish input angers the dice god!"));
			}
		
		playStatus = menuSwitch(choice);		//takes the parsed integer "choice" and runs it through a switch, returns a boolean value to "playStatus", only exit will return a false which would stop the above loop from continuing
		}
		exitMessage();	//Displays an exit message by running this method
		IO.closeScanner();	//Closes the scanner once once the application ends
	}

	private void welcomeMessage() {
		System.out.println("------------------------------------");
		System.out.println("---------- Welcome to the-----------");
		System.out.println("--------- DICE ROLLER 5000----------");			// Prints this welcome message
		System.out.println("--------------- v2.0----------------");
		System.out.println("------------------------------------");
	}
	
	private void exitMessage() {
		System.out.println("------------------------------------");
		System.out.println("------ thank you for using the------");
		System.out.println("--------- DICE ROLLER 5000----------");			// Prints this exit message 
		System.out.println("------------------------------------");
		System.out.println("-(coded by Stuart C.Alexander ESQ.)-");	
		System.out.println("------------------------------------");
	}
	
	private void menuOptions() {
		System.out.println("------------------------------------");
		System.out.println("- Press 1 - to roll the dice(Part1)-");
		System.out.println("- Press 2 - throw a six game(Part2)-");		//menu options that display every time the while loops back around
		System.out.println("- Press 3 - doubles game ---(Part3)-");
		System.out.println("- Press 4 - To Exit ----------------");
		System.out.println("------------------------------------");
	}
	
	private boolean menuSwitch(int choice) throws AngryDiceException {
		
		switch (choice ) {
		case 1: 
			new DiceGamePart1();	
			return true;
		case 2:
			new DiceGamePart2();		// Menu switch to direct user to the desired task, or exit
			return true;
		case 3:
			new DiceGamePart3and4();
			return true;
		case 4:
			return false;
		default:
			System.out.println("Invalid Selection"); // if the integer parsed into choice is not within the range of the switch, will tell the user it is not a valid selection and start the loop again.
			return true;
		}
	}
}
