package diceGamePackage;

import java.util.Scanner;

public class IO { // A class purely for the scanner, so i don't have to have multiple scanners or instances of scanners confusing the application and breaking everything/ leaking memory!

	private static final Scanner inputScan = new Scanner(System.in); //New instance of scanner named inputScan
	
	public static Scanner getScanner() {	// This method is called from other class objects to read input on the next line.
		
		return inputScan;					// Returns the user input line of String to the caller.
	}
	
	public static void closeScanner() {     // This method closes the inputScan and thus the system.in stream, 
		inputScan.close();					// it is called from the controller when the user is finished using the application.
	}
}
