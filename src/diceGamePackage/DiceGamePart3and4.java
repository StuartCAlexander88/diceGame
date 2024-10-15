package diceGamePackage;

//This class handles part3 and part4 of the project
public class DiceGamePart3and4 {
	
	Dice dice1 = new Dice();	// creates two instances of the dice for use in the class
	Dice dice2 = new Dice();	// I was aware that this would be possible with only one dice in a virtual paradigm,but rolled twice, but for authenticity i chose to create 2 dice.
	
	//Constructor.
	public DiceGamePart3and4() throws AngryDiceException {
		
		String input;	//variable for storing the returned input from the scanner
		int choice = 0;	//variable for storing an integer, parsed from the input variable 
		
		welcomeMessage();	//runs a method that prints a welcome message
		input = IO.getScanner().nextLine();		// gets user input from the scanner class

		while (choice < 1 || choice > 2) {		// while loop that forces the user to pick 1, or gives an Angry Dice exception
			try {
				choice = Integer.parseInt(input);	// tries to parse the user input into an integer variable(choice)
				}
				catch (NumberFormatException e) {		//throws an exception if an integer was not entered.
					throw(new AngryDiceException("your foolish input angers the dice god!"));
				}
		}
		if (choice == 1)
		{
			User user2 = new User();
			System.out.println("Please enter your name");
			input = IO.getScanner().nextLine();			 // calls the scanner, takes whatever the user enters, and sets it as the input variable.
			user2.setName(input);
			
			run(user2.getName()); //runs a method which contains the part 3 game
		}
		if (choice == 2)
		{
			User user2 = new User();
			System.out.println("Player 1, please enter your name");
			input = IO.getScanner().nextLine();			 // calls the scanner, takes whatever the user enters, and sets it as the input variable.
			user2.setName(input);
			
			User user3 = new User();
			System.out.println("Player 2, please enter your name");
			input = IO.getScanner().nextLine();			 // calls the scanner, takes whatever the user enters, and sets it as the input variable.
			user3.setName(input);
			
			int p1Score = run(user2.getName()); //runs instance of the game method for player 1
			int p2Score = run(user3.getName()); //runs instance of the game for player 2
			
			if (p1Score > p2Score) {
				System.out.println("Player 1 wins!");
			} else if (p1Score == p2Score) {
				System.out.println("The game ended in a draw!");
			} else {
				System.out.println("Player 2 wins!");
			}
		}
		
	}
	
	
	private void welcomeMessage() {
		System.out.println("------------------------------------");
		System.out.println("----------- Doubles Game------------");
		System.out.println("------------------------------------");
		System.out.println("- The two dice will roll three times");
		System.out.println("----- you get 1 point for a pair----");
		System.out.println("------------------------------------");
		System.out.println("- Press 1 to start one player game--");
		System.out.println("- Press 2 to start a 2 player game--");
		System.out.println("------------------------------------");
	}
	public int run(String username) {
		
		int diceRoll1;	// variable for storing the result of the first dice roll
		int diceRoll2;	// variable for storing the result of the second dice roll
		int score = 0;	// variable for holding the users score.
		
		for (int x = 0; x < 3; x++) {	// runs a for loop that will roll both dice 3 times 
			diceRoll1 = dice1.getDiceRoll();	// rolls dice 1 and stores result as diceRoll1 variable
			diceRoll2 = dice2.getDiceRoll();	// rolls dice 2 and stores result as diceRoll2 variable
			
			if (diceRoll1 == diceRoll2) {		// if the dice match...
				score += 1;						// increments the score by 1
				System.out.println("---------------------"); 
			} else {											//prints visual separators in the console, just to see the pairs a little easier
				System.out.println("---------------------");
			}
		}
		System.out.println("Game Finished, " + username + " your score: " + score); // prints the message and the user score upon completing the game.
		return score; // returns users score to constructor
	}
}
