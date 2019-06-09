package Summative;

import java.util.*;

public class carnival {
	
	public static void main (String [] args) {
		
		Scanner inp = new Scanner(System.in); //Initializes the scanner used in this class to get inputs

		System.out.println("Welcome to the carnival!");
		System.out.println("Please enter your account balance: ");
		
		double money = inp.nextDouble();	//initializes variable to put balance in account and uses the scanner
		
		player john = new player(money); //makes a new  player object with the balance that we input earlier
		
		gameBooth redBlack = new redBlack(); //the next three lines create new gameBooth objects for all the games
		gameBooth pennyToss = new pennyToss();
		gameBooth diceGame = new diceGame();
		
		boolean flag = true;//creates the variable that makes the while loop run
		
		while (flag == true) //allows the user to continue to play until they select quit
		{
			System.out.println("\nChoose one of the options:");
			System.out.println("(G) Play a Game");
			System.out.println("(P) See Prizes");
			System.out.println("(A) Account");
			System.out.println("(Q) Quit");
			System.out.println("Enter your choice:");
			String selection = inp.next();
			
			if (selection.equals("G")|| selection.equals("g")) {
				
				System.out.println("\nWhich game would you like to play?");
				System.out.println("(1) Red or Black($1.50)");
				System.out.println("(2) Penny Throw($3.00)");
				System.out.println("(3) Dice Game($0.25)");
				System.out.println("Enter your choice: ");
				int choice = inp.nextInt();
				
				if (choice == 1) {
					john.play(redBlack);//calls the method play in the gameBooth object specified
				}
				if (choice == 2) {
					john.play(pennyToss);//calls the method play in the gameBooth object specified
				}
				if (choice == 3) {		
					john.play(diceGame);//calls the method play in the gameBooth object specified
				}
		}	
			
			
		if (selection.equals("P")|| selection.equals("p")) {
				System.out.println(john.prizesWon);//calls the prizesWon method in the object john and prints it
		}
		
		if (selection.equals("A") ||selection.equals("a")){
			System.out.println("What would you like to do?");
			System.out.println("(1) See account balance");
			System.out.println("(2) Load more money");
			int choiceAcc = inp.nextInt();
			
			if (choiceAcc == 1) {
				System.out.println("You currently have $" + john.getBal() + " in your account.");//calls the getBal method in john and prints it
			}
			if (choiceAcc == 2){
				System.out.println("How much more money would you like to add to your account?");
				double add = inp.nextDouble();//gets an amount to add into john
				john.addFunds(add);
				System.out.println("Your new balance is $" + john.getBal());//prints out the new balance
				
			}
		}		
		if (selection.equals("Q") ||selection.equals("q")){
			System.out.println("Thanks for playing. Goodbye!");
			flag = false;//stops the while loop
		}
		
	}
	}
}
	
class player{
	double spendingMoney;
	int result = 0;//initializes the variable that will determine whether a small or large prize
	
	ArrayList<String> prizesWon = new ArrayList<>();//initializes the array list that will store all the prizes won
	
	public player(double spendingMoney){
		this.spendingMoney = spendingMoney;//the constructor
	}
	
	public void play (gameBooth stand) {//method that starts the game
		
		if(spendingMoney >= stand.getCost()){	//determines if you have enough money to continue and subtracts the cost from the balance
			
			spendingMoney = spendingMoney - stand.getCost();
			result = stand.start();			
			if(result == 1) {//gets the output of the separate booths and puts the respective prizes into the array list
				prizesWon.add(stand.largePrize);
			}
			else if(result == 2) {//gets the output of the separate booths and puts the respective prizes into the array list
				prizesWon.add(stand.smallPrize);
			}
		}
		else {
			System.out.println("Oh dear! You do not have enough money for this game! Go to your account to load more money.");
		}
	}
	
	public double getBal() {//accessor method
		return spendingMoney;
	}
	
	public void addFunds(double money) {//mutator method
		this.spendingMoney = spendingMoney + money;
	}
	
}

abstract class gameBooth{
	
	double cost;
	String smallPrize;
	String largePrize;
	
	public gameBooth(double price, String smallPrize, String largePrize) {//constructor method
		this.cost = price;
		this.smallPrize = smallPrize;
		this.largePrize = largePrize;
	}
	abstract int start() ;
	
