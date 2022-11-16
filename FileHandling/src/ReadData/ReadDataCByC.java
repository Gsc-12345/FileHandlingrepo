package ReadData;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadDataCByC 
{
	public static void main(String[] args) throws IOException
	{
		File f=new File("../FileHandling/govind.txt");
		FileReader fr=new FileReader(f);
		int a;
		while((a=fr.read())!=-1)
				{
			System.out.println((char)a);
				}
		
		
	}

}
