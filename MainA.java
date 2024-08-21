package mainA;

import java.util.Scanner;

public class MainA {
	public static void main(String[] args) {
		//next logical operators:
		// logical operators = used to connect 2 or more experessions
		/*
		 *  && = (AND) both conditions must be true
		 *  || = (OR) either conddition must be true
		 *  !  = (NOT) reverse boolean value of condition
		 */
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("You are playing a game! Press q or Q to quit");
		
		String response = scanner.next();
		
		if(response.equals("q") || response.equals("Q")) {
			System.out.println("You quit the game");
		}
		else {
			System.out.println("You are still playing the game");
		}


}
}
