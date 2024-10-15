package diceGamePackage;

//This class handles Part 1 of the task
public class DiceGamePart1 {
	
	//Constructor
	public DiceGamePart1() throws AngryDiceException {
		
		String input;	// Variable for holding the users input into the scanner.
		int spins;		// integer variable for storing the parsed value entered, for the desired amount of spins.
		
		User user1 = new User(); // creates a new instance of user, which is assigned a name below
		
		System.out.print("Please enter your name: "); //Asks user1 to enter name...
		input = IO.getScanner().nextLine();			 // calls the scanner, takes whatever the user enters, and sets it as the input variable.
		user1.setName(input);	// Setter for setting user1's name in the user class - uses the users input as the parameter.
		
		System.out.println("Welcome " + user1.getName() + ", how many times would you like to roll the dice?"); // gets users name and prints a personalised message asking how many times they would like to roll the dice.
		input = IO.getScanner().nextLine();	//sets the input variable as whatever they type into the console
		try {				
		spins = Integer.parseInt(input);			//Try/catch to attempt to parse the number of entered spins into an integer, failure to enter a valid integer angers the Dice God.
		} catch (NumberFormatException e) {
			spins = 0;
			throw(new AngryDiceException("your foolish input angers the dice god!"));
		}
		run(spins); //runs the method for rolling the dice the amount of times requested (entered spins as a parameter)
		System.out.println("Thank you for using the dice simulator, " + user1.getName()); //Prints a custom exit message using a "getter" to get the name from the user1 instance of user class.
	}
	
	// Method to run the chosen number of simulated dice rolls.
	private void run(int spins) {
		
		Dice dice = new Dice();
		
		for (int x = 0; x <= spins; x++) {
			
			dice.getDiceRoll();
		}
	}
}