package AssetManagement;

import java.util.ArrayList;
import java.util.Scanner;
public class Assets 
{
	Scanner sc=new Scanner(System.in);
	ArrayList<Lenovo> leno=new ArrayList<Lenovo>();
	ArrayList<Dell> del=new ArrayList<Dell>();
	
	public int quantity()
	{
		int sum=0;
//		int total=del.size()+leno.size();
		int i=1;

		for(Dell de:del)
		{
			System.out.println(i+") "+de);
//			total_dCount += de.getQuantity();
			i++;
		}
		System.out.println("Total dell quantity: " +del.size());
		System.out.println();
		int j=1;
		for(Lenovo len: leno)
		{			
			System.out.println(j+") "+len);
			j++;
		}
//		sum=total_dCount+total_lCount;
		sum=del.size()+leno.size();
		return sum;
	}
	public int dCount()
	{
		int dCount=del.size();
		return dCount;
	}
	public int lCount()
	{
		int lCount=leno.size();
		return lCount;
	}
	int totalAsset()
	{
		int tAsset=leno.size()+del.size();
		return tAsset;
	}
	public void addDell(Dell ser)
	{
		del.add(ser);
	}
	public void addLenovo(Lenovo lenovo)
	{
		leno.add(lenovo);
	}
	public void delAsset(String asset)
	{
		System.out.println("1)laptop \n2)desktop");
		int choice=sc.nextInt();
		sc.nextLine();
		if(choice==1)
		{
			System.out.println("1)Dell \n2)lenovo");
			int select=sc.nextInt();
			sc.nextLine();
			if(select==1)
			{
				System.out.println("enter the serial number of laptop");
				String ser1=sc.nextLine();
				sc.nextLine();
				del.remove(ser1);
			}
			else
			{
				System.out.println("enter the serial number of laptop");
				String ser2=sc.nextLine();
				leno.remove(ser2);
			}
		}
	}	
}
