package Summative;

import java.util.*;

public class carnival {
	
	public static void main (String [] args) {
		
		Scanner inp = new Scanner(System.in);

		System.out.println("Welcome to the carnival!");
		System.out.println("Please enter your account balance: ");
		double money = inp.nextDouble();	
		player john = new player(money);
		
		gameBooth redBlack = new redBlack();
		gameBooth pennyToss = new pennyToss();
		gameBooth diceGame = new diceGame();
		
		boolean flag = true;
		
		while (flag == true)
		{
			System.out.println("\nChoose one of the options:");
			System.out.println("(G) Play a Game");
			System.out.println("(P) See Prizes");
			System.out.println("(A) Account");
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
					john.play(redBlack);
				}
				if (choice == 2) {
					john.play(pennyToss);
				}
				if (choice == 3) {		
					john.play(diceGame);;
				}
		}	
			
			
		if (selection.equals("P")|| selection.equals("p")) {
				System.out.println(john.prizesWon);
		}
		
		if (selection.equals("A") ||selection.equals("a")){
			System.out.println("What would you like to do?");
			System.out.println("(1) See account balance");
			System.out.println("(2) Load more money");
			int choiceAcc = inp.nextInt();
			
			if (choiceAcc == 1) {
				System.out.println("You currently have $" + john.getBal() + " in your account.");
			}
			if (choiceAcc == 2){
				System.out.println("How much more money would you like to add to your account?");
				double add = inp.nextDouble();
				System.out.println("Your new balance is $" + john.getBal());
				
			}
		}

		
		if (selection.equals("Q") ||selection.equals("q")){
			System.out.println("Thanks for playing. Goodbye!");
			flag = false;
		}
		
	}
	}
}
	
class player{
	double spendingMoney;
	int result = 0;
	
	ArrayList<String> prizesWon = new ArrayList<>();
	
	public player(double spendingMoney){
		this.spendingMoney = spendingMoney;
	}
	
	public void play (gameBooth stand) {
		
		if(spendingMoney >= stand.getCost()){	
			
			spendingMoney = spendingMoney - stand.getCost();
			result = stand.start();			
			if(result == 1) {
				prizesWon.add(stand.largePrize);
			}
			else if(result == 2) {
				prizesWon.add(stand.smallPrize);
			}
		}
		else {
			System.out.println("Oh dear! You do not have enough money for this game!");
		}
	}
	
	public double getBal() {
		return spendingMoney;
	}
	public void addFunds(double money) {
		this.spendingMoney = spendingMoney + money;
	}
	
}

abstract class gameBooth{
	
	double cost;
	String smallPrize;
	String largePrize;
	
	public gameBooth(double price, String smallPrize, String largePrize) {
		this.cost = price;
		this.smallPrize = smallPrize;
		this.largePrize = largePrize;
	}
	abstract int start() ;
	
	public double getCost(){
		return cost;
	}
	
}

class redBlack extends gameBooth {
	
	
	public redBlack(){
		super(1.5, "Keychain", "Plush Fish");
	}
	
	public int start() {
		
		System.out.println("You are now playing Red or Black!");
		Scanner inp = new Scanner(System.in) ;

		int cnt = 0;
		
		for (int k = 0; k  <=2; k++) {		
			
			int colour = (int) ((Math.random())*(3));	
			if (colour <= 1) {
				System.out.println("Black");
				cnt ++;
				inp.nextLine();
			}
			if (colour > 1) {
				System.out.println("Red");
				inp.nextLine();
			}
		}		
		if (cnt == 3 || cnt == 0){
			System.out.println("\nCongratulations! You won a large prize of a plush fish!");
			
			return 1;
		}
		else {
			System.out.println("\nCongratulations! You won a small prize of a keychain!");
			
			return 2;
			
		}	
	}
}

class pennyToss extends gameBooth{
	
	public pennyToss() {
		super(3, "Poster", "Plush Tiger");
	}
	String [][] board;
	public int start (){
		board = new String[][]{{"Poster", "Poster", "Plush Tiger", ""},
							   {"", "Plush Tiger", "", "Poster"},
			                   {"Poster","","Poster",""},
			                   {"","","","Plush Tiger"}};
		for(int i = 0; i < 3; i++) {
			int x = (int)(Math.random()*4);
			int y = (int)(Math.random()*4);
		}
	
		
		return 0;
	}
	
}

class diceGame extends gameBooth{

	public diceGame() {
		super(0.25, "Earbuds", "iPod");
	}

	public int start(){
	
		System.out.println("\nWelcome to Dice Game! \nEach game wil cost you 25 cents to play. You have the opportunity to win a large prize "
				+ "or a small prize depending on how risky your gamble is. \nTo begin, enter a guess for the final sum. After, you may choose one scenario "
				+ "from the menu for a chance to win a small prize. If your menu guess \nand your total sum are the same, win a large prize! If you "
				+ "roll three in a row, that's a large prize as well! Get any of your guesses correct and win a small prize.");
		
		Scanner inp = new Scanner(System.in) ;
		Scanner inp2 = new Scanner(System.in) ;
		System.out.println("\nEnter your guess between 3 and 18: ");
		int guessSum = inp.nextInt();
		System.out.println("Menu Options:\n(1) Greater or equal to 10\n(2) Less than 10\n(3) Two of a kind\n(4) Three of a kind");
		int guessMenu = inp2.nextInt();
		
		System.out.println("\nStarting...");
		inp.nextLine();
		
		System.out.println("Press enter to roll");
		inp.nextLine();
		int one = (int) ((Math.random())*(6) +1);
		System.out.println("Your first number is: "+ one);
		
		System.out.println("Press enter to roll");
		inp.nextLine();
		int two = (int) ((Math.random())*(6) +1);
		System.out.println("\nYour second number is: "+ two);
		
		System.out.println("Press enter to roll");
		inp.nextLine();
		int three = (int) ((Math.random())*(6) +1);
		System.out.println("\nYour third number is: "+ three);
		
		System.out.println("\nYour total sum is: " + (one + two + three));
		
		int guessCheck = 5;
		
		if(guessMenu == 1) {
			if((one + two + three) >= 10 ) {
				guessCheck = 1;
			}
		}
		if(guessMenu == 2) {
			if((one + two + three) < 10 ) {
				guessCheck = 2;
			}
		}
		if(guessMenu == 3) {
			if(one == two || one == three || two == three) {
				guessCheck = 3;
			}
		}
		if(guessMenu == 4) {
			if(one == two && one == three && two == three) {
				guessCheck = 4;
			}
		}
		
		if (one + two + three == guessSum && guessCheck == guessMenu || guessCheck == 4){
			System.out.println("Congratulations! You won the large prize of an iPod!");
			return 1;
			
		}
		else {
			
		}
			if(one + two + three == guessSum || guessCheck == guessMenu && guessCheck != 4) {
				System.out.println("Congratulations! You won the small prize of a pair of earbuds!");
				return 2;
			}
			else {
				System.out.println("You didn't match anything! Please try again");
		}
			return 0;
		
	}
}