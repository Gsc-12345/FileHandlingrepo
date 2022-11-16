package ReadData;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ReadDataOverrideLineByLine
{
	public static void main(String[] args) throws IOException 
	{
		File f=new File("../FileHandling/govind1.txt");
		FileWriter fw=new FileWriter(f);
		BufferedWriter b=new BufferedWriter(fw);
		b.write("I Like Mango");
		b.newLine();
		b.write("Mango is very Tasty Fruit");
		b.close();
		
		
	}

}
