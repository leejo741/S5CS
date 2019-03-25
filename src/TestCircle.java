public class TestCircle 
{
	public static void main (String[] args)
	{
		Circle spot = new Circle(5);
		Circle biggie = new Circle(100);
		System.out.println("spot\n");
		System.out.println("Circle Radius: " +spot.getRadius() );
		System.out.println("Circle Area: "+spot.area() );
		System.out.println("Circle Circumference: " +spot.circumference () );
		System.out.println("\nbiggie\n");
		System.out.println("Circle Radius: " +biggie.getRadius() );
		System.out.println("Circle Area: "+biggie.area() );
		System.out.println("Circle Circumference: " +biggie.circumference () );
		
		Circle.displayAreaFormula();
		
		Circle.displayCircumferenceFormula();
	}	
}

class Circle
{
	private static final double PI = 3.14;
	private double radius;
	
	public static void displayAreaFormula()
	{
		System.out.println("\nA circle's area is pi*radius^2");
			
	}
	
	public static void displayCircumferenceFormula()
	{
		System.out.println("A circle's circumference is 2*pi*radius");
			
	}
	
	public Circle(double size)
	{
		radius = size;
	}
	
	public double getRadius()
	{
		return radius;
	}

	public double area()
	{
		return (PI*(radius)*(radius));
	}
	
	public double circumference()
	{
		return(2*PI*radius);
	}
	
	
	
	
}
