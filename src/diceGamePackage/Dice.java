package diceGamePackage;
import java.util.Random;

//DICE class for simulating the roll of a dice and the displaying of dice faces.
public class Dice {								

	// Constructor.
	public Dice() {
		
	}
	
	// A method that simulates a dice roll.
	public int getDiceRoll() {					
		
		Random diceRoll = new Random(); 		// uses the "Random" class and creates a new instance of it called "diceRoll"
		
		int diceNum = diceRoll.nextInt(6);  	//sets diceNum as the next random number created by the diceRoll instance (parameter set as six so that the random number is from 0-5)
		diceNum += 1;							// ... adds 1 to the diceNum variable as obviously we can't roll a 0 and want the numbers to run from 1-6.
		
		displayDice(diceNum);					//runs the below method for printing the dice face in the console, passing in the dice roll as a a parameter.
		
		return diceNum;							//returns the rolled dice number to the caller.
	}
	
	public void displayDice(int diceNum) {
		
		
		switch (diceNum) {
		case 1:
			diceOne();
			break;
		case 2:								// a method containing a switch that runs on each completed dice roll. 
			diceTwo();						// It uses the passed in number rolled as the parameter for the switch, 
			break;							//and prints the corresponding dice face, which all have their own separate method.
		case 3:
			diceThree();
			break;
		case 4:
			diceFour();
			break;
		case 5:
			diceFive();
			break;
		case 6:
			diceSix();
			
			break;
		}
	}
	
	// The following methods print the corresponding dice face each time a dice is rolled. It achieves this by using the above switch.
	private void diceOne() {
		System.out.println(" ___________ ");
		System.out.println("|           |");
		System.out.println("|           |");
		System.out.println("|     0     |     1");
		System.out.println("|           |");
		System.out.println("|___________|");
		
		
	}
	
	private void diceTwo() {
		System.out.println(" ___________ ");
		System.out.println("|           |");
		System.out.println("|  0        |");
		System.out.println("|           |     2");
		System.out.println("|        0  |");
		System.out.println("|___________|");
		
	}
	
	private void diceThree() {
		System.out.println(" ___________ ");
		System.out.println("|           |");
		System.out.println("|  0        |");
		System.out.println("|     0     |     3");
		System.out.println("|        0  |");
		System.out.println("|___________|");
		
	}
	
	private void diceFour() {
		System.out.println(" ___________ ");
		System.out.println("|           |");
		System.out.println("|  0     0  |");
		System.out.println("|           |     4");
		System.out.println("|  0     0  |");
		System.out.println("|___________|");
	}
	
	private void diceFive() {
		System.out.println(" ___________ ");
		System.out.println("|           |");
		System.out.println("|  0     0  |");
		System.out.println("|     0     |     5");
		System.out.println("|  0     0  |");
		System.out.println("|___________|");
	}
	
	private void diceSix() {
		System.out.println(" ___________ ");
		System.out.println("|           |");
		System.out.println("|  0  0  0  |");
		System.out.println("|           |     6");
		System.out.println("|  0  0  0  |");
		System.out.println("|___________|");
	}
}
