package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo1 {
@Test
public void test1()
{
	Reporter.log("Tommorow Holiday",true);
}
@Test
public void test2()
{
	Reporter.log("Dayafter Tommorow Holiday",true);
}

}
