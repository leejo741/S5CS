
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
			System.out.println( choice + " " + list[choice]);
			stopFlag = true ;
		}
	}
	
	public static int menu(String title, String[] items)
	{
		int choice = -1;
		return choice ;
	}
}
