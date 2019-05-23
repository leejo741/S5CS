package Summative;

import java.util.*;

public class carnival {
	
	public static void main (String [] args) {
		
		Scanner inp = new Scanner(System.in);

		System.out.println("Welcome to the carnival!");
		System.out.println("Please enter your account balance: ");
		int money = inp.nextInt();
		player john = new player(money);
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
			System.out.println("(3) GAME NOT YET CHOSEN");
			System.out.println("Enter your choice: ");
			int choice = inp.nextInt();
			String gameChoice = null;
			if (choice == 1) {
			gameChoice = "Red or Black";	
			}
			if (choice == 2) {
			gameChoice = "Penny Throw";		
			}
			if (choice == 3) {
			gameChoice = "GAME NOT YET CHOSEN";		
			}
			System.out.println("Playing " + gameChoice) ;
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
	int colour = (int) ((Math.random())*(2));

	@Override
	void start() {
		// TODO Auto-generated method stub
		
	}
}