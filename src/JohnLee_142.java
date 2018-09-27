import java.util.* ;

public class JohnLee_142
{
	public static void main(String[] args)
	{
		Scanner inp = new Scanner(System.in) ;

		String first = ""; //first word
		String second = ""; //second word
		String third = ""; //third word

		System.out.println("Enter the first word");
		first = inp.nextLine();
		System.out.println("\nEnter the second word");
		second = inp.nextLine();
		System.out.println("\nEnter the last word");
		third = inp.nextLine();

		if (second.compareTo(first) > 0 && third.compareTo(first) > 0 && third.compareTo(second) > 0)
		{
			System.out.println("\n"+first + "," + second + "," + third) ;
		}

		if (first.compareTo(second) > 0 && third.compareTo(second) > 0 && third.compareTo(first) > 0)
		{
			System.out.println("\n"+second + "," + first + "," + third) ;
		}

		if (second.compareTo(third) > 0 && first.compareTo(second) > 0 && first.compareTo(third) > 0)
		{
			System.out.println("\n"+third + "," + second + "," + first) ;
		}

		if (third.compareTo(first) > 0 && second.compareTo(third) > 0 && second.compareTo(first) > 0)
		{
			System.out.println("\n"+ first + "," + third + "," + second) ;
		}

		if (first.compareTo(third) > 0 && second.compareTo(first) > 0 && second.compareTo(third) > 0)
		{
			System.out.println("\n"+ third + "," + first + "," + second) ;
		}

		if (first.compareTo(second) > 0 && first.compareTo(third) > 0 && third.compareTo(second) >0)
		{
			System.out.println("\n"+ second + "," + third + "," + first) ;
		}
	}
}
