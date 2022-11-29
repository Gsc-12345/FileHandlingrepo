package csvfileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class csvFileReadfromExcel
{
	public static void main(String[] args) throws IOException
	{
		File f=new File("../csvfileHandling/src/csvfileHandling/CSC Read Excel 1.csv");
		FileReader fr=new FileReader(f);
		BufferedReader b=new BufferedReader(fr);
		String data;
		while((data=b.readLine())!=null)
		{
			System.out.println(data);
		}
		
	}

}
