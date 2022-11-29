package csvfileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CSVFileReadwithoutComma
{
	public static void main(String[] args) throws Exception 
	{
		File f=new File("../csvfileHandling/csvfile.txt");
		FileReader fr=new FileReader(f);
		BufferedReader b=new BufferedReader(fr);
		String data;
		while((data=b.readLine())!=null)
		{
			String[] S1=data.split(",");
			for(int i=0;i<S1.length;i++)
			{
			System.out.println(S1[i]);
			}
		
	}
	}

}
