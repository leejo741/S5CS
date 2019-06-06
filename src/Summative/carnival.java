package Summative;

import java.util.*;

public class carnival {
	
	public static void main (String [] args) {
		
		Scanner inp = new Scanner(System.in);

		System.out.println("Welcome to the carnival!");
		System.out.println("Please enter your account balance: ");
		int money = inp.nextInt();
		player john = new player(money);
		gameBooth redBlack = new redBlack();
		gameBooth pennyToss = new pennyToss();
		gameBooth diceGame = new diceGame();
		//add a while loop
		System.out.println("Choose one of the options:");
		System.out.println("(G) Play a Game");
		System.out.println("(P) See Prizes");
		System.out.println("(Q) Quit");
		System.out.println("Enter your choice:");
		String selection = inp.next();
		
		if (selection.equals("G")|| selection.equals("g")) {
			
			System.out.println("Which game would you like to play?");
			System.out.println("(1) Red or Black");
			System.out.println("(2) Penny Throw");
			System.out.println("(3) Dice Game");
			System.out.println("Enter your choice: ");
			int choice = inp.nextInt();
			String gameChoice = null;
			if (choice == 1) {
			gameChoice = "Red or Black";
			System.out.println("Playing " + gameChoice) ;
			redBlack.start();
			}
			if (choice == 2) {
			gameChoice = "Penny Throw";	
			System.out.println("Playing " + gameChoice) ;
			}
			if (choice == 3) {
			gameChoice = "Dice Game";		
			System.out.println("Playing " + gameChoice) ;
			diceGame.start();
			}
			
		}
		
		if (selection.equals("P")|| selection.equals("p")) {
			
		}
	
	}
}

class player{
	double spendingMoney;
	ArrayList<String> prizesWon = new ArrayList<>();
	
	public player(double spendingMoney){
		spendingMoney = spendingMoney;
	}
}

abstract class gameBooth{
	double cost;
	String smallPrize;
	String largePrize;
	
	abstract void start() ;
	
	public double getCost(){
		return cost;
	}
	
}

class redBlack extends gameBooth {
	
	
	public void start() {
		
		Scanner inp = new Scanner(System.in) ;
		
		this.cost = 1.5;
		int cnt = 0;
		for (int k = 0; k  <=2; k++) {
			
			int colour = (int) ((Math.random())*(3));
			
//			System.out.println(colour);
			if (colour <= 1) {
				System.out.println("Black");
				cnt ++;
			}
			if (colour > 1) {
				System.out.println("Red");
			}
			
			if (cnt == 2 || cnt == 0){
				
			}
			
		}	
	}
}

class pennyToss extends gameBooth{
	
	String [][] board;
	public void start (){
		board = new String[][]{{"Poster", "Poster", "Plush Tiger", ""},
							   {"", "Plush Tiger", "", "Poster"},
			                   {"Poster","","Poster",""},
			                   {"","","","Plush Tiger"}};
	}
}

class diceGame extends gameBooth{
	public void start(){
	// user can guess greater than or less than (small prize) or three of a kind (large prize), make a menu option, output of rules and how to win	
		System.out.println(" Welcome to Dice Game! ");
		Scanner inp = new Scanner(System.in) ;
		System.out.println("Enter your guess between 3 and 18: ");
		int guess = inp.nextInt();
		System.out.println("Rolling...");
		
		int one = (int) ((Math.random())*(6) +1);
		System.out.println("Press enter to roll");
		inp.nextLine();
		System.out.println("Your first number is: "+ one);
		
		int two = (int) ((Math.random())*(6) +1);
		System.out.println("Press enter to roll");
		inp.nextLine();
		System.out.println("Your second number is: "+ two);
		
		int three = (int) ((Math.random())*(6) +1);
		System.out.println("Press enter to roll");
		inp.nextLine();
		System.out.println("Your third number is: "+ three);
		
		System.out.println("\nYour total sum is: " + (one + two + three));
		
		if (one + two + three == guess){
			System.out.println("Congratulations! You won a huge plush hotdog!");
			
		}
		else{
			System.out.println("Please try again.");
		}
		
	}
}