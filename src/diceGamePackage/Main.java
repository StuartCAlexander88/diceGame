package diceGamePackage;

public class Main {

	public static void main(String[] args) {
		
		try {
			new Controller();			// Runs a new instance of the controller/ menu
		} catch (AngryDiceException e) {
			System.out.println("What happened?");
			System.out.println(e.getPunishment() + '\n');		//Gets angry dice exception if anything goes wrong.
			
			System.out.println(e);
		}
			// In future i would probably make this my "controller" class...
			// although i am not sure if this way is more secure?? (creating an instance of a controller which may contain private data)
		
		// Added the Exception Class/ message after doing the Angry God Exercise, just because.. was a bit cleaner before.
	}
}
