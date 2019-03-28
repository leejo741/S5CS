import java.util.*;

public class LunchOrder 
{
	public static void main(String[] args)
	{
		Scanner inp = new Scanner(System.in);
		
		int countHam; //starts counters for the different foods so that we know how many of each the user will get for the price at the end
		int countSal;
		int countFrench;
		int countSod;
		
		food hamburger = new food(1.85, 9, 33, 1);// sets up the values for the nutritional data for each object, this will be used in the constructor method
		food salad = new food(2, 1, 11, 5);
		food frenchFries = new food(1.3, 11, 36, 4);
		food soda = new food(0.95, 0, 38, 0);
		
		System.out.print("Enter number of hamburgers: ");
		countHam = inp.nextInt(); //retains number of food item to be used for calculating price
		System.out.println("Each hamburger has " + hamburger.getFat() + "g of fat, " + hamburger.getCarbs()+ 
							"g of carbs, and " + hamburger.getFiber() + "g of fiber." );//displays the nutritional information of the food by calling different accesor methods
		
		System.out.print("\nEnter number of salads: ");
		countSal = inp.nextInt();//retains number of food item to be used for calculating price
		System.out.println("Each salad has " + salad.getFat() + "g of fat, " + salad.getCarbs()+ 
							"g of carbs, and " + salad.getFiber() + "g of fiber." );//displays the nutritional information of the food by calling different accesor methods
		
		System.out.print("\nEnter number of french fries: ");
		countFrench = inp.nextInt();//retains number of food item to be used for calculating price
		System.out.println("Each order of french fries have " + frenchFries.getFat() + "g of fat, " + 
							frenchFries.getCarbs()+ "g of carbs, and " + frenchFries.getFiber() + "g of fiber." );//displays the nutritional information of the food by calling different accesor methods
		
		System.out.print("\nEnter number of sodas: ");
		countSod = inp.nextInt();//retains number of food item to be used for calculating price
		System.out.println("Each soda has " + soda.getFat() + "g of fat, " + soda.getCarbs()+ 
							"g of carbs, and " + soda.getFiber() + "g of fiber." );//displays the nutritional information of the food by calling different accesor methods
		
		System.out.println("\nYour total comes to: $" + ((countHam*hamburger.getPrice()) + (countSal*salad.getPrice()) + 
							(countFrench*frenchFries.getPrice()) + (countSod*soda.getPrice()))); //multiplies each food by the amount bought and the price from the accesor method
		
	}
}

class food
{
	private double price; //sets up private doubles for the food data
	private double fat;
	private double carbs;
	private double fiber;
	
	public food(double Price, double Fat, double Carbs, double Fiber) //constructor method for assigning food data to each object
	{
		price = Price;
		fat = Fat;
		carbs = Carbs;
		fiber = Fiber;
	}
	
	public double getPrice() //accessor method for getting price
	{
		return price;
	}
	
	public double getFat()//accessor method for getting fat
	{
		return fat;
	}
	
	public double getCarbs()//accessor method for getting carbs
	{
		return carbs;
	}
	
	public double getFiber()//accessor method for getting fiber
	{
		return fiber;
	}
}