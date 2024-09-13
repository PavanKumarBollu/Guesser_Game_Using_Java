package Game;

import java.util.Scanner;

class Guesser {
	int guessNum;

	int guessNum() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Guessor Kindly Guess the Number");
		guessNum = sc.nextInt();
		// sc.close();
		return guessNum;
	}
}

class Player {
	private int id; //for differentiating the player and we will get this while creating the object
	int guessNum;
	
	//constructor
	Player(int id){
		this.id = id;
	}

	int guessNum() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Player "+ id +" Kindly Guess Your Number: ");
		guessNum = sc.nextInt();
		// sc.close();
		return guessNum;

	}
	
	//getters and setters of the id
	int getId() {
		return id;
	}
	void setId(int id)
	{
		this.id = id;
	}

	
}

class Play {
	int guesserNum;
	int player1Num;
	int player2Num;
	int player3Num;
	
	//creating the player objects
	Player p1 = new Player(1);
	Player p2 = new Player(2);
	Player p3 = new Player(3);

	// collecting the number from the guesser
	void collectGuesserNum() {
		Guesser g = new Guesser();
		guesserNum = g.guessNum();
	}
	// collecting the number from the all player

	void collectPlayersNum() {
		

		player1Num = p1.guessNum();
		player2Num = p2.guessNum();
		player3Num = p3.guessNum();
	}

	// comparing and declare the winner

	void compare() {
		if (guesserNum == player1Num) {

			if (guesserNum == player2Num) {

				if (guesserNum == player3Num) {
					System.out.println("All Player Are Guessed the correct Number....Thank You..");
				} else {
					System.out.println("Player 1 And Player 2 Won the Game......Thank You...");
				}
			} else if (guesserNum == player3Num) {
				System.out.println("Player 1 and Player 3 Won The Game..Thank You....");
			} else {
				System.out.println("Player 1 Won the Game");
			}
		} 
		else if (guesserNum == player2Num) {
			
			if (guesserNum == player3Num) {
				System.out.println("Player 2 and Player 3 Won the Game .....Thank You");
			}
			else{
				System.out.println("Player 2 Won the Game..Thank You...");
			}

			
		} 
		else if (guesserNum == player3Num) {
			System.out.println("Player 3 Won the game...Thank You...");
		} else {
			System.out.println("All the Guesses are Wrong Try Agian..!");
		}
	}

}

public class GameLunch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Play play = new Play();

		int mode = 0;
		do {

			play.collectGuesserNum();
			play.collectPlayersNum();
			play.compare();
			System.out.println();
			System.out.println("for Continue enter 1 to quit press 0");
			mode = sc.nextInt();
		} while (mode == 1);

		sc.close();
		
	}

}