	public double getCost(){//accessor
		return cost;
	}
	
}

class redBlack extends gameBooth {	
	public redBlack(){
		super(1.5, "Keychain", "Plush Fish");//constructor method
	}
	
	public int start() {//method for starting the game
		
		System.out.println("You are now playing Red or Black!\nYou will pick three tokens out of a bag. If you match two colours you get a keychain.\n"
						 + "Match all three colours for a plush fish! Good luck!");
		
		Scanner inp = new Scanner(System.in) ;//Initializes the scanner used in this class to get inputs

		System.out.println("Press enter for your first token");
		inp.nextLine();
		
		int cnt = 0;//keeps track of the number of black tokens drawn
		
		for (int k = 0; k  < 3; k++) {		//this for loop ensures that you get to choose 3 tokens
			
			int colour = (int) ((Math.random())*(3));	//gets a random number to decide whether or not a red or black was drawn
			
			if (colour <= 1) {
				System.out.println("Black");
				cnt ++;//increases the cnt by one
			}
			if (colour > 1) {
				System.out.println("Red");
			}
			
			if(k<2) { //makes sure that there is the appropriate statement printed before the last draw
				System.out.println("Press enter for your next token");
				inp.nextLine();
			}
			else {
				System.out.println("Press enter to see your result!");
				inp.nextLine();
			}
		}		
		if (cnt == 3 || cnt == 0){//if three blacks were drawn or three reds were drawn, you win a large prize
			System.out.println("\nCongratulations! You won a large prize of a plush fish!");
			
			return 1;
		}
		else {//you win a small prize regardless because you will always get a pair
			System.out.println("\nCongratulations! You won a small prize of a keychain!");
			
			return 2;
			
		}	
	}
}

class pennyToss extends gameBooth{
	
	String [][] playBoard;//initializes the array that will be used for the game, this one is modified
	String [][] ogBoard;//initializes the array that does not change, it will be referenced to see if they won
	
	public pennyToss() {
		super(3, "Poster", "Plush Tiger");//constructor
	}
	
	public int start(){
		System.out.println("Welcome to penny toss! Land your penny on any poster tile to win a poster. Land all three pennies on a tiger"
				         + " tile to win a plush tiger. Good luck!");
		
		Scanner inp = new Scanner(System.in) ;//Initializes the scanner used in this class to get inputs
		
		ogBoard = new String[][]{{"Poster", "Poster", "Plush Tiger", ""},//fills the array
			                      {"", "Plush Tiger", "", "Poster"},
			                      {"Poster","","Poster",""},
			                      {"","","","Plush Tiger"}};
            
		playBoard = new String[][]{{"Poster", "Poster", "Plush Tiger", ""},//fills the array
							      {"", "Plush Tiger", "", "Poster"},
			                      {"Poster","","Poster",""},
			                      {"","","","Plush Tiger"}};
			                   
		int prizeCntS = 0;//counter to see how many times the penny lands on a small prize tile
		int prizeCntL = 0;//counter to see how many times the penny lands on a large prize tile
		
		System.out.println("\nPress enter to toss a penny.");
		inp.nextLine();
		
		for(int i = 0; i < 3; i++) {//ensures you throw three pennies
			int x = (int)(Math.random()*4);//chooses a random x coordinate to place the penny
			int y = (int)(Math.random()*4);//chooses a random y coordinate to place the penny
			
			playBoard[x][y] = playBoard[x][y] + " x";//adds an "x" to symbolize a penny on the tile that was chosen at random
			
			if(ogBoard[x][y] == "Poster") {//if in the original board the tile was poster than it will add to the small prize count
				prizeCntS ++;
			}
			if(ogBoard[x][y] == "Plush Tiger") {//if in the original board the tile was plush tiger than it will add to the large prize count
				prizeCntL ++;
			}
			
			printBoard();//calling method for printing out the board
			System.out.println();
			if(i<2) {
				System.out.println("\nPress enter to toss another penny.");
				inp.nextLine();
			}
			
		}
	
		if (prizeCntS > 0) {//if it landed on any poster tile, you win
			System.out.println("Congratulations! You won a poster.");
			return 2;
		}
		if (prizeCntL == 3) {//you have to hit the tile three times to win
			System.out.println("Congratulations! You won a plush tiger.");
			return 1;
		}
		if (prizeCntS == 0 && prizeCntL != 3) {// if you hit three empty spots, you lose
			System.out.println("Sorry you lose this time! Please try again.");
		}
		return 0;
	}
	
