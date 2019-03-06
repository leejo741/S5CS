
public class johnRectangle 
{
	public static void main (String[] args)
	{
		rectangle a = new rectangle(5,7);
		System.out.println ("The length is: " + a.getLength() );
		System.out.println ("The width is: " + a.getWidth() );
		System.out.println ("The area is: " + a.getArea() );
		System.out.println ("The perimeter is: " + a.getPerimeter() );
		rectangle.displayAreaFormula();
	}


	
	
}

class rectangle
{
	private double length;
	
	private double width;
	
	public static void displayAreaFormula()
	{
		System.out.println("\nThe area of a rectangle is length*width.");
	}
	public rectangle(double length, double width)
	{
		this.length = length;
		this.width = width;
	}
	
	public double getLength()
	{
		return length;
	}
	
	public double getWidth()
	{
		return width;
	}
	
	public double getArea()
	{
		return (length*width);
	}
	
	public double getPerimeter()
	{
		return (2*(length) + 2*(width));
	}
}
