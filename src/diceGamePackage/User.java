package diceGamePackage;

// Class for holding any instances of the user, with the thouh that if the application was to be extended, multiple users could have multiple names.
public class User {

	private String name;
	
	// Constructor.
	public User() {
								
	}
	
	// Getter.
	public String getName() {
		return name;
	}
	
	// Setter.
	public void setName(String newName) {
		this.name = newName;
	}
}
