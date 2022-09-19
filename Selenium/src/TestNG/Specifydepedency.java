package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Specifydepedency 
{
	@Test
	public void Compose()
	{
		Reporter.log("Compose", true);
	}
	@Test(dependsOnMethods = "Compose")
	public void Sentitems()
	{
		Reporter.log("Sentitems", true);
	}
	@Test(dependsOnMethods = "Sentitems")
	public void Trash()
	{
		Reporter.log("Trash", true);
	}
}
