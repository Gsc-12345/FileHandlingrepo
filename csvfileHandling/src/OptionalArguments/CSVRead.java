package OptionalArguments;

public class CSVRead 
{
	public void method1(String...a) // String----data
	                                //Integer/Number-----number value
	                               //Object--------Data+Number
		{
		if(a.length==0)
		{
			System.out.println("working as a default");
		}
		else
		{
			System.out.println("working as a parameterized");
		}
		
	}
	public static void main(String[] args) 
	{
		CSVRead obj=new CSVRead();
		obj.method1();
		obj.method1("my");
		obj.method1("my","name");
		obj.method1("my","name","is","govind");
		
		
	}

}
