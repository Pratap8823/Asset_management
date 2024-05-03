package AssetManagement;

public class Dell 
{
	private String dModel;
	private String dSnumber;
	private int dQuantity;
	
	public Dell(String dModel,String dSnumber)
	{		
		this.dModel=dModel;
		this.dSnumber=dSnumber;
	}
	public Dell(int dQuantity)
	{
		this.dQuantity=dQuantity;
	}
	public String getSnumber() 
	{
		return dSnumber;
	}
	public String getModel()
	{
		return dModel;
	}
	public int getQuantity() 
	{
		return dQuantity;
	}
	public int dSno(int dSnumber)
	{
		int dTotal=++dSnumber;
		return dSnumber;
	}
	@Override
	public String toString()
	{
		return "Dell model: "+dModel+"\n"+"Serial number: "+dSnumber;
	}
}
