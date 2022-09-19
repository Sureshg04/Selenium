package Demo;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Test_Script1 extends Generic_Test1
{
  @Test
  public void ValidLogin()
  {
	  driver.findElement(By.id("username")).sendKeys("admin");
	  driver.findElement(By.name("pwd")).sendKeys("manager");
	  driver.findElement(By.xpath("//div[.='Login ']")).click();
	  String title = driver.getTitle();
	  System.out.println(title);
  }
}
