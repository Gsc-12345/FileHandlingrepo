package ReadData;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ReadDataOverrideExistingAndNewData 
{
	public static void main(String[] args) throws IOException
	{
		File f=new File("../FileHandling/govind1.txt");
		FileWriter fw=new FileWriter(f,true);
		BufferedWriter b=new BufferedWriter(fw);
		b.newLine();
		b.write("Mango Colour is Yellow");
		b.newLine();
		b.write("Mango is use for Mango Shake");
		b.close();
		
	}

}
