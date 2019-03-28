import java.util.*;

public class LunchOrder 
{
	public static void main(String[] args)
	{
		Scanner inp = new Scanner(System.in);
		
		int countHam;
		int countSal;
		int countFrench;
		int countSod;
		
		food hamburger = new food(1.85, 9, 33, 1);
		food salad = new food(2, 1, 11, 5);
		food frenchFries = new food(1.3, 11, 36, 4);
		food soda = new food(0.95, 0, 38, 0);
		
		System.out.print("Enter number of hamburgers: ");
		countHam = inp.nextInt();
		System.out.println("Each hamburger has " + hamburger.getFat() + "g of fat, " + hamburger.getCarbs()+ "g of carbs, and " + hamburger.getFiber() + "g of fiber." );
		
		System.out.print("\nEnter number of salads: ");
		countSal = inp.nextInt();
		System.out.println("Each salad has " + salad.getFat() + "g of fat, " + salad.getCarbs()+ "g of carbs, and " + salad.getFiber() + "g of fiber." );
		
		System.out.print("\nEnter number of french fries: ");
		countFrench = inp.nextInt();
		System.out.println("Each order of french fries have " + frenchFries.getFat() + "g of fat, " + frenchFries.getCarbs()+ "g of carbs, and " + frenchFries.getFiber() + "g of fiber." );
		
		System.out.print("\nEnter number of sodas: ");
		countSod = inp.nextInt();
		System.out.println("Each soda has " + soda.getFat() + "g of fat, " + soda.getCarbs()+ "g of carbs, and " + soda.getFiber() + "g of fiber." );
		
		System.out.println("\nYour total comes to: $" + ((countHam*hamburger.getPrice()) + (countSal*salad.getPrice()) + (countFrench*frenchFries.getPrice()) + (countSod*soda.getPrice())));
		
	}
}

class food
{
	private double price;
	private double fat;
	private double carbs;
	private double fiber;
	
	public food(double Price, double Fat, double Carbs, double Fiber)
	{
		price = Price;
		fat = Fat;
		carbs = Carbs;
		fiber = Fiber;
	}
	
	public double getPrice()
	{
		return price;
	}
	
	public double getFat()
	{
		return fat;
	}
	
	public double getCarbs()
	{
		return carbs;
	}
	
	public double getFiber()
	{
		return fiber;
	}
}