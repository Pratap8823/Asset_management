package AssetManagement;

public class Lenovo 
{
	private String lModel;
	private String lSnumber;
	static private int lQuantity;
	public Lenovo(String lModel,String lSnumber)
	{
		this.lModel=lModel;
		this.lSnumber=lSnumber;
	}
	public String getlModel() 
	{
		return lModel;
	}
	public String getlSnumber() 
	{
		return lSnumber;
	}
	public int getlQuantity() 
	{
		return lQuantity;
	}
	public String toString()
	{
		return "model: "+lModel+"\n"+"Serial number: "+lSnumber+"\n"+"quantity: "+lQuantity;
	}
}
