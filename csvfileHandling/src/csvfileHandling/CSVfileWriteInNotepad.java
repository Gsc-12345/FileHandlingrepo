package csvfileHandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CSVfileWriteInNotepad 
{
	public static void main(String[] args) throws Exception 
	{
		File f=new File("../csvfileHandling/csvfile1.txt");  //for Excel /csvfileHandling/src/csvfileHandling/CSC Read Excel21.csv
		FileWriter fw=new FileWriter(f);
		BufferedWriter b=new BufferedWriter(fw);
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				b.write("deepak");
				b.write(",");
			}
			b.newLine();
		}
		b.close();
		
	}

}
