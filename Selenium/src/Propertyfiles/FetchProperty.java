package Propertyfiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class FetchProperty 
{
	@Test
	public void State1() throws FileNotFoundException, IOException
	{
		Properties p=new Properties();
		p.load(new FileInputStream("./pro.properties"));
		String a1 = p.getProperty("baseurl");
		System.out.println(a1);
		
	}
}
