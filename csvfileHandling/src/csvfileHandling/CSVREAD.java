package csvfileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CSVREAD 
{
	public static void main(String[] args) throws Exception
	{
		File f=new File("../csvfileHandling/csvfile.txt");
		FileReader fr=new FileReader(f);
		BufferedReader b=new BufferedReader(fr);
		String data;
		while((data=b.readLine())!=null)
		{
			System.out.println(data);
		}
		
	}

}
