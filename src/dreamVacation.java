
public class dreamVacation 
{

}

class vacation
{
	private String locationName;
	private double cost;
	
	public vacation()
	{
		locationName = "Thailand";
		cost = 1025.75;
	}
	
	public vacation( String LocationName, double Cost)
	{
		locationName = LocationName;
		cost = Cost;
	}
	
	public String getLocationName()
	{
		return locationName;
	}
	public double getCost()
	{
		return cost;
	}
	
	public void changeLocationName(String LocationName)
	{
		locationName = LocationName;
	}
	public void changeCost(double Cost)
	{
		cost = Cost;
	}
}