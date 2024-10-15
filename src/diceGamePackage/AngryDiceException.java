package diceGamePackage;

import java.lang.Exception;

@SuppressWarnings("serial")
public class AngryDiceException extends Exception {

	private String punishment;
	
	// Constructor.
	public AngryDiceException(String punishment) {
			System.out.println(" ___________ ");
			System.out.println("|           |");
			System.out.println("|  >     <  |");		// custom exception for when input validation is failed, or the application throws an exception.
			System.out.println("|           |");
			System.out.println("|    ___    |");
			System.out.println("|___________|");
		this.punishment = punishment;
	}
	// Getter.
	public String getPunishment() {
		return punishment.toUpperCase();
	}
	
	@Override
	public String toString() {
		return super.toString() + " The dice does not wish to test the input validation, please restart!";
		
	}
}
