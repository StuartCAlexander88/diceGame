package diceGamePackage;

//This class handles part2 of the task
public class DiceGamePart2 {

	private final int maxRolls = 5;		//The maximum amount of rolls is 5 and it does not change, so used a constant to store this
	
	public DiceGamePart2() throws AngryDiceException {
		
		String input;	//for storing user input
		int choice = 0; // for storing parsed integer from input variable.
		
		System.out.println("------------------------------------");
		System.out.println("- Press 1 - to play 'Throw a Six'---");
		System.out.println("------------------------------------");		// prints Sub menu to give user a choice between "real game" and "simulation"
		System.out.println("- Press 2 - to simulate the game----");
		System.out.println("------------------------------------");
		
		while (choice < 1 || choice > 2) {			//While loop that runs while the user has not picked either 1 or 2 (real game or sim)
			input = IO.getScanner().nextLine();		//Gets user input from the scanner class and assigns it to the input variable
			try {
				choice = Integer.parseInt(input);			//tries to parse input to an integer, gives angry dice god exception if fails
				}
				catch (NumberFormatException e) {
					//System.out.println("Invalid Selection, please enter 1 or 2: ");
					throw(new AngryDiceException("your foolish input angers the dice god!"));
				}
		}
		runGame(choice);	// runs the game with the user choice as a parameter.
	}
	
	private void runGame(int selector) {	//runs the Part2 game, uses the users choice above as "selector"
		
		Dice dice = new Dice();	// creates a new instance of the dice
		
		int score = 5;			// score keeper variable, for keeping track of users score7
		
		dice.displayDice(1);	// simulates the dice being placed on the table with the 1 facing up
		System.out.println("The dice is placed with the 1 facing up...");
		
		for (int x = 0; x <= maxRolls; x++) {		//For loop runs until the user reaches the maximum number of rolls...
			
			int result = dice.getDiceRoll();		// rolls the dice and stores the result in a variable with the same name.
			
			if (result == 6) {		//If a six was rolled ...
				if (selector == 1 ) {
					System.out.println("You rolled a six well done!");
				} else {			//prints the corresponding message (if the user chose "real game" or simulation just changes the printed message)
					System.out.println("Simulation won!");
				}
				break;				// breaks out of the loop, ending the game in a win.
			} else if (score == 0) {					//If the user has run out of rolls, the score would be 0
				if (selector == 1) {
					System.out.println("You lose!");	// tells the user they have lost/simulation has lost
				} else {
					System.out.println("Simulation lost!");
				}
				break;									// breaks out of the loop, resulting in a loss
			} else {					// Otherwise it continues running, displaying the score and writing the corresponding message
				if (selector == 1) {
					System.out.println("you rolled: " + result + ", rolling again!");
				} else {
					System.out.println("Simulating again...");
				}
				score--; //decrements the score each roll
			}
		}
		
		if (selector == 1) {
			System.out.println("Your score: " + score);		
		} else {												//Prints the final score/simulation score after the game has finished
			System.out.println("Simulation score: " + score);
		}
	}
}

