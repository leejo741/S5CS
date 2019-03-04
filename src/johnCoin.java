
public class johnCoin 
{

	public static void main (String[] args)
	{
		Coin nickel = new Coin();
		if (nickel.flipCoin() == 0) 
		{
			System.out.println("Heads up!");
		}
		else 
		{
			System.out.println("Tails up!");
		}
	}
}

class Coin
{
	
	private int faceup;
	
	public int flipCoin()
	{
			faceup = (int) (Math.random()*2);
			return faceup;
	}
}