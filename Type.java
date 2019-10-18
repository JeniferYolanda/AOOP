public class ModelType extends Vehicle{

	private String ModelName;
	private int year;
	
	public ModelType(String Brand,int engineDisplacement,String ModelName,int year) 
	{
		super(Brand,engineDisplacement);
		
		this.ModelName = ModelName;
	}

	public String getModelName() 
	{
		return ModelName;
	}

	public void setModelName(String modelName) 
	{
		ModelName = modelName;
	}

	public int getYear() 
	{
		return year;
	}

	public void setYear(int year) 
	{
		this.year = year;
	}
}
