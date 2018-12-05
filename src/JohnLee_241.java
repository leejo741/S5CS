import java.util.* ;
public class JohnLee_241 
{
	public static void main(String[] args)
	{
		String name = "Programs: " ;
		
		String[] list = new String[] {"Bubble Sort" , "Selection Sort" , "Insertion Sort" , "Bogo Sort" , "Enter -1 to Exit"} ;
		
		boolean stopFlag = false ;
		while( stopFlag == false)	
		{
			int choice = menu( name, list);
			System.out.println( "\n\n" + (choice + 1) + "." + " " + list[choice]);
			stopFlag = true ;
		}
	}
	
	public static int menu(String title, String[] items)
	{
		int choice = -1;
		Scanner kbd = new Scanner( System.in ) ;
		System.out.println("\n\n" + title) ;
		System.out.println("=========================") ;
		for ( int i = 0; i< items.length; i++)
		{
			System.out.println((i +1) + ". " + items[i]);
		}
		System.out.println("Enter an item number ->") ;
		
		choice = kbd.nextInt();
		return (choice - 1) ;
	}
}
