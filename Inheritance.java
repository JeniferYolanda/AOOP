public class Vehicle {

	private String Brand; 
	private int EngineDisplacement;
	
	public Vehicle(String brand, int engineDisplacement)
	{
		super();
		this.Brand = brand;
		this.EngineDisplacement = engineDisplacement;
	}

	public String getBrand() 
	{
		return Brand;
	}

	public void setBrand(String brand) 
	{
		this.Brand = brand;
	}

	public int getMachineType() 
	{
		return EngineDisplacement;
	}

	public void setMachineType(int engineDisplacement) 
	{
		EngineDisplacement = engineDisplacement;
	}	
}