	public void printBoard() {//method for printing out the board
		
		for(int i = 0; i < playBoard.length; i++)
		{
			for(int j = 0; j < playBoard[0].length; j++)
			{
				System.out.printf("|%-15s|", playBoard[i][j]);
			}
			System.out.println();
		}
	
	}
}

class diceGame extends gameBooth{

	public diceGame() {
		super(0.25, "Earbuds", "iPod");//constructor
		
	}

	public int start(){
	
		System.out.println("\nWelcome to Dice Game! \nEach game wil cost you 25 cents to play. You have the opportunity to win a large prize "
				+ "or a small prize depending on how risky your gamble is. \nTo begin, enter a guess for the final sum. After, you may choose one scenario "
				+ "from the menu for a chance to win a small prize. If your menu guess \nand your total sum are the same, win a large prize! If you "
				+ "roll three in a row, that's a large prize as well! Get any of your guesses correct and win a small prize. Good luck!");
		
		Scanner inp = new Scanner(System.in) ;//Initializes the scanner used in this class to get inputs
		Scanner inp2 = new Scanner(System.in) ;//Initializes the scanner used in this class to get inputs
		boolean flag = true;//flag for the while loop to make sure the numbers are valid
		int guessSum = 0;
		
		while(flag == true) {
			System.out.println("\nEnter your guess between 3 and 18: ");
			guessSum = inp.nextInt();
			if (guessSum < 3 ||guessSum > 18) {//makes sure the guess is valid and within the range
				System.out.println("Invalid number. Please enter a number between 3 and 18.");
			}
			else {
				flag = false;
			}

		}
		System.out.println("Select your secondary bet:\n(1) Greater or equal to 10\n(2) Less than 10\n(3) Two of a kind\n(4) Three of a kind");
		int guessMenu = inp2.nextInt();//gets the secondary guess
		
		System.out.println("\nStarting...");
		inp.nextLine();
		
		System.out.println("Press enter to roll");
		inp.nextLine();
		int one = (int) ((Math.random())*(6) +1);//prints a random between 1 and 6
		System.out.println("Your first number is: "+ one);//prints out the random number
		
		System.out.println("Press enter to roll");
		inp.nextLine();
		int two = (int) ((Math.random())*(6) +1);//prints a random between 1 and 6
		System.out.println("\nYour second number is: "+ two);//prints out the random number
		
		System.out.println("Press enter to roll");
		inp.nextLine();
		int three = (int) ((Math.random())*(6) +1);//prints a random between 1 and 6
		System.out.println("\nYour third number is: "+ three);//prints out the random number
		
		System.out.println("\nYour total sum is: " + (one + two + three));//prints out the sum
		
		int guessCheck = 5;//this variable determines if your secondary guess was correct
		
		if(guessMenu == 1) {//goes through the condition of the guess
			if((one + two + three) >= 10 ) {
				guessCheck = 1;//sets the check to the same number if its correct
			}
		}
		if(guessMenu == 2) {//goes through the condition of the guess
			if((one + two + three) < 10 ) {
				guessCheck = 2;//sets the check to the same number if its correct
			}
		}
		if(guessMenu == 3) {//goes through the condition of the guess
			if(one == two || one == three || two == three) {
				guessCheck = 3;//sets the check to the same number if its correct
			}
		}
		if(guessMenu == 4) {//goes through the condition of the guess
			if(one == two && one == three && two == three) {
				guessCheck = 4;//sets the check to the same number if its correct
			}
		}
		
		if (one + two + three == guessSum && guessCheck == guessMenu || guessCheck == 4){//if both guesses are correct you get the large prize
			System.out.println("Congratulations! You won the large prize of an iPod!");
			return 1;
			
		}
		else {
			
		}
			if(one + two + three == guessSum || guessCheck == guessMenu && guessCheck != 4) {//if one of the guesses were correct you get a small prize
				System.out.println("Congratulations! You won the small prize of a pair of earbuds!");
				return 2;
			}
			else {
				System.out.println("You didn't match anything! Please try again.");
		}
			return 0;		
	}
}