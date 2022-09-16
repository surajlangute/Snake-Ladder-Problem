package SnakeAndLadder;

public class SnakeAndLadderUc1 {

	int playerPosition = 0; // Declaring Instance Variable

	// Method to display player position
	public void showPosition() {
		System.out.println("Player Start Position is " + playerPosition);
	}

	public static void main(String[] args) {
		
		// Displaying welcome message
		System.out.println("Welcome to Snake and Ladder Game");
		
		// Creating object for Player
		SnakeAndLadderUc1 UC = new SnakeAndLadderUc1();
		
		// Showing player position
		UC.showPosition();
	}

}
