package TestNG;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class phptestNG {
	WebDriver driver;
  @BeforeClass
  public void launch() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver =  new ChromeDriver();
		driver.manage().window().maximize();
  }
  @Test
  public void Test() { 
      driver.get("http://34.68.154.135/content/about-us.php");
      //driver.findElement(By.xpath("//a[@href='http://34.68.154.135/content/about-us.php']")).click();
      if(driver.getPageSource().contains("Lorem Ipsum Dipsum"))
      {
      	System.out.println("Text Present");
      }
      else
      {
      System.out.println("Text not Present");
      }
  }
  @AfterClass
  public void afterClass() throws InterruptedException {
	 driver.get("http://34.68.154.135/");
     Thread.sleep(5000);
	 driver.close();
  }
}
