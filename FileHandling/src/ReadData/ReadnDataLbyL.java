package ReadData;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadnDataLbyL 
{
	public static void main(String[] args) throws IOException
	{
		File f=new File ("../FileHandling/govind.txt");
		FileReader fr=new FileReader(f);
		BufferedReader b=new BufferedReader(fr);
		String S;
		
		while ((S=b.readLine())!=null)
		{
			System.out.println(S);
		}
		
	}

}
