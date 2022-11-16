package ReadData;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ReadDataOverrideMultipleLine
{
	public static void main(String[] args) throws IOException
	{
		File f=new File("../FileHandling/govind1.txt");
		FileWriter fw=new FileWriter(f);
		fw.write("I am the Boss");
		fw.write("Boss is Great Man.");
		fw.close();
		
	}

}

